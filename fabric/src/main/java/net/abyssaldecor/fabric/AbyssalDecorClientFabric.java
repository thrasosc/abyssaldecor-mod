package net.abyssaldecor.fabric;

import net.abyssaldecor.AbyssalDecor;
import net.fabricmc.api.ClientModInitializer;

public class AbyssalDecorClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AbyssalDecor.initClient();
    }
}
