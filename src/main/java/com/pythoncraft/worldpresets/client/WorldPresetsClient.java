package com.pythoncraft.worldpresets.client;

import com.pythoncraft.worldpresets.WorldPresets;

import net.fabricmc.api.ClientModInitializer;

public class WorldPresetsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        WorldPresets.LOGGER.info("Hello from the client side!");
    }
}
