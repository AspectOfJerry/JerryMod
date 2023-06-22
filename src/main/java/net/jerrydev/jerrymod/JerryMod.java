package net.jerrydev.jerrymod;

import net.jerrydev.jerrymod.registry.BlockRegistry;
import net.jerrydev.jerrymod.registry.CreativeTabRegistry;
import net.jerrydev.jerrymod.registry.EntityRegistry;
import net.jerrydev.jerrymod.registry.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(JerryMod.MODID)
public class JerryMod {
    public static final String MODID = "jerrymod";

    public JerryMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register
        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
        CreativeTabRegistry.TABS.register(bus);
        EntityRegistry.ENTITIES.register(bus);
    }
}
