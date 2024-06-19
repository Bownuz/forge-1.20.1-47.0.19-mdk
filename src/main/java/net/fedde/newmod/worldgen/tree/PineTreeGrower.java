package net.fedde.newmod.worldgen.tree;

import net.fedde.newmod.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PineTreeGrower extends AbstractTreeGrower {
    private String tree;

    public PineTreeGrower (String tree){
        this.tree = tree;
    }

    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        if (tree.equals("pine")) {
            return ModConfiguredFeatures.PINE_KEY;
        } else {
            return ModConfiguredFeatures.PURPLE_KEY;
        }
    }
}
