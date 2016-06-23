package com.natsfan555.assassinscraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAppleOfEden extends Item {
	
	public ItemAppleOfEden(String unlocalizedName) {
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.setRegistryName(unlocalizedName);
	}
	
}