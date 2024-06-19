package net.fedde.newmod.datagen;

import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.entity.ModEntities;
import net.fedde.newmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModBlocks.END_STONE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreBlasting(consumer, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        oreSmelting(consumer, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(consumer);

        /**
         * zelf gemaakt
         */

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_SIGN.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern(" T ")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_HANGING_SIGN.get())
                .pattern(" T ")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModBlocks.STRIPPED_PURPLE_LOG.get())
                .define('T', Blocks.CHAIN)
                .unlockedBy(getHasName(ModBlocks.STRIPPED_PURPLE_LOG.get()), has(ModBlocks.STRIPPED_PURPLE_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PURPLE_BOAT.get())
                .pattern("S S")
                .pattern("SSS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PURPLE_CHEST_BOAT.get())
                .requires(Blocks.CHEST)
                .requires(ModItems.PURPLE_BOAT.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_BUTTON.get())
                .requires(ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_FENCE.get())
                .pattern("STS")
                .pattern("STS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_FENCE_GATE.get())
                .pattern("TST")
                .pattern("TST")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_TRAPDOOR.get(), 2)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_DOOR.get(), 3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_STAIRS.get(), 4)
                .pattern("S")
                .pattern("SS")
                .pattern("SSS")
                .define('S', ModBlocks.PURPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PLANKS.get()), has(ModBlocks.PURPLE_PLANKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_WOOD.get(), 3)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.PURPLE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_LOG.get()), has(ModBlocks.PURPLE_LOG.get()))
                .save(consumer);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  NewMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
