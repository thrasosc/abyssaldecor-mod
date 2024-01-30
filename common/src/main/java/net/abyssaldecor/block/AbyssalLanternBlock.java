package net.abyssaldecor.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class AbyssalLanternBlock extends RedstoneLampBlock {
    public AbyssalLanternBlock(Properties properties) {
        super(properties);
    }

    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (interactionHand == InteractionHand.MAIN_HAND && player.getItemInHand(interactionHand).isEmpty()) {
            boolean b = (boolean) blockState.getValue(LIT);
            this.defaultBlockState().setValue(LIT, !b);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
