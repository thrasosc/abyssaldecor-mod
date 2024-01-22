package net.abyssaldecor.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.abyssaldecor.AbyssalDecor.MOD_ID;
import static net.abyssaldecor.registry.ItemRegistry.*;

public class ItemGroupRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> ABYSSALDECOR_TAB = TABS.register("abyssaldecor_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".abyssaldecor_tab"),
                    () -> new ItemStack(GARGOYLE_ITEM.get())));

    public static void init() {
        TABS.register();
    }
}
