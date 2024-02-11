package net.abyssaldecor.forge;

import dev.architectury.platform.forge.EventBuses;
import net.abyssaldecor.AbyssalDecor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AbyssalDecor.MOD_ID)
public class AbyssalDecorForge {
    public AbyssalDecorForge() {
        IEventBus eventBus= FMLJavaModLoadingContext.get().getModEventBus();
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AbyssalDecor.MOD_ID, eventBus);
        eventBus.addListener(this::clientSetup);
        AbyssalDecor.init();
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        AbyssalDecor.initClient();
    }
}
