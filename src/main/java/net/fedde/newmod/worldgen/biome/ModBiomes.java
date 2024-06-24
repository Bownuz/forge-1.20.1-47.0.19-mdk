package net.fedde.newmod.worldgen.biome;

import net.fedde.newmod.sound.ModSounds;
import net.fedde.newmod.worldgen.ModPlacedFeatures;
import net.fedde.newmod.NewMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.structures.NetherFortressStructure;

public class ModBiomes {
    public static final ResourceKey<Biome> WARPED_BIOME = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(NewMod.MOD_ID, "warped_biome"));
    public static final ResourceKey<Biome> SOIL_BIOME = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(NewMod.MOD_ID, "soil_biome"));

    public static void boostrap(BootstapContext<Biome> context) {
        context.register(WARPED_BIOME, slingbiome(context, WARPED_BIOME));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static Biome slingbiome(BootstapContext<Biome> context, ResourceKey resourceKey) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        if (resourceKey.equals(WARPED_BIOME)) {
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 5, 2, 30));

            BiomeDefaultFeatures.farmAnimals(spawnBuilder);
            BiomeDefaultFeatures.commonSpawns(spawnBuilder);

            BiomeGenerationSettings.Builder biomeBuilder =
                    new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
            //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
            globalOverworldGeneration(biomeBuilder);
            BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);
            BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
            BiomeDefaultFeatures.addFerns(biomeBuilder);
            BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
            BiomeDefaultFeatures.addExtraGold(biomeBuilder);

            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);

            BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
            BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PINE_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BAMBOO);

            return new Biome.BiomeBuilder()
                    .hasPrecipitation(true)
                    .downfall(0.8f)
                    .temperature(0.7f)
                    .generationSettings(biomeBuilder.build())
                    .mobSpawnSettings(spawnBuilder.build())
                    .specialEffects((new BiomeSpecialEffects.Builder())
                            .waterColor(0xe82e3b)
                            .waterFogColor(0xbf1b26)
                            .skyColor(0x30c918)
                            .grassColorOverride(0x7f03fc)
                            .foliageColorOverride(0xd203fc)
                            .fogColor(0x22a1e6)
                            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                            .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get())).build())
                    .build();
        }
        else {
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.MAGMA_CUBE, 5, 2, 3));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.BLAZE, 5, 1, 5));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 5, 1, 8));

            BiomeDefaultFeatures.farmAnimals(spawnBuilder);
            BiomeDefaultFeatures.commonSpawns(spawnBuilder);

            BiomeGenerationSettings.Builder biomeBuilder =
                    new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
            //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
            globalOverworldGeneration(biomeBuilder);
            BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);
            BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
            BiomeDefaultFeatures.addFerns(biomeBuilder);
            BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
            BiomeDefaultFeatures.addExtraGold(biomeBuilder);

            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_NETHER);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_NETHER);

            BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
            BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PINE_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BAMBOO);

            return new Biome.BiomeBuilder()
                    .hasPrecipitation(true)
                    .downfall(0.8f)
                    .temperature(0.7f)
                    .generationSettings(biomeBuilder.build())
                    .mobSpawnSettings(spawnBuilder.build())
                    .specialEffects((new BiomeSpecialEffects.Builder())
                            .waterColor(0xe82e3b)
                            .waterFogColor(0xbf1b26)
                            .skyColor(0x30c918)
                            .grassColorOverride(0x7f03fc)
                            .foliageColorOverride(0xd203fc)
                            .fogColor(0x22a1e6)
                            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                            .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get())).build())
                    .build();
        }
    }

//    public static Biome createWarpedBiome(BootstapContext<Biome> context) {
//        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
//
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
//        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 5, 2, 30));
//
//        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
//        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
//
//        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(
//                context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER)
//        );
//
//        // Voeg globale overworld generatie-instellingen toe
//        globalOverworldGeneration(biomeBuilder);
//
//        // Voeg bestaande Nether Fortress structuur toe door een structuurset toe te voegen
//        biomeBuilder.addStructureSet(new ResourceKey<>(
//                Registries.STRUCTURE_SET, new ResourceLocation("minecraft", "nether_fortress")));
//
//        BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);
//        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
//        BiomeDefaultFeatures.addFerns(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
//        BiomeDefaultFeatures.addExtraGold(biomeBuilder);
//
//        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);
//        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
//        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
//        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PINE_PLACED_KEY);
//        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BAMBOO);
//
//        return new Biome.BiomeBuilder()
//                .hasPrecipitation(true)
//                .downfall(0.8f)
//                .temperature(0.7f)
//                .generationSettings(biomeBuilder.build())
//                .mobSpawnSettings(spawnBuilder.build())
//                .specialEffects((new BiomeSpecialEffects.Builder())
//                        .waterColor(0xe82e3b)
//                        .waterFogColor(0xbf1b26)
//                        .skyColor(0x30c918)
//                        .grassColorOverride(0x7f03fc)
//                        .foliageColorOverride(0xd203fc)
//                        .fogColor(0x22a1e6)
//                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
//                        .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get())).build())
//                .build();
//    }
}