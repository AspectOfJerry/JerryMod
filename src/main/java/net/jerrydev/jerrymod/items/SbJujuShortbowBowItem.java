package net.jerrydev.jerrymod.items;

import net.jerrydev.jerrymod.JerryMod;
import net.jerrydev.jerrymod.entities.CustomAbstractArrow;
import net.jerrydev.jerrymod.registry.EntityRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.function.Predicate;

public class SbJujuShortbowBowItem extends BowItem {
    public SbJujuShortbowBowItem(Properties p_40660_) {
        super(p_40660_);
    }

    @Override
    public int getDefaultProjectileRange() {
        return 15;
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return ARROW_ONLY;
    }

    @Override
    public void releaseUsing(ItemStack stack, Level worldIn, LivingEntity entityLiving, int timeLeft) {
        if (!(entityLiving instanceof Player)) {
            return;
        }

        Player player = (Player) entityLiving;
        boolean isInstaBuild = player.getAbilities().instabuild;
        boolean hasInfinityEnchantment = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS,
                stack) > 0;
        ItemStack projectileStack = player.getProjectile(stack);

        int duration = this.getUseDuration(stack) - timeLeft;
        duration = ForgeEventFactory.onArrowLoose(stack, worldIn, player, duration,
                !projectileStack.isEmpty() || hasInfinityEnchantment);
        if (duration < 0) {
            return;
        }

        if (!projectileStack.isEmpty() || hasInfinityEnchantment) {
            if (projectileStack.isEmpty()) {
                projectileStack = new ItemStack(Items.ARROW);
            }

            if (!worldIn.isClientSide) {
                ArrowItem arrowItem = (ArrowItem) (projectileStack.getItem() instanceof ArrowItem
                        ? projectileStack.getItem()
                        : Items.ARROW);
                AbstractArrow abstractArrow = arrowItem.createArrow(worldIn, projectileStack, player);
                abstractArrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3.0F, 1.0F);
                worldIn.addFreshEntity(abstractArrow);
            }

            // Play sound effect
            worldIn.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT,
                    SoundSource.PLAYERS, 1.0F, 1.0F / (worldIn.random.nextFloat() * 0.4F + 1.2F) + 0.5F);

            // Decrease arrow count and remove if empty
            if (!hasInfinityEnchantment && !isInstaBuild) {
                projectileStack.shrink(1);
                if (projectileStack.isEmpty()) {
                    player.getInventory().removeItem(projectileStack);
                }
            }

            // Increment item used statistic
            player.awardStat(Stats.ITEM_USED.get(this));
        }
    }
}
