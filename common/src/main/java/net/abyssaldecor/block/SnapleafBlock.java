package net.abyssaldecor.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SnapleafBlock extends FlowerBlock {
    private final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 5, 16);

    public SnapleafBlock(MobEffect mobEffect, int i, Properties properties) {
        super(mobEffect, i, properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
