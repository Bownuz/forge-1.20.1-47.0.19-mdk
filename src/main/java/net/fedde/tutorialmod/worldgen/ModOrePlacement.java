package net.fedde.tutorialmod.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement (PlacementModifier p_195347, PlacementModifier p_195348){
        return List.of(p_195347, InSquarePlacement.spread(), p_195348, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement (int count, PlacementModifier heightRange){
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    public static List<PlacementModifier> rareOrePlacement (int chance, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightRange);
    }
}
