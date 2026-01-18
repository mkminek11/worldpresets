package com.pythoncraft.worldpresets.preset;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorldPresetManager {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type LIST_TYPE = new TypeToken<List<WorldPreset>>() {}.getType();
    private static final Path CONFIG_PATH = FabricLoader.getInstance()
            .getConfigDir()
            .resolve("world-presets.json");
    private static List<WorldPreset> presets = new ArrayList<>();

    public static void load() {
        if (!Files.exists(CONFIG_PATH)) {
            save(); // Create default config if it doesn't exist
            return;
        }

        try {
            String json = Files.readString(CONFIG_PATH);
            presets = GSON.fromJson(json, LIST_TYPE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (presets == null) {presets = new ArrayList<>();}
    }

    public static void save() {
        try {
            String json = GSON.toJson(presets, LIST_TYPE);
            Files.writeString(CONFIG_PATH, json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<WorldPreset> getPresets() {
        return presets;
    }

    public static void addPreset(WorldPreset preset) {
        presets.add(preset);
        save();
    }
}
