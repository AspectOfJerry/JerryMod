package net.jerrydev.jerrymod.registry;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class TierInit {
    public static final ForgeTier SAPPHIRE_TIER = new ForgeTier(
            5,
            1800,
            1f,
            3,
            15,
            TagInit.NEEDS_SAPPHIRE_TOOL,
            () -> Ingredient.of(ItemRegistry.SAPPHIRE::get));

    public static final ForgeTier WITHER_BLADE = new ForgeTier(
            4,
            0,
            1.5f,
            7,
            15,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(Items.OBSIDIAN));

    public static final ForgeTier HEAVY_SWORD = new ForgeTier(
            4,
            0,
            1.5f,
            8,
            15,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(Items.OBSIDIAN));
}
