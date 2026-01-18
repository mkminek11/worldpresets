package com.pythoncraft.worldpresets.mixin;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.pythoncraft.worldpresets.WorldPresets;

@Mixin(CreateWorldScreen.class)
public class CreateWorldScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	private void init(CallbackInfo info) {
		WorldPresets.LOGGER.info("CreateWorldScreen initialized");
	}
}
