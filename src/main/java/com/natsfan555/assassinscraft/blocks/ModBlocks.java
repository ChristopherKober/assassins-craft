package com.natsfan555.assassinscraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block altarOfEden;
	
	public static void createBlocks() {
		
		GameRegistry.registerBlock(altarOfEden = new BasicBlock("altar_of_eden").setLightLevel(1.0f), "altar_of_eden");
		
	}

}
