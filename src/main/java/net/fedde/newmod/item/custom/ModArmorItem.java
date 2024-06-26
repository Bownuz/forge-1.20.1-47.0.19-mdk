package net.fedde.newmod.item.custom;

import com.google.common.collect.ImmutableBiMap;
import net.fedde.newmod.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> FULL_SAPPHIRE_ARMOR_ON =
            (new ImmutableBiMap.Builder<ArmorMaterial, MobEffectInstance>()
                    .put(ModArmorMaterials.SAPPHIRE, new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 1,
                            false, false, true)).build());

    private static final Map<ArmorMaterial, MobEffectInstance> FULL_PURPLE_ARMOR_ON =
            (new ImmutableBiMap.Builder<ArmorMaterial, MobEffectInstance>()
                    .put(ModArmorMaterials.PURPLE, new MobEffectInstance(MobEffects.LUCK, 200, 1,
                            false, false, true)).build());

    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player){
        if(!world.isClientSide){
            if (hasFullSuitOfArmorOn(player)){
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player){
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : FULL_SAPPHIRE_ARMOR_ON.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)){
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : FULL_PURPLE_ARMOR_ON.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)){
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player){
        for (ItemStack armorstack : player.getInventory().armor){
            if (!(armorstack.getItem() instanceof ArmorItem)){
                return false;
            }
        }

        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(3).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());

        return helmet.getMaterial() == material && chestplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }


    private boolean hasFullSuitOfArmorOn(Player player){
        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

}
