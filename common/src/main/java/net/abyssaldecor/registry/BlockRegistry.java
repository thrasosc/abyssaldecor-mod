package net.abyssaldecor.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.abyssaldecor.block.*;
import net.abyssaldecor.block.abstraction.LampBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemGroupRegistry.ABYSSALDECOR_TAB;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Block> ABYSSAL_LANTERN_BLOCK = BLOCKS.register("abyssal_lantern", () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)));
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

    public static final RegistrySupplier<Block> ANCIENT_BIRCH_LOG_BLOCK = BLOCKS.register("ancient_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.SAND : MapColor.QUARTZ).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistrySupplier<BlockItem> ANCIENT_BIRCH_LOG_ITEM = BLOCK_ITEMS.register(ANCIENT_BIRCH_LOG_BLOCK.getId(), () -> new BlockItem(ANCIENT_BIRCH_LOG_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> STRIPPED_ANCIENT_BIRCH_LOG_BLOCK = BLOCKS.register("stripped_ancient_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.SAND : MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistrySupplier<BlockItem> STRIPPED_ANCIENT_BIRCH_LOG_ITEM = BLOCK_ITEMS.register(STRIPPED_ANCIENT_BIRCH_LOG_BLOCK.getId(), () -> new BlockItem(STRIPPED_ANCIENT_BIRCH_LOG_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> SCRIMSHAW_BLOCK = BLOCKS.register("scrimshaw_cave", () -> new ScrimshawBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<BlockItem> SCRIMSHAW_ITEM = BLOCK_ITEMS.register(SCRIMSHAW_BLOCK.getId(), () -> new BlockItem(SCRIMSHAW_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> SCRIMSHAW_ALTAR_BLOCK = BLOCKS.register("scrimshaw_altar", () -> new ScrimshawAltarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<BlockItem> SCRIMSHAW_ALTAR_ITEM = BLOCK_ITEMS.register(SCRIMSHAW_ALTAR_BLOCK.getId(), () -> new BlockItem(SCRIMSHAW_ALTAR_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> PRISMARINE_CRYSTAL_BLOCK = BLOCKS.register("block_of_prismarine_crystal", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> PRISMARINE_CRYSTAL_ITEM = BLOCK_ITEMS.register(PRISMARINE_CRYSTAL_BLOCK.getId(), () -> new BlockItem(PRISMARINE_CRYSTAL_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> PRISMARINE_CRYSTAL_PANE_BLOCK = BLOCKS.register("prismarine_crystal_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> PRISMARINE_CRYSTAL_PANE_ITEM = BLOCK_ITEMS.register(PRISMARINE_CRYSTAL_PANE_BLOCK.getId(), () -> new BlockItem(PRISMARINE_CRYSTAL_PANE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> VERMILLION_BLOCK = BLOCKS.register("vermillion_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> VERMILLION_ITEM = BLOCK_ITEMS.register(VERMILLION_BLOCK.getId(), () -> new BlockItem(VERMILLION_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> VERMILLION_PANE_BLOCK = BLOCKS.register("vermillion_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> VERMILLION_PANE_ITEM = BLOCK_ITEMS.register(VERMILLION_PANE_BLOCK.getId(), () -> new BlockItem(VERMILLION_PANE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> FRAMED_VERMILLION_BLOCK = BLOCKS.register("framed_vermillion_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> FRAMED_VERMILLION_ITEM = BLOCK_ITEMS.register(FRAMED_VERMILLION_BLOCK.getId(), () -> new BlockItem(FRAMED_VERMILLION_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> FRAMED_VERMILLION_PANE_BLOCK = BLOCKS.register("framed_vermillion_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> FRAMED_VERMILLION_PANE_ITEM = BLOCK_ITEMS.register(FRAMED_VERMILLION_PANE_BLOCK.getId(), () -> new BlockItem(FRAMED_VERMILLION_PANE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> FRESNEL_BLOCK = BLOCKS.register("fresnel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> FRESNEL_ITEM = BLOCK_ITEMS.register(FRESNEL_BLOCK.getId(), () -> new BlockItem(FRESNEL_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> FRESNEL_PANE_BLOCK = BLOCKS.register("fresnel_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> FRESNEL_PANE_ITEM = BLOCK_ITEMS.register(FRESNEL_PANE_BLOCK.getId(), () -> new BlockItem(FRESNEL_PANE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> CRYSTALIZED_GLOWSTONE_BLOCK = BLOCKS.register("crystalized_glowstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)));
    public static final RegistrySupplier<BlockItem> CRYSTALIZED_GLOWSTONE_ITEM = BLOCK_ITEMS.register(CRYSTALIZED_GLOWSTONE_BLOCK.getId(), () -> new BlockItem(CRYSTALIZED_GLOWSTONE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> CRYSTALIZED_GLOWSTONE_PANE_BLOCK = BLOCKS.register("crystalized_glowstone_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> CRYSTALIZED_GLOWSTONE_PANE_ITEM = BLOCK_ITEMS.register(CRYSTALIZED_GLOWSTONE_PANE_BLOCK.getId(), () -> new BlockItem(CRYSTALIZED_GLOWSTONE_PANE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> FRAMED_CRYSTALIZED_GLOWSTONE_BLOCK = BLOCKS.register("framed_crystalized_glowstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)));
    public static final RegistrySupplier<BlockItem> FRAMED_CRYSTALIZED_GLOWSTONE_ITEM = BLOCK_ITEMS.register(FRAMED_CRYSTALIZED_GLOWSTONE_BLOCK.getId(), () -> new BlockItem(FRAMED_CRYSTALIZED_GLOWSTONE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> FRAMED_CRYSTALIZED_GLOWSTONE_PANE_BLOCK = BLOCKS.register("framed_crystalized_glowstone_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> FRAMED_CRYSTALIZED_GLOWSTONE_PANE_ITEM = BLOCK_ITEMS.register(FRAMED_CRYSTALIZED_GLOWSTONE_PANE_BLOCK.getId(), () -> new BlockItem(FRAMED_CRYSTALIZED_GLOWSTONE_PANE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> SUNNY_PEARLY_GLASS_BLOCK = BLOCKS.register("pearly_glass_block_sunny", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> SUNNY_PEARLY_GLASS_ITEM = BLOCK_ITEMS.register(SUNNY_PEARLY_GLASS_BLOCK.getId(), () -> new BlockItem(SUNNY_PEARLY_GLASS_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> AZURE_PEARLY_GLASS_BLOCK = BLOCKS.register("pearly_glass_block_azure", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> AZURE_PEARLY_GLASS_ITEM = BLOCK_ITEMS.register(AZURE_PEARLY_GLASS_BLOCK.getId(), () -> new BlockItem(AZURE_PEARLY_GLASS_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> VERDANT_PEARLY_GLASS_BLOCK = BLOCKS.register("pearly_glass_block_verdant", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> VERDANT_PEARLY_GLASS_ITEM = BLOCK_ITEMS.register(VERDANT_PEARLY_GLASS_BLOCK.getId(), () -> new BlockItem(VERDANT_PEARLY_GLASS_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> WHITEWOOD_PEARLY_GLASS_BLOCK = BLOCKS.register("pearly_glass_block_whitewood", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> WHITEWOOD_PEARLY_GLASS_ITEM = BLOCK_ITEMS.register(WHITEWOOD_PEARLY_GLASS_BLOCK.getId(), () -> new BlockItem(WHITEWOOD_PEARLY_GLASS_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> BLACKWOOD_PEARLY_GLASS_BLOCK = BLOCKS.register("pearly_glass_block_blackwood", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistrySupplier<BlockItem> BLACKWOOD_PEARLY_GLASS_ITEM = BLOCK_ITEMS.register(BLACKWOOD_PEARLY_GLASS_BLOCK.getId(), () -> new BlockItem(BLACKWOOD_PEARLY_GLASS_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> SNAPLEAF_BLOCK = BLOCKS.register("snapleaf", () -> new SnapleafBlock(MobEffects.HARM, 5, BlockBehaviour.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).instabreak().noCollission().pushReaction(PushReaction.DESTROY)));
    public static final RegistrySupplier<BlockItem> SNAPLEAF_ITEM = BLOCK_ITEMS.register(SNAPLEAF_BLOCK.getId(), () -> new BlockItem(SNAPLEAF_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> STARLIGHT_BLOCK = BLOCKS.register("starlight", () -> new StarlightBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.AMETHYST_CLUSTER).strength(1f).lightLevel(s -> 12).noCollission().noOcclusion().hasPostProcess((bs, br, bp) -> true)));
    public static final RegistrySupplier<BlockItem> STARLIGHT_ITEM = BLOCK_ITEMS.register(STARLIGHT_BLOCK.getId(), () -> new BlockItem(STARLIGHT_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> BARK_ORCHID_BLOCK = BLOCKS.register("bark_orchid", () -> new BarkOrchidBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.GRASS).instabreak().noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> BARK_ORCHID_ITEM = BLOCK_ITEMS.register(BARK_ORCHID_BLOCK.getId(), () -> new BlockItem(BARK_ORCHID_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> LIFE_PRESERVER_BLOCK = BLOCKS.register("life_preserver", () -> new LifePreserverBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOL).strength(0f, 1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> LIFE_PRESERVER_ITEM = BLOCK_ITEMS.register(LIFE_PRESERVER_BLOCK.getId(), () -> new BlockItem(LIFE_PRESERVER_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> MUCKROOT_BLOCK = BLOCKS.register("muckroot", () -> new MuckrootBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).sound(SoundType.GRASS).instabreak().noCollission().noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> MUCKROOT_ITEM = BLOCK_ITEMS.register(MUCKROOT_BLOCK.getId(), () -> new BlockItem(MUCKROOT_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> MUCKROOT_2_BLOCK = BLOCKS.register("muckroot_2", () -> new Muckroot2Block(BlockBehaviour.Properties.copy(Blocks.CARROTS).sound(SoundType.GRASS).instabreak().noCollission().noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> MUCKROOT_2_ITEM = BLOCK_ITEMS.register(MUCKROOT_2_BLOCK.getId(), () -> new BlockItem(MUCKROOT_2_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> MUCKROOT_3_BLOCK = BLOCKS.register("muckroot_3", () -> new MuckrootBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).sound(SoundType.GRASS).instabreak().noCollission().noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> MUCKROOT_3_ITEM = BLOCK_ITEMS.register(MUCKROOT_3_BLOCK.getId(), () -> new BlockItem(MUCKROOT_3_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> WOODEN_DRAGON_HEAD_BLOCK = BLOCKS.register("wooden_dragon_head", () -> new WoodenDragonHeadBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> WOODEN_DRAGON_HEAD_ITEM = BLOCK_ITEMS.register(WOODEN_DRAGON_HEAD_BLOCK.getId(), () -> new BlockItem(WOODEN_DRAGON_HEAD_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> WOODEN_FROG_BLOCK = BLOCKS.register("wooden_frog", () -> new WoodenFrogBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER).ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> WOODEN_FROG_ITEM = BLOCK_ITEMS.register(WOODEN_FROG_BLOCK.getId(), () -> new BlockItem(WOODEN_FROG_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> HANGING_WEB_BLOCK = BLOCKS.register("hanging_web", () -> new HangingWebBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).sound(SoundType.VINE).strength(0f, 1f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> HANGING_WEB_ITEM = BLOCK_ITEMS.register(HANGING_WEB_BLOCK.getId(), () -> new BlockItem(HANGING_WEB_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> FRESNEL_LAMP_BLOCK = BLOCKS.register("fresnel_lamp", () -> new FresnelLampBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(2f, 10f).lightLevel(s -> 15).noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));

    public static final RegistrySupplier<BlockItem> FRENSEL_LAMP_ITEM = BLOCK_ITEMS.register(FRESNEL_LAMP_BLOCK.getId(), () -> new BlockItem(FRESNEL_LAMP_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> RAINBOW_LAMP_BLOCK = BLOCKS.register("rainbow_1", () -> new Rainbow1Block(BlockBehaviour.Properties.copy(Blocks.LANTERN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GLASS).strength(1f, 10f).lightLevel(s -> 15).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> RAINBOW_1_ITEM = BLOCK_ITEMS.register(RAINBOW_LAMP_BLOCK.getId(), () -> new BlockItem(RAINBOW_LAMP_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> FOGHORN_BLOCK = BLOCKS.register("foghorn", () -> new FoghornBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.LANTERN).strength(5f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> FOGHORN_ITEM = BLOCK_ITEMS.register(FOGHORN_BLOCK.getId(), () -> new BlockItem(FOGHORN_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Block> DESK_BELL_BLOCK = BLOCKS.register("desk_bell", () -> new DeskBellBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> DESK_BELL_ITEM = BLOCK_ITEMS.register(DESK_BELL_BLOCK.getId(), () -> new BlockItem(DESK_BELL_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> BLAZE_LAMP_ON_BLOCK = BLOCKS.register("blaze_lamp_on", () -> new BlazeLampOnBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(4f, 10f).lightLevel(s -> 12).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false)));
    public static final RegistrySupplier<BlockItem> BLAZE_LAMP_ITEM = BLOCK_ITEMS.register(BLAZE_LAMP_ON_BLOCK.getId(), () -> new BlockItem(BLAZE_LAMP_ON_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> WALL_BULB_LAMP = BLOCKS.register("wall_bulb_lamp", () -> new WallBulbLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).sound(SoundType.LANTERN).strength(2f, 1f).noOcclusion()));
    public static final RegistrySupplier<BlockItem> WALL_BULB_LAMP_ITEM = BLOCK_ITEMS.register(WALL_BULB_LAMP.getId(), () -> new BlockItem(WALL_BULB_LAMP.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> BULB_LAMP_FLOOR = BLOCKS.register("bulb_lamp_floor", () -> new BulbLampFloorBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).sound(SoundType.LANTERN).strength(2f, 1f).noOcclusion()));
    public static final RegistrySupplier<BlockItem> BULB_LAMP_FLOOR_ITEM = BLOCK_ITEMS.register(BULB_LAMP_FLOOR.getId(), () -> new BlockItem(BULB_LAMP_FLOOR.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static final RegistrySupplier<Block> GARGOYLE_BLOCK = BLOCKS.register("gargoyle", () -> new GargoyleBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f, 10f).noOcclusion()));
    public static final RegistrySupplier<BlockItem> GARGOYLE_ITEM = BLOCK_ITEMS.register(GARGOYLE_BLOCK.getId(), () -> new BlockItem(GARGOYLE_BLOCK.get(), new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static void init() {
        BLOCKS.register();
        BLOCK_ITEMS.register();
    }
}
