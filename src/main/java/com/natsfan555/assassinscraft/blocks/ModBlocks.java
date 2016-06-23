package com.natsfan555.assassinscraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block altarOfEden;
	
	public static void createBlocks() {
		
		altarOfEden = new BasicBlock("altar_of_eden");
		altarOfEden.setLightLevel(1.0f);
		GameRegistry.register(altarOfEden);
		
		
		ItemBlock altarOfEdenItem = new ItemBlock(altarOfEden);
		altarOfEdenItem.setRegistryName("altar_of_eden");
		GameRegistry.register(altarOfEdenItem);
	}

}
