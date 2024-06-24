package net.fedde.newmod.datagen;

import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NewMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE);


        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.SAPPHIRE_STAIRS.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.SAPPHIRE_SLAB.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.SAPPHIRE_BUTTON.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.SAPPHIRE_FENCE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SAPPHIRE_FENCE_GATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SAPPHIRE_WALL.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");

        logBlock((RotatedPillarBlock) ModBlocks.PINE_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.PINE_WOOD.get(), blockTexture(ModBlocks.PINE_LOG.get()), blockTexture(ModBlocks.PINE_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PINE_LOG.get(), blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()),
                new ResourceLocation(NewMod.MOD_ID, "block/stripped_pine_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PINE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()));

        blockItem(ModBlocks.PINE_LOG);
        blockItem(ModBlocks.STRIPPED_PINE_LOG);
        blockItem(ModBlocks.PINE_WOOD);
        blockItem(ModBlocks.STRIPPED_PINE_WOOD);

        blockWithItem(ModBlocks.PINE_PLANKS);

        leavesBlock(ModBlocks.PINE_LEAVES);

        saplingBlock(ModBlocks.PINE_SAPLING);

        blockWithItem(ModBlocks.MOD_PORTAL);

        signBlock(((StandingSignBlock) ModBlocks.PINE_SIGN.get()), ((WallSignBlock) ModBlocks.PINE_WALL_SIGN.get()),
                blockTexture(ModBlocks.PINE_PLANKS.get()));

        hangingSignBlock(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.PINE_PLANKS.get()));

        /**
         * zelf gemaakt
         */


        logBlock((RotatedPillarBlock) ModBlocks.PURPLE_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.PURPLE_WOOD.get(), blockTexture(ModBlocks.PURPLE_LOG.get()), blockTexture(ModBlocks.PURPLE_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_LOG.get(), blockTexture(ModBlocks.STRIPPED_PURPLE_LOG.get()),
                new ResourceLocation(NewMod.MOD_ID, "block/stripped_purple_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_PURPLE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PURPLE_LOG.get()));

        blockItem(ModBlocks.PURPLE_LOG);
        blockItem(ModBlocks.STRIPPED_PURPLE_LOG);
        blockItem(ModBlocks.PURPLE_WOOD);
        blockItem(ModBlocks.STRIPPED_PURPLE_WOOD);

        blockWithItem(ModBlocks.PURPLE_PLANKS);

        leavesBlock(ModBlocks.PURPLE_LEAVES);

        saplingBlock(ModBlocks.PURPLE_SAPLING);

        signBlock(((StandingSignBlock) ModBlocks.PURPLE_SIGN.get()), ((WallSignBlock) ModBlocks.PURPLE_WALL_SIGN.get()),
                blockTexture(ModBlocks.PURPLE_PLANKS.get()));

        hangingSignBlock(ModBlocks.PURPLE_HANGING_SIGN.get(), ModBlocks.PURPLE_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.PURPLE_PLANKS.get()));


        stairsBlock(((StairBlock) ModBlocks.PURPLE_STAIRS.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PURPLE_SLAB.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PURPLE_BUTTON.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PURPLE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.PURPLE_FENCE.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PURPLE_FENCE_GATE.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.PURPLE_WALL.get()), blockTexture(ModBlocks.PURPLE_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.PURPLE_DOOR.get()), modLoc("block/purple_door_bottom"), modLoc("block/purple_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PURPLE_TRAPDOOR.get()), modLoc("block/purple_trapdoor"), true, "cutout");




        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RAW_RUBY_BLOCK);

        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);
        blockWithItem(ModBlocks.END_STONE_RUBY_ORE);

        blockWithItem(ModBlocks.SOIL);
        blockWithItem(ModBlocks.SOIL_DARK);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject){
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(NewMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}
