package com.natsfan555.assassinscraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item appleOfEden;

	public static void createItems(){
		
		appleOfEden = new ItemAppleOfEden("apple_of_eden");
		GameRegistry.register(appleOfEden);
		
	}
	
}
