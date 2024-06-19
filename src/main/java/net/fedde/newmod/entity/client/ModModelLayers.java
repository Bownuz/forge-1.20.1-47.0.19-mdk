package net.fedde.newmod.entity.client;

import net.fedde.newmod.NewMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation PINE_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(NewMod.MOD_ID, "boat/pine"), "main");
    public static final ModelLayerLocation PINE_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(NewMod.MOD_ID, "chest_boat/pine"), "main");

    /**
     * zelf gemaakt
     */

    public static final ModelLayerLocation PURPLE_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(NewMod.MOD_ID, "boat/purple"), "main");
    public static final ModelLayerLocation PURPLE_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(NewMod.MOD_ID, "chest_boat/purple"), "main");
}
