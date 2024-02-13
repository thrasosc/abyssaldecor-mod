package net.abyssaldecor.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.abyssaldecor.block.AbyssalLanternBlock;
import net.abyssaldecor.block.AbyssalRodBlock;
import net.abyssaldecor.block.AmaranthCropBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemGroupRegistry.ABYSSALDECOR_TAB;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Block> ABYSSAL_LANTERN_BLOCK = BLOCKS.register("abyssal_lantern", () -> new AbyssalLanternBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistrySupplier<BlockItem> ABYSSAL_LANTERN_ITEM = BLOCK_ITEMS.register(ABYSSAL_LANTERN_BLOCK.getId(), () -> new BlockItem(ABYSSAL_LANTERN_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> AMARANTH_CRATE_BLOCK = BLOCKS.register("amaranth_crate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)));
    public static final RegistrySupplier<BlockItem> AMARANTH_CRATE_ITEM = BLOCK_ITEMS.register(AMARANTH_CRATE_BLOCK.getId(), () -> new BlockItem(AMARANTH_CRATE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> AMMONITE_BLOCK = BLOCKS.register("ammonite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<BlockItem> AMMONITE_ITEM = BLOCK_ITEMS.register(AMMONITE_BLOCK.getId(), () -> new BlockItem(AMMONITE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> YELLOW_WALLPAPER_BLOCK = BLOCKS.register("yellow_wallpaper", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistrySupplier<BlockItem> YELLOW_WALLPAPER_ITEM = BLOCK_ITEMS.register(YELLOW_WALLPAPER_BLOCK.getId(), () -> new BlockItem(YELLOW_WALLPAPER_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> SOLAR_ROD_BLOCK = BLOCKS.register("solar_rod", () -> new AbyssalRodBlock(BlockBehaviour.Properties.copy(Blocks.END_ROD)));
    public static final RegistrySupplier<BlockItem> SOLAR_ROD_ITEM = BLOCK_ITEMS.register(SOLAR_ROD_BLOCK.getId(), () -> new BlockItem(SOLAR_ROD_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> TERRESTRIAL_ROD_BLOCK = BLOCKS.register("terrestrial_rod", () -> new AbyssalRodBlock(BlockBehaviour.Properties.copy(Blocks.END_ROD)));
    public static final RegistrySupplier<BlockItem> TERRESTRIAL_ROD_ITEM = BLOCK_ITEMS.register(TERRESTRIAL_ROD_BLOCK.getId(), () -> new BlockItem(TERRESTRIAL_ROD_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> LUNAR_ROD_BLOCK = BLOCKS.register("lunar_rod", () -> new AbyssalRodBlock(BlockBehaviour.Properties.copy(Blocks.END_ROD)));
    public static final RegistrySupplier<BlockItem> LUNAR_ROD_ITEM = BLOCK_ITEMS.register(LUNAR_ROD_BLOCK.getId(), () -> new BlockItem(LUNAR_ROD_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> ETHEREAL_ROD_BLOCK = BLOCKS.register("ethereal_rod", () -> new AbyssalRodBlock(BlockBehaviour.Properties.copy(Blocks.END_ROD)));
    public static final RegistrySupplier<BlockItem> ETHEREAL_ROD_ITEM = BLOCK_ITEMS.register(ETHEREAL_ROD_BLOCK.getId(), () -> new BlockItem(ETHEREAL_ROD_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> STELLAR_ROD_BLOCK = BLOCKS.register("stellar_rod", () -> new AbyssalRodBlock(BlockBehaviour.Properties.copy(Blocks.END_ROD)));
    public static final RegistrySupplier<BlockItem> STELLAR_ROD_ITEM = BLOCK_ITEMS.register(STELLAR_ROD_BLOCK.getId(), () -> new BlockItem(STELLAR_ROD_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> DAFFODIL_BLOCK = BLOCKS.register("daffodil", () -> new FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistrySupplier<BlockItem> DAFFODIL_ITEM = BLOCK_ITEMS.register(DAFFODIL_BLOCK.getId(), () -> new BlockItem(DAFFODIL_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> ASTER_BLOCK = BLOCKS.register("aster", () -> new FlowerBlock(MobEffects.NIGHT_VISION, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistrySupplier<BlockItem> ASTER_ITEM = BLOCK_ITEMS.register(ASTER_BLOCK.getId(), () -> new BlockItem(ASTER_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> AMARANTH_BLOCK = BLOCKS.register("amaranth", () -> new AmaranthCropBlock(BlockBehaviour.Properties.copy(Blocks.PITCHER_CROP)));
    public static final RegistrySupplier<BlockItem> AMARANTH_SEEDS_ITEM = BLOCK_ITEMS.register("amaranth_seeds", () -> new ItemNameBlockItem(AMARANTH_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> BLACK_PEARL_BRICK_SLAB_BLOCK = BLOCKS.register("black_pearl_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistrySupplier<BlockItem> BLACK_PEARL_BRICK_SLAB_ITEM = BLOCK_ITEMS.register(BLACK_PEARL_BRICK_SLAB_BLOCK.getId(), () -> new BlockItem(BLACK_PEARL_BRICK_SLAB_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> BLACK_PEARL_BRICKS_BLOCK = BLOCKS.register("black_pearl_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<BlockItem> BLACK_PEARL_BRICKS_ITEM = BLOCK_ITEMS.register(BLACK_PEARL_BRICKS_BLOCK.getId(), () -> new BlockItem(BLACK_PEARL_BRICKS_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> BLACKWOOD_DOOR_BLOCK = BLOCKS.register("blackwood_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
    public static final RegistrySupplier<BlockItem> BLACKWOOD_DOOR_ITEM = BLOCK_ITEMS.register(BLACKWOOD_DOOR_BLOCK.getId(), () -> new BlockItem(BLACKWOOD_DOOR_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> ANCIENT_BIRCH_LOG_BLOCK = BLOCKS.register("ancient_birch_log", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistrySupplier<BlockItem> ANCIENT_BIRCH_LOG_ITEM = BLOCK_ITEMS.register(ANCIENT_BIRCH_LOG_BLOCK.getId(), () -> new BlockItem(ANCIENT_BIRCH_LOG_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> SCRIMSHAW_BLOCK = BLOCKS.register("scrimshaw_cave", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<BlockItem> SCRIMSHAW_ITEM = BLOCK_ITEMS.register(SCRIMSHAW_BLOCK.getId(), () -> new BlockItem(SCRIMSHAW_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static void init() {
        BLOCKS.register();
        BLOCK_ITEMS.register();
    }
}
