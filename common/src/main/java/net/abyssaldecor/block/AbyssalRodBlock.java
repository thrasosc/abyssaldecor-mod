package net.abyssaldecor.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.block.state.BlockState;

public class AbyssalRodBlock extends EndRodBlock {
    public AbyssalRodBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
//        Direction direction = (Direction)blockState.getValue(FACING);
//        double d = (double)blockPos.getX() + 0.55 - (double)(randomSource.nextFloat() * 0.1F);
//        double e = (double)blockPos.getY() + 0.55 - (double)(randomSource.nextFloat() * 0.1F);
//        double f = (double)blockPos.getZ() + 0.55 - (double)(randomSource.nextFloat() * 0.1F);
//        double g = (double)(0.4F - (randomSource.nextFloat() + randomSource.nextFloat()) * 0.4F);
//        if (randomSource.nextInt(5) == 0) {
//            level.addParticle(ParticleTypes.DUST_COLOR_TRANSITION, d + (double)direction.getStepX() * g, e + (double)direction.getStepY() * g, f + (double)direction.getStepZ() * g, randomSource.nextGaussian() * 0.005, randomSource.nextGaussian() * 0.005, randomSource.nextGaussian() * 0.005);
//        }
    }
}
