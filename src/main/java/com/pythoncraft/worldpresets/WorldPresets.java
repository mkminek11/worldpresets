package com.pythoncraft.worldpresets;

import com.pythoncraft.worldpresets.preset.WorldPresetManager;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldPresets implements ModInitializer {
	public static final String MOD_ID = "worldpresets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		WorldPresetManager.load();
	}
}
