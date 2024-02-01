package net.abyssaldecor.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.abyssaldecor.block.AbyssalLanternBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemGroupRegistry.ABYSSALDECOR_TAB;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Block> ABYSSAL_LANTERN_BLOCK = BLOCKS.register("abyssal_lantern", () -> new AbyssalLanternBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistrySupplier<BlockItem> ABYSSAL_LANTERN_ITEM = BLOCK_ITEMS.register(ABYSSAL_LANTERN_BLOCK.getId(), () -> new BlockItem(ABYSSAL_LANTERN_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> AMARANTH_CRATE_BLOCK = BLOCKS.register("amaranth_crate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)));
    public static final RegistrySupplier<BlockItem> AMARANTH_CRATE_ITEM = BLOCK_ITEMS.register(AMARANTH_CRATE_BLOCK.getId(), () -> new BlockItem(AMARANTH_CRATE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static void init() {
        BLOCKS.register();
        BLOCK_ITEMS.register();
    }
}
