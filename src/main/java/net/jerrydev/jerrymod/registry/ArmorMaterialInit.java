package net.jerrydev.jerrymod.registry;

import net.jerrydev.jerrymod.registry.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial SAPPHIRE_MATERIAL = new ModArmorMaterial(
            new int[] { 400, 1000, 700, 400 },
            new int[] { 3, 8, 6, 3 },
            20,
            SoundEvents.ENCHANTMENT_TABLE_USE,
            () -> Ingredient.of(ItemRegistry.SAPPHIRE::get),
            "sapphire",
            4.5f,
            1f);
}
