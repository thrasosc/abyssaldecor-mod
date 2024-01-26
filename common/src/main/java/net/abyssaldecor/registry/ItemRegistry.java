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


    public static void init() {
        ITEMS.register();
    }
}