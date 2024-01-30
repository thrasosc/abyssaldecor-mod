package net.abyssaldecor;

import net.abyssaldecor.registry.BlockRegistry;
import net.abyssaldecor.registry.ItemGroupRegistry;
import net.abyssaldecor.registry.ItemRegistry;

public class AbyssalDecor {
    public static final String MOD_ID = "abyssaldecor";

    public static void init() {
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
        ItemGroupRegistry.init();
        ItemRegistry.init();
        BlockRegistry.init();
    }
}
