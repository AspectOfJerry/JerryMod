package net.jerrydev.jerrymod.registry;

import net.jerrydev.jerrymod.JerryMod;
import net.jerrydev.jerrymod.items.SbJujuShortbowBowItem;
import net.jerrydev.jerrymod.items.SbTerminatorBowItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
        // Map<String, Supplier<Item>>
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        JerryMod.MODID);

        public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK_ITEM = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire_block",
                                        () -> new BlockItem(BlockRegistry.SAPPHIRE_BLOCK.get(), new Item.Properties()
                                                        .rarity(Rarity.UNCOMMON))));

        public static final RegistryObject<Item> SAPPHIRE = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire",
                                        () -> new Item(new Item.Properties()
                                                        .rarity(Rarity.UNCOMMON))));

        public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire_pickaxe",
                                        () -> new PickaxeItem(
                                                        TierInit.SAPPHIRE_TIER,
                                                        2,
                                                        1f,
                                                        new Item.Properties()
                                                                        .rarity(Rarity.UNCOMMON))));

        public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire_helmet",
                                        () -> new ArmorItem(
                                                        ArmorMaterialInit.SAPPHIRE_MATERIAL,
                                                        ArmorItem.Type.HELMET,
                                                        new Item.Properties())));

        public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire_chestplate",
                                        () -> new ArmorItem(
                                                        ArmorMaterialInit.SAPPHIRE_MATERIAL,
                                                        ArmorItem.Type.CHESTPLATE,
                                                        new Item.Properties())));

        public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire_leggings",
                                        () -> new ArmorItem(
                                                        ArmorMaterialInit.SAPPHIRE_MATERIAL,
                                                        ArmorItem.Type.LEGGINGS,
                                                        new Item.Properties())));

        public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = CreativeTabRegistry.addToTab(
                        ITEMS.register("sapphire_boots",
                                        () -> new ArmorItem(
                                                        ArmorMaterialInit.SAPPHIRE_MATERIAL,
                                                        ArmorItem.Type.BOOTS,
                                                        new Item.Properties())));
        // ADD MODELS AND TEXTIRES FOR SAPPHIRE
        public static final RegistryObject<Item> CLOUD_CANDY = CreativeTabRegistry.addToTab(
                        ITEMS.register("cloud_candy",
                                        () -> new Item(new Item.Properties()
                                                        .stacksTo(32)
                                                        .food(new FoodProperties.Builder()
                                                                        .alwaysEat()
                                                                        .nutrition(3)
                                                                        .saturationMod(0.6f)
                                                                        .fast()
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.LEVITATION, 15, 25),
                                                                                        1f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.DAMAGE_RESISTANCE,
                                                                                        60, 2), 1f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.MOVEMENT_SLOWDOWN,
                                                                                        60, 3), 1f)
                                                                        .build())
                                                        .rarity(Rarity.RARE))));

        public static final RegistryObject<Item> TIDAL_CANDY = CreativeTabRegistry.addToTab(
                        ITEMS.register("tidal_candy",
                                        () -> new Item(new Item.Properties()
                                                        .stacksTo(32)
                                                        .food(new FoodProperties.Builder()
                                                                        .alwaysEat()
                                                                        .nutrition(3)
                                                                        .saturationMod(0.6f)
                                                                        .fast()
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.CONDUIT_POWER, 600,
                                                                                        0), 1f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.DOLPHINS_GRACE, 900,
                                                                                        15), 1f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.REGENERATION, 300,
                                                                                        0), 1f)
                                                                        .build())
                                                        .rarity(Rarity.RARE))));

        public static final RegistryObject<Item> TEST_CANDY = CreativeTabRegistry.addToTab(
                        ITEMS.register("test_candy",
                                        () -> new Item(new Item.Properties()
                                                        .stacksTo(32)
                                                        .food(new FoodProperties.Builder()
                                                                        .alwaysEat()
                                                                        .nutrition(3)
                                                                        .saturationMod(0.6f)
                                                                        .fast()
                                                                        .build())
                                                        .rarity(Rarity.RARE))));

        public static final RegistryObject<Item> ETHERATOMIC_PEARL = CreativeTabRegistry.addToTab(
                        ITEMS.register("etheratomic_pearl",
                                        () -> new Item(new Item.Properties()
                                                        .stacksTo(64)
                                                        .food(new FoodProperties.Builder()
                                                                        .alwaysEat()
                                                                        .nutrition(6)
                                                                        .saturationMod(1.2f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.ABSORPTION, 600, 6),
                                                                                        1f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.MOVEMENT_SPEED, 300,
                                                                                        0), 1f)
                                                                        .effect(() -> new MobEffectInstance(
                                                                                        MobEffects.REGENERATION, 200,
                                                                                        0), 1f)
                                                                        .build())
                                                        .rarity(Rarity.EPIC))));

        // SPECIAL WEAPONS
        public static final RegistryObject<SwordItem> SB_ASTRAEA = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_astraea",
                                        () -> new SwordItem(TierInit.WITHER_BLADE, 5, 0f, new Item.Properties()
                                                        .fireResistant()
                                                        .rarity(Rarity.EPIC))));

        public static final RegistryObject<SwordItem> SB_HYPERION = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_hyperion",
                                        () -> new SwordItem(TierInit.WITHER_BLADE, 4, 0f, new Item.Properties()
                                                        .fireResistant()
                                                        .rarity(Rarity.EPIC))));

        public static final RegistryObject<SwordItem> SB_SCYLLA = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_scylla",
                                        () -> new SwordItem(TierInit.WITHER_BLADE, 4, 0f, new Item.Properties()
                                                        .fireResistant()
                                                        .rarity(Rarity.EPIC))));

        public static final RegistryObject<SwordItem> SB_VALKYRIE = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_valkyrie",
                                        () -> new SwordItem(TierInit.WITHER_BLADE, 6, 0f, new Item.Properties()
                                                        .fireResistant()
                                                        .rarity(Rarity.EPIC))));

        public static final RegistryObject<SwordItem> SB_DARK_CLAYMORE = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_dark_claymore",
                                        () -> new SwordItem(TierInit.HEAVY_SWORD, 8, 1f, new Item.Properties()
                                                        .fireResistant()
                                                        .rarity(Rarity.EPIC))));

        // MELEE WEAPONS
        public static final RegistryObject<SwordItem> SB_ASPECT_OF_THE_END = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_aspect_of_the_end",
                                        () -> new SwordItem(Tiers.IRON, 2, 1f, new Item.Properties()
                                                        .fireResistant()
                                                        .rarity(Rarity.UNCOMMON))));

        // RANGED WEAPONS
        public static final RegistryObject<BowItem> SB_JUJU_SHORTBOW = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_juju_shortbow",
                                        () -> new SbJujuShortbowBowItem(new Item.Properties()
                                                        .fireResistant()
                                                        .durability(0)
                                                        .rarity(Rarity.RARE))));

        public static final RegistryObject<BowItem> SB_TERMINATOR = CreativeTabRegistry.addToTab(
                        ITEMS.register("sb_terminator",
                                        () -> new SbTerminatorBowItem(new Item.Properties()
                                                        .fireResistant()
                                                        .durability(0)
                                                        .rarity(Rarity.EPIC))));
}
