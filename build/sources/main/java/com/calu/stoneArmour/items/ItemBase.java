package com.calu.stoneArmour.items;

import com.calu.stoneArmour.Main;
import com.calu.stoneArmour.init.ModItems;
import com.calu.stoneArmour.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT); 
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
			Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
