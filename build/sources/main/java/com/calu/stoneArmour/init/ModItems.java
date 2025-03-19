package com.calu.stoneArmour.init;

import java.util.ArrayList;
import java.util.List;

import com.calu.stoneArmour.items.ItemBase;
import com.calu.stoneArmour.items.armor.ArmorBase;
import com.calu.stoneArmour.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
//Items Iron armor ha 2,5,6,2
	public static final ArmorMaterial ARMOUR_STONE = EnumHelper.addArmorMaterial("armour_stone", Reference.MOD_ID+":stone", 9, new int[]{2, 3, 4, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
//Armor
	public static final Item HELMET_STONE = new ArmorBase("helmet_stone", ARMOUR_STONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_STONE = new ArmorBase("chestplate_stone", ARMOUR_STONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_STONE = new ArmorBase("leggins_stone", ARMOUR_STONE, 2, EntityEquipmentSlot.LEGS );
	public static final Item BOOTS_STONE = new ArmorBase("boots_stone", ARMOUR_STONE, 1, EntityEquipmentSlot.FEET );
	
	//Creative tab X
	
}
