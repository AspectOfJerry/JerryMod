package net.jerrydev.jerrymod.registry.tiers;

import net.jerrydev.jerrymod.JerryMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModArmorMaterial implements ArmorMaterial {
    private final int[] _durabilityForType;
    private final int[] _defenseForType;
    private final int _enchantability;
    private final SoundEvent _equipSound;
    private final Supplier<Ingredient> _repairMaterial;
    private final String _name;
    private final float _toughness;
    private final float _knockbackResistance;

    public ModArmorMaterial(int[] durabilityForType, int[] defenseForType, int enchantability, SoundEvent equipSound,
            Supplier<Ingredient> repairMaterial, String name, float toughness, float knockbackResistance) {
        this._durabilityForType = durabilityForType;
        this._defenseForType = defenseForType;
        this._enchantability = enchantability;
        this._equipSound = equipSound;
        this._repairMaterial = repairMaterial;
        this._name = name;
        this._toughness = toughness;
        this._knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type p_266807_) {
        return this._durabilityForType[p_266807_.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type p_267168_) {
        return this._defenseForType[p_267168_.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this._enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this._equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this._repairMaterial.get();
    }

    @Override
    public String getName() {
        return JerryMod.MODID + ":" + this._name;
    }

    @Override
    public float getToughness() {
        return this._toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this._knockbackResistance;
    }
}
