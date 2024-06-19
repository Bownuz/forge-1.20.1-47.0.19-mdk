package net.fedde.newmod.item;

import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.entity.custom.ModBoatEntity;
import net.fedde.newmod.item.custom.MetalDetectorItem;
import net.fedde.newmod.item.custom.ModArmorItem;
import net.fedde.newmod.item.custom.ModBoatItem;
import net.fedde.newmod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NewMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE =
            ITEMS.register("sapphire",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE =
            ITEMS.register("sapphire_raw",
                    () -> new Item(new Item.Properties()));
  public static final RegistryObject<Item> METAL_DETECTOR =
          ITEMS.register("metal_detector",
                  () -> new MetalDetectorItem(new Item.Properties().durability(100)));

  public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
          () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 1, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

  public static final RegistryObject<Item> PINE_BOAT = ITEMS.register("pine_boat",
          () -> new ModBoatItem(false, ModBoatEntity.Type.PINE, new Item.Properties()));
  public static final RegistryObject<Item> PINE_CHEST_BOAT = ITEMS.register("pine_chest_boat",
          () -> new ModBoatItem(true, ModBoatEntity.Type.PINE, new Item.Properties()));


    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));


    /**
     * zelf gemaakt
     */

//    public static final RegistryObject<Item> PURPLE_PLANKS =
//            ITEMS.register("purple_planks",
//                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURPLE_SWORD = ITEMS.register("purple_sword",
            () -> new SwordItem(ModToolTiers.PURPLE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_PICKAXE = ITEMS.register("purple_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PURPLE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_AXE = ITEMS.register("purple_axe",
            () -> new AxeItem(ModToolTiers.PURPLE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SHOVEL = ITEMS.register("purple_shovel",
            () -> new ShovelItem(ModToolTiers.PURPLE, 1, 0, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_HOE = ITEMS.register("purple_hoe",
            () -> new HoeItem(ModToolTiers.PURPLE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> PURPLE_HELMET = ITEMS.register("purple_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PURPLE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CHESTPLATE = ITEMS.register("purple_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PURPLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LEGGINGS = ITEMS.register("purple_leggings",
            () -> new ArmorItem(ModArmorMaterials.PURPLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_BOOTS = ITEMS.register("purple_boots",
            () -> new ArmorItem(ModArmorMaterials.PURPLE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> PURPLE_SIGN = ITEMS.register("purple_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PURPLE_SIGN.get(), ModBlocks.PURPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PURPLE_HANGING_SIGN = ITEMS.register("purple_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PURPLE_HANGING_SIGN.get(), ModBlocks.PURPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

  public static final RegistryObject<Item> PURPLE_BOAT = ITEMS.register("purple_boat",
          () -> new ModBoatItem(false, ModBoatEntity.Type.PURPLE, new Item.Properties()));
  public static final RegistryObject<Item> PURPLE_CHEST_BOAT = ITEMS.register("purple_chest_boat",
          () -> new ModBoatItem(true, ModBoatEntity.Type.PURPLE, new Item.Properties()));





  public static final RegistryObject<Item> RUBY =
          ITEMS.register("ruby",
                  () -> new Item(new Item.Properties()));
  public static final RegistryObject<Item> RAW_RUBY =
          ITEMS.register("ruby_raw",
                  () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
          () -> new SwordItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
          () -> new PickaxeItem(ModToolTiers.RUBY, 1, 1, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
          () -> new AxeItem(ModToolTiers.RUBY, 7, 1, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
          () -> new ShovelItem(ModToolTiers.RUBY, 1, 0, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
          () -> new HoeItem(ModToolTiers.RUBY, 0, 0, new Item.Properties()));

  public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
          () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
          () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
          () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
  public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
          () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
