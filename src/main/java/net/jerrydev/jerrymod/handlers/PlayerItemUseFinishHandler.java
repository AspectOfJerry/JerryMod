package net.jerrydev.jerrymod.handlers;

import net.jerrydev.jerrymod.JerryMod;
import net.jerrydev.jerrymod.registry.ItemRegistry;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// @Mod.EventBusSubscriber(modid = JerryMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerItemUseFinishHandler {
    // @SubscribeEvent
    public static void onPlayerItemUseFinish(PlayerInteractEvent.RightClickItem event) {
        if (event.getItemStack().getItem() == ItemRegistry.TEST_CANDY.get()) {
            // Place block at player's position

        }
    }
}
