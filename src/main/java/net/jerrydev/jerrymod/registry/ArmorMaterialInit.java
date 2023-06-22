package net.jerrydev.jerrymod.registry;

import net.jerrydev.jerrymod.registry.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial SAPPHIRE_MATERIAL = new ModArmorMaterial(
            new int[] { 500, 1000, 600, 400 },
            new int[] { 11, 16, 15, 13 },
            20,
            SoundEvents.WITHER_DEATH,
            () -> Ingredient.of(ItemRegistry.SAPPHIRE::get),
            "sapphire",
            0.25f,
            1f);
}
