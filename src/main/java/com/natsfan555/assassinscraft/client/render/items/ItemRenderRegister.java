package com.natsfan555.assassinscraft.client.render.items;

import com.natsfan555.assassinscraft.items.ModItems;
import com.natsfan555.assassinscraft.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		reg(ModItems.appleOfEden);
	}
	
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
