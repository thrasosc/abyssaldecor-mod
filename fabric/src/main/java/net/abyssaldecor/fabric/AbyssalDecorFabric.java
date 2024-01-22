package net.abyssaldecor.fabric;

import net.abyssaldecor.AbyssalDecor;
import net.fabricmc.api.ModInitializer;

public class AbyssalDecorFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AbyssalDecor.init();
    }
}
