package net.fedde.newmod.datagen;

import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NewMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES)
                .add(ModBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),

                        ModBlocks.RAW_RUBY_BLOCK.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get())

                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.NETHER_RUBY_ORE.get())
                .add(ModBlocks.END_STONE_RUBY_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());


        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get())

                .add(ModBlocks.PURPLE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())

                .add(ModBlocks.PURPLE_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get())

                .add(ModBlocks.PURPLE_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get())

                .add(ModBlocks.PURPLE_LOG.get())
                .add(ModBlocks.PURPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_PURPLE_LOG.get())
                .add(ModBlocks.STRIPPED_PURPLE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get())

                .add(ModBlocks.PURPLE_PLANKS.get());
    }
}
