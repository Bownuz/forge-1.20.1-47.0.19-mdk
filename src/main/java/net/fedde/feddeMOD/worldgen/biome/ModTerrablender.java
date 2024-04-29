package net.fedde.feddeMOD.worldgen.biome;

import net.fedde.feddeMOD.Fedde_MOD;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(Fedde_MOD.MOD_ID, "overworld"), 5));
    }
}