package com.pythoncraft.worldpresets.preset;

import net.minecraft.world.Difficulty;
// import net.minecraft.world.GameMode;

public class WorldPreset {
    private final String name;
    private final String gameMode;
    private final Difficulty difficulty;

    public WorldPreset(String name, String gameMode, Difficulty difficulty) {
        this.name = name;
        this.gameMode = gameMode;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public String getGameMode() {
        return gameMode;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}