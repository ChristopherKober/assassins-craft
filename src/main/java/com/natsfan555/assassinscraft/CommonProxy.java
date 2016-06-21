package com.natsfan555.assassinscraft;

import com.natsfan555.assassinscraft.blocks.ModBlocks;
import com.natsfan555.assassinscraft.crafting.ModCrafting;
import com.natsfan555.assassinscraft.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event){
		ModItems.createItems();
		ModBlocks.createBlocks();
	}
	
	public void init(FMLInitializationEvent event){
		ModCrafting.initCrafting();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
