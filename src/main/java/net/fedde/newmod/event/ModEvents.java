package net.fedde.newmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.fedde.newmod.NewMod;
import net.fedde.newmod.block.ModBlocks;
import net.fedde.newmod.item.ModItems;
import net.fedde.newmod.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = NewMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((Trader, Random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
                    1, 8, 0.02f));
        }

        if (event.getType() == VillagerProfession.LIBRARIAN){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((Trader, Random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
                    1, 8, 0.02f));
        }

        if (event.getType() == ModVillagers.SOUND_MASTER.get()){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((Trader, Random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
                    1, 8, 0.02f));
            trades.get(1).add((Trader, Random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModBlocks.SOUND_BLOCK.get(), 1),
                    1, 8, 0.02f));
        }
    }
}
