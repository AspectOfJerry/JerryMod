package net.jerrydev.jerrymod.registry;

import net.jerrydev.jerrymod.JerryMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// Subscribe class to bus
@Mod.EventBusSubscriber(modid = JerryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            JerryMod.MODID);

    public static final List<Supplier<? extends ItemLike>> CREATIVE_MODE_TAB = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register("main_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.main_tab"))
                    .icon(ItemRegistry.CLOUD_CANDY.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        CREATIVE_MODE_TAB.forEach((itemLike) -> output.accept(itemLike.get()));
                    }).build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        CREATIVE_MODE_TAB.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContent(BuildCreativeModeTabContentsEvent event) {
        // Add modded items to vanilla tabs
        // BUILDING_BLOCKS
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ItemRegistry.SAPPHIRE_BLOCK_ITEM);
            event.getEntries().putAfter(Items.AMETHYST_BLOCK.getDefaultInstance(),
                    ItemRegistry.SAPPHIRE_BLOCK_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        // FOOD_AND_DRINKS
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ItemRegistry.CLOUD_CANDY);
            // event.getEntries().putAfter(Items.ENCHANTED_GOLDEN_APPLE.getDefaultInstance(),
            // ItemRegistry.CLOUD_CANDY.get().getDefaultInstance(),
            // CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(ItemRegistry.ETHERATOMIC_PEARL);
            // event.getEntries().putAfter(Items.ENCHANTED_GOLDEN_APPLE.getDefaultInstance(),
            // ItemRegistry.EDIBLE_PEARL.get().getDefaultInstance(),
            // CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(ItemRegistry.TIDAL_CANDY);
            // event.getEntries().putAfter(Items.ENCHANTED_GOLDEN_APPLE.getDefaultInstance(),
            // ItemRegistry.TIDAL_CANDY.get().getDefaultInstance(),
            // CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        // WEAPONS
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ItemRegistry.SB_ASTRAEA);
            event.accept(ItemRegistry.SB_HYPERION);
            event.accept(ItemRegistry.SB_SCYLLA);
            event.accept(ItemRegistry.SB_VALKYRIE);
            event.accept(ItemRegistry.SB_DARK_CLAYMORE);
            event.accept(ItemRegistry.SB_ASPECT_OF_THE_END);
            event.accept(ItemRegistry.SB_JUJU_SHORTBOW);
            event.accept(ItemRegistry.SB_TERMINATOR);
        }
        // Add vanilla items to modded tabs
        if (event.getTab() == MAIN_TAB.get()) {
            event.accept(Items.IRON_PICKAXE);
        }
    }
}
