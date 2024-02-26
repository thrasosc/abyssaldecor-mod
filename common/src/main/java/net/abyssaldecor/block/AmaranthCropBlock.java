package net.abyssaldecor.block;

import net.abyssaldecor.registry.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.PitcherCropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class AmaranthCropBlock extends DoublePlantBlock implements BonemealableBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    private static final VoxelShape COLLISION_SHAPE_BULB = Block.box(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
    private static final VoxelShape COLLISION_SHAPE_CROP = Block.box(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
    private static final VoxelShape FULL_UPPER_SHAPE = Block.box(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
    private static final VoxelShape FULL_LOWER_SHAPE = Block.box(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
    private static final VoxelShape[] UPPER_SHAPE_BY_AGE = new VoxelShape[]{Block.box(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), FULL_UPPER_SHAPE};
    private static final VoxelShape[] LOWER_SHAPE_BY_AGE = new VoxelShape[]{COLLISION_SHAPE_BULB, Block.box(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), FULL_LOWER_SHAPE, FULL_LOWER_SHAPE, FULL_LOWER_SHAPE};
    public static final int MAX_AGE = 3;

    public AmaranthCropBlock(Properties properties) {
        super(properties);
    }

    private boolean isMaxAge(BlockState blockState) {
        return blockState.getValue(AGE) >= 3;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        if (blockState.getValue(AGE) == 0) {
            return COLLISION_SHAPE_BULB;
        }
        if (blockState.getValue(HALF) == DoubleBlockHalf.LOWER) {
            return COLLISION_SHAPE_CROP;
        }
        return super.getCollisionShape(blockState, blockGetter, blockPos, collisionContext);
    }

    private static boolean sufficientLight(LevelReader levelReader, BlockPos blockPos) {
        return levelReader.getRawBrightness(blockPos, 0) >= 8 || levelReader.canSeeSky(blockPos);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return blockState.getValue(HALF) == DoubleBlockHalf.UPPER ? UPPER_SHAPE_BY_AGE[Math.min(Math.abs(4 - (blockState.getValue(AGE) + 1)), UPPER_SHAPE_BY_AGE.length - 1)] : LOWER_SHAPE_BY_AGE[blockState.getValue(AGE)];
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
        super.createBlockStateDefinition(builder);
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        if (isLower(blockState)) {
            return this.mayPlaceOn(levelReader.getBlockState(blockPos.below()), levelReader, blockPos.below()) && sufficientLight(levelReader, blockPos) && (blockState.getValue(AGE) < 3 || isUpper(levelReader.getBlockState(blockPos.above())));
        }
        return super.canSurvive(blockState, levelReader, blockPos);
    }

    @Override
    public boolean isRandomlyTicking(BlockState blockState) {
        return blockState.getValue(HALF) == DoubleBlockHalf.LOWER && !this.isMaxAge(blockState);
    }

    private boolean canGrow(LevelReader levelReader, BlockPos blockPos, BlockState blockState, int i) {
        return !this.isMaxAge(blockState);
    }

    private static boolean isLower(BlockState blockState) {
        return blockState.is(BlockRegistry.AMARANTH_BLOCK.get()) && blockState.getValue(HALF) == DoubleBlockHalf.LOWER;
    }

    private static boolean isUpper(BlockState blockState) {
        return blockState.is(BlockRegistry.AMARANTH_BLOCK.get()) && blockState.getValue(HALF) == DoubleBlockHalf.UPPER;
    }


    @Nullable
    private PosAndState getLowerHalf(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        if (isLower(blockState)) {
            return new PosAndState(blockPos, blockState);
        }
        BlockPos blockPos2 = blockPos.below();
        BlockState blockState2 = levelReader.getBlockState(blockPos2);
        if (isLower(blockState2)) {
            return new PosAndState(blockPos2, blockState2);
        }
        return null;
    }

    private void grow(ServerLevel serverLevel, BlockState blockState, BlockPos blockPos, int i) {
        int j = Math.min(blockState.getValue(AGE) + i, 3);
        if (!this.canGrow(serverLevel, blockPos, blockState, j)) {
            return;
        }
        serverLevel.setBlock(blockPos, (BlockState)blockState.setValue(AGE, j), 2);
        if (j >= 2) {
            BlockPos blockPos2 = blockPos.above();
            serverLevel.setBlock(blockPos2, PitcherCropBlock.copyWaterloggedFrom(serverLevel, blockPos, (BlockState)((BlockState)this.defaultBlockState().setValue(AGE, j)).setValue(HALF, DoubleBlockHalf.UPPER)), 3);
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader levelReader, BlockPos blockPos, BlockState blockState, boolean bl) {
        PosAndState posAndState = this.getLowerHalf(levelReader, blockPos, blockState);
        if (posAndState == null) {
            return false;
        }
        return this.canGrow(levelReader, posAndState.pos, posAndState.state, posAndState.state.getValue(AGE) + 1);
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel serverLevel, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
        PosAndState posAndState = this.getLowerHalf(serverLevel, blockPos, blockState);
        if (posAndState == null) {
            return;
        }
        this.grow(serverLevel, posAndState.state, posAndState.pos, 1);
    }

    record PosAndState(BlockPos pos, BlockState state) {
    }
}
