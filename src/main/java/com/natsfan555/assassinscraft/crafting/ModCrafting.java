package com.natsfan555.assassinscraft.crafting;

import com.natsfan555.assassinscraft.blocks.ModBlocks;
import com.natsfan555.assassinscraft.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void initCrafting(){
		
		GameRegistry.addRecipe(new ItemStack(ModItems.appleOfEden), new Object[] {"GAG","ADA","GAG", 'G', Items.GOLD_INGOT,'A',Items.GOLDEN_APPLE,'D',Blocks.DIAMOND_BLOCK});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.altarOfEden), new Object[] {Blocks.FURNACE,Blocks.REDSTONE_BLOCK,Blocks.LAPIS_BLOCK});
		
	}

}
