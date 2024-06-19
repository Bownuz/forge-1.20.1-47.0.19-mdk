package net.fedde.newmod.datagen.loot;

import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        this.dropSelf(ModBlocks.SOUND_BLOCK.get());


        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));

        this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        this.dropSelf(ModBlocks.PINE_LOG.get());
        this.dropSelf(ModBlocks.PINE_PLANKS.get());
        this.dropSelf(ModBlocks.PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_WOOD.get());

        this.dropSelf(ModBlocks.PINE_SAPLING.get());

        this.add(ModBlocks.PINE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.SAPPHIRE_SLAB.get(), block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(), block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        this.add(ModBlocks.PINE_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));


        /**
         * zelf gemaakt
         */
        this.dropSelf(ModBlocks.PURPLE_LOG.get());
        this.dropSelf(ModBlocks.PURPLE_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_WOOD.get());

        this.dropSelf(ModBlocks.PURPLE_SAPLING.get());

        this.add(ModBlocks.PURPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PURPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

//        this.add(ModBlocks.SAPPHIRE_SLAB.get(), block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
//        this.add(ModBlocks.SAPPHIRE_DOOR.get(), block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        this.add(ModBlocks.PURPLE_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_SIGN.get()));
        this.add(ModBlocks.PURPLE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_SIGN.get()));
        this.add(ModBlocks.PURPLE_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_HANGING_SIGN.get()));
        this.add(ModBlocks.PURPLE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_HANGING_SIGN.get()));


        this.dropSelf(ModBlocks.PURPLE_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PURPLE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PURPLE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_WALL.get());

        this.add(ModBlocks.PURPLE_SLAB.get(), block -> createSlabItemTable(ModBlocks.PURPLE_SLAB.get()));
        this.add(ModBlocks.PURPLE_DOOR.get(), block -> createDoorTable(ModBlocks.PURPLE_DOOR.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block block, Item item){
        return createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
