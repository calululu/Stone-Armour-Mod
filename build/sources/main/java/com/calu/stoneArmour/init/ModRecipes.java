package com.calu.stoneArmour.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.HELMET_STONE, new ItemStack(Blocks.STONE, 1),1.5f);
		GameRegistry.addSmelting(ModItems.CHESTPLATE_STONE, new ItemStack(Blocks.STONE, 2),1.5f);
		GameRegistry.addSmelting(ModItems.LEGGINS_STONE, new ItemStack(Blocks.STONE, 1),1.5f);
		GameRegistry.addSmelting(ModItems.BOOTS_STONE, new ItemStack(Blocks.STONE, 1),1.5f);
	}
}
