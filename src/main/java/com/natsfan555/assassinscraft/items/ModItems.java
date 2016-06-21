package com.natsfan555.assassinscraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item appleOfEden;

	public static void createItems(){
		GameRegistry.registerItem(appleOfEden = new AppleOfEdenItem("apple_of_eden"), "apple_of_eden");
	}
	
}
