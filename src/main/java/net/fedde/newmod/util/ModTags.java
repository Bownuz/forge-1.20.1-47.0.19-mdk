package net.fedde.newmod.util;

import net.fedde.newmod.NewMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");
        public static final TagKey<Block> NEEDS_PURPLE_TOOL = tag("needs_purple_tool");
        public static final TagKey<Block> CRAFTING_PURPLE_WOOD_TYPE = tag("crafting_purple_wood_type");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(NewMod.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> CRAFTING_PURPLE_WOOD_TYPE = tag("crafting_purple_wood_type");
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(NewMod.MOD_ID, name));
        }
    }
}
