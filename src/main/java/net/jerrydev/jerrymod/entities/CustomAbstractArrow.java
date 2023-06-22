package net.jerrydev.jerrymod.entities;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class CustomAbstractArrow extends AbstractArrow {
    // Define the sound event for the hit sound
    private static final SoundEvent HIT_SOUND = SoundEvents.ANVIL_LAND;

    public CustomAbstractArrow(EntityType<? extends CustomAbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    // Override the onHitEntity method
    @Override
    protected void onHitEntity(EntityHitResult hitResult) {
        super.onHitEntity(hitResult);

        Entity targetEntity = hitResult.getEntity();
        Level world = targetEntity.getCommandSenderWorld();

        // Check if the target entity is a living entity
        if (targetEntity instanceof LivingEntity) {
            // Play the hit sound at the location of the entity
            world.playSound(null, targetEntity.getX(), targetEntity.getY(), targetEntity.getZ(), HIT_SOUND,
                    SoundSource.PLAYERS, 1.0F, 1.0F);
        }
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }
}