package net.abyssaldecor.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.abyssaldecor.block.AbyssalLanternBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemGroupRegistry.ABYSSALDECOR_TAB;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    //TODO fix item texture of abyssal lantern, also something is causing crashes on Forge
    public static final RegistrySupplier<Block> ABYSSAL_LANTERN = registerBlockWithItem(
            "abyssal_lantern", new AbyssalLanternBlock(BlockBehaviour.Properties.of().lightLevel(l -> 15))
    );
    private static RegistrySupplier<Block> registerBlockWithItem(String name, Block block) {
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block, new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
        return BLOCKS.register(name, () -> block);
    }

    public static void init() {
        BLOCKS.register();
    }
}
