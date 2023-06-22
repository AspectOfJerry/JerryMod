package net.jerrydev.jerrymod.registry;

import net.jerrydev.jerrymod.JerryMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(JerryMod.MODID, name));
    }
}
