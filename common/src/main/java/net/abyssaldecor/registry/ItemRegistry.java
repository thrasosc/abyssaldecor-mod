package net.abyssaldecor.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemGroupRegistry.*;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> GARGOYLE_ITEM = ITEMS.register("gargoyleitem", () ->
            new Item(new Item.Properties().arch$tab(ABYSSALDECOR_TAB)));

    public static void init() {
        ITEMS.register();
    }
}
