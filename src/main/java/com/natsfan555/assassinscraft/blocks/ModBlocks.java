package com.natsfan555.assassinscraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block altarOfEden;
	public static Block animus;
	public static Block dataBlock;
	
	public static void createBlocks() {
		
		altarOfEden = new BasicBlock("altar_of_eden");
		altarOfEden.setLightLevel(1.0f);
		altarOfEden.setRegistryName("altar_of_eden");
		GameRegistry.register(altarOfEden);
		
		animus = new BlockAnimus();
        animus.setUnlocalizedName("animus");
        animus.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        animus.setHardness(2.0f);
        animus.setResistance(10.0f);
        animus.setRegistryName("animus");
		GameRegistry.register(animus);
		
		
		ItemBlock altarOfEdenItem = new ItemBlock(altarOfEden);
		altarOfEdenItem.setRegistryName("altar_of_eden");
		GameRegistry.register(altarOfEdenItem);
		
		ItemBlock animusItem = new ItemBlock(animus);
		animusItem.setRegistryName("animus");
		GameRegistry.register(animusItem);
		
		dataBlock = new BlockDataBlock();
		dataBlock.setUnlocalizedName("dataBlock");
		dataBlock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		dataBlock.setRegistryName("dataBlock");
		GameRegistry.register(dataBlock);
		
		ItemBlock dataBlockItem = new ItemBlock(dataBlock);
		dataBlockItem.setRegistryName("dataBlock");
		GameRegistry.register(dataBlockItem);
		
		
	}

}
