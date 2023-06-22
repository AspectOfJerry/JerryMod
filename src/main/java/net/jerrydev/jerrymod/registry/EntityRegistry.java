package net.jerrydev.jerrymod.registry;

import net.jerrydev.jerrymod.JerryMod;
import net.jerrydev.jerrymod.entities.CustomAbstractArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            JerryMod.MODID);

    // public static final RegistryObject<EntityType<CustomAbstractArrow>>
    // CUSTOM_ABSTRACT_ARROW = ENTITIES.register("custom_abstract_arrow",
    // ()->EntityType.Builder.of(CustomAbstractArrow::new , MobCategory.MISC)
    // .build(JerryMod.MODID +":custom_abstract_arrow")
    // );
}
