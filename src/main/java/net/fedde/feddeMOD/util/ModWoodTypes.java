package net.fedde.feddeMOD.util;

import net.fedde.feddeMOD.Fedde_MOD;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(Fedde_MOD.MOD_ID + ":pine", BlockSetType.OAK));
}
