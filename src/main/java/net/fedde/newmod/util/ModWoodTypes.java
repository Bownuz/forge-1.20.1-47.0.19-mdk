package net.fedde.newmod.util;

import net.fedde.newmod.NewMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(NewMod.MOD_ID + ":pine", BlockSetType.OAK));
}
