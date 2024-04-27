package net.fedde.tutorialmod.sound;

import net.fedde.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TutorialMod.MOD_ID);

    public static final RegistryObject<SoundEvent> METAL_DETECTOR_FOUND_ORE = registerSoundEvent("metal_detector_found_ore");

    public static final RegistryObject<SoundEvent> SOUND_BLOCK_BRAKE = registerSoundEvent("sound_block_brake");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_STEP = registerSoundEvent("sound_block_step");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_PLACE = registerSoundEvent("sound_block_place");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_HIT = registerSoundEvent("sound_block_hit");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_FALL = registerSoundEvent("sound_block_fall");

    public static final ForgeSoundType SOUND_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SOUND_BLOCK_BRAKE, ModSounds.SOUND_BLOCK_STEP, ModSounds.SOUND_BLOCK_PLACE, ModSounds.SOUND_BLOCK_HIT, ModSounds.SOUND_BLOCK_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENT.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(TutorialMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENT.register(eventBus);
    }
}
