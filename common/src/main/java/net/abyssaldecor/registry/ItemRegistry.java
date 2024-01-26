package net.abyssaldecor.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemGroupRegistry.*;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> GARGOYLE = ITEMS.register("gargoyle", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> AMARANTH_PINNACLE = ITEMS.register("amaranth_pinnacle", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> AMARANTH_SEEDS = ITEMS.register("amaranth_seeds", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BLACK_PEARL = ITEMS.register("black_pearl", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BLACK_PEARL_MEAL = ITEMS.register("black_pearl_meal", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BLACK_WOOD_DOOR = ITEMS.register("blackwood_door", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BLOOD_CORAL_BUD = ITEMS.register("blood_coral_bud", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BLOOD_CORAL_DOOR = ITEMS.register("blood_coral_door", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOG_APPLE_LEAVES = ITEMS.register("bog_apple_leaves", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOG_APPLE = ITEMS.register("bog_apple", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOG_APPLE_PIE = ITEMS.register("bog_apple_pie", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BONEROT = ITEMS.register("bonerot", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOTTOMLESS_BAG_OF_COBBLESTONE = ITEMS.register("bottomless_bag_of_cobblestone", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOTTOMLESS_BAG_OF_DIRT = ITEMS.register("bottomless_bag_of_dirt", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOTTOMLESS_BAG_OF_NETHERRACK = ITEMS.register("bottomless_bag_of_netherrack", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> BOTTOMLESS_BAG_OF_SNOW = ITEMS.register("bottomless_bag_of_snow", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> SEABRASS_CHAIN = ITEMS.register("seabrass_chain", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> SEABRASS_DOOR = ITEMS.register("seabrass_door", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> SEABRASS_INGOT = ITEMS.register("seabrass_ingot", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> DEEPBRONZE_CHAIN = ITEMS.register("deepbronze_chain", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> DEEPBRONZE_DOOR = ITEMS.register("deepbronze_door", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> DEEPBRONZE_INGOT = ITEMS.register("deepbronze_ingot", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> DEEPBRONZE_NUGGET = ITEMS.register("deepbronze_nugget", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> CINNAMON_APPLE = ITEMS.register("cinnamon_apple", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> CINNAMON_DOOR = ITEMS.register("cinnamon_door", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> CINNAMON_ROLL = ITEMS.register("cinnamon_roll", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> CINNAMON_STICK = ITEMS.register("cinnamon_stick", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> CINNAMON_TEA = ITEMS.register("cinnamon_tea", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> DANGLING_WEB_ITEM = ITEMS.register("dangling_web_item", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> DULL_IRON_BAR_DOOR = ITEMS.register("dull_iron_bar_door", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM = ITEMS.register("fever_blossom", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_1 = ITEMS.register("fever_blossom_crop_1", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_2 = ITEMS.register("fever_blossom_crop_2", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_3 = ITEMS.register("fever_blossom_crop_3", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_4 = ITEMS.register("fever_blossom_crop_4", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_5 = ITEMS.register("fever_blossom_crop_5", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_6 = ITEMS.register("fever_blossom_crop_6", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_CROP_7 = ITEMS.register("fever_blossom_crop_7", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));
    public static final RegistrySupplier<Item> FEVER_BLOSSOM_TEA = ITEMS.register("fever_blossom_tea", () -> new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));


    public static void init() {
        ITEMS.register();
    }
}