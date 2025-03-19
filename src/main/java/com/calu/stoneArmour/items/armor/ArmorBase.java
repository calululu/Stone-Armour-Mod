package com.calu.stoneArmour.items.armor;

import com.calu.stoneArmour.Main;
import com.calu.stoneArmour.init.ModItems;
import com.calu.stoneArmour.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(CreativeTabs.COMBAT); 
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
			Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	//Test slowness effect
	
}
