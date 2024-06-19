package net.fedde.newmod.item;

import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.entity.ModEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());

                        output.accept(ModItems.METAL_DETECTOR.get());

                        output.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());

                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        output.accept(ModItems.SAPPHIRE_HELMET.get());
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        output.accept(ModItems.SAPPHIRE_BOOTS.get());

                        output.accept(ModItems.SAPPHIRE_SWORD.get());
                        output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        output.accept(ModItems.SAPPHIRE_AXE.get());
                        output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        output.accept(ModItems.SAPPHIRE_HOE.get());

                        output.accept(ModItems.PINE_SIGN.get());
                        output.accept(ModItems.PINE_HANGING_SIGN.get());

                        output.accept(ModItems.PINE_BOAT.get());
                        output.accept(ModItems.PINE_CHEST_BOAT.get());

                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        output.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        output.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        output.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        output.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        output.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        output.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.SAPPHIRE_WALL.get());

                        output.accept(ModBlocks.PINE_LOG.get());
                        output.accept(ModBlocks.PINE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_PINE_LOG.get());
                        output.accept(ModBlocks.STRIPPED_PINE_WOOD.get());
                        output.accept(ModBlocks.PINE_PLANKS.get());
                        output.accept(ModBlocks.PINE_LEAVES.get());

                        output.accept(ModBlocks.PINE_SAPLING.get());

                        output.accept(ModBlocks.MOD_PORTAL.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CREATED_MOD_TAB = CREATIVE_MODE_TABS.register("created_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PURPLE_PLANKS.get()))
                    .title(Component.translatable("creativetab.created_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.SAPPHIRE.get());
//                        output.accept(ModItems.RAW_SAPPHIRE.get());
//
//                        output.accept(ModItems.METAL_DETECTOR.get());
//
//                        output.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
//
//                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
//                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        output.accept(ModItems.PURPLE_HELMET.get());
                        output.accept(ModItems.PURPLE_CHESTPLATE.get());
                        output.accept(ModItems.PURPLE_LEGGINGS.get());
                        output.accept(ModItems.PURPLE_BOOTS.get());

                        output.accept(ModItems.PURPLE_SWORD.get());
                        output.accept(ModItems.PURPLE_PICKAXE.get());
                        output.accept(ModItems.PURPLE_AXE.get());
                        output.accept(ModItems.PURPLE_SHOVEL.get());
                        output.accept(ModItems.PURPLE_HOE.get());

                        output.accept(ModItems.PURPLE_SIGN.get());
                        output.accept(ModItems.PURPLE_HANGING_SIGN.get());

                        output.accept(ModItems.PURPLE_BOAT.get());
                        output.accept(ModItems.PURPLE_CHEST_BOAT.get());

//                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
//                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
//                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
//                        output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

//                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        output.accept(ModBlocks.PURPLE_FENCE.get());
                        output.accept(ModBlocks.PURPLE_FENCE_GATE.get());
                        output.accept(ModBlocks.PURPLE_SLAB.get());
                        output.accept(ModBlocks.PURPLE_DOOR.get());
                        output.accept(ModBlocks.PURPLE_TRAPDOOR.get());
                        output.accept(ModBlocks.PURPLE_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_BUTTON.get());
                        output.accept(ModBlocks.PURPLE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PURPLE_WALL.get());

                        output.accept(ModBlocks.PURPLE_LOG.get());
                        output.accept(ModBlocks.PURPLE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_PURPLE_LOG.get());
                        output.accept(ModBlocks.STRIPPED_PURPLE_WOOD.get());
                        output.accept(ModBlocks.PURPLE_PLANKS.get());
                        output.accept(ModBlocks.PURPLE_LEAVES.get());

                        output.accept(ModBlocks.PURPLE_SAPLING.get());

//                        output.accept(ModBlocks.MOD_PORTAL.get());
                    })
                    .build());

    public static void register(IEventBus EventBus){
        CREATIVE_MODE_TABS.register(EventBus);
    }

}
