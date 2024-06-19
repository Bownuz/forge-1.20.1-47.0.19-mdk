package net.fedde.newmod.datagen;

import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.item.ModItems;
import net.fedde.newmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, NewMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE_BOOTS.get())

                .add(ModItems.PURPLE_HELMET.get(), ModItems.PURPLE_CHESTPLATE.get(), ModItems.PURPLE_LEGGINGS.get(), ModItems.PURPLE_BOOTS.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());
        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get().asItem())
                .add(ModBlocks.PINE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.get().asItem())

                .add(ModBlocks.PURPLE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_WOOD.get().asItem())
                .add(ModBlocks.PURPLE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_LOG.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get().asItem())

                .add(ModBlocks.PURPLE_PLANKS.get().asItem());

        this.tag(ModTags.Items.CRAFTING_PURPLE_WOOD_TYPE)
                .add(ModBlocks.STRIPPED_PURPLE_LOG.get().asItem())
                .add(ModBlocks.PURPLE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PURPLE_WOOD.get().asItem())
                .add(ModBlocks.PURPLE_WOOD.get().asItem());
    }
}
