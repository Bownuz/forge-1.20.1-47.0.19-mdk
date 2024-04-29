package net.fedde.newmod.worldgen.biome;

import net.fedde.newmod.NewMod;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(NewMod.MOD_ID, "overworld"), 5));
    }
}