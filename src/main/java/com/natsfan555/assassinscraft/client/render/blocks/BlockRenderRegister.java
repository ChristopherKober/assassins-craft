package com.natsfan555.assassinscraft.client.render.blocks;

import com.natsfan555.assassinscraft.blocks.ModBlocks;
import com.natsfan555.assassinscraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static void registerBlockRenderer() {
		reg(ModBlocks.altarOfEden);
		reg(ModBlocks.animus);
	}
	
	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
