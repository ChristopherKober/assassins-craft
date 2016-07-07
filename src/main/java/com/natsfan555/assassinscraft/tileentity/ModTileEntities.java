package com.natsfan555.assassinscraft.tileentity;


import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModTileEntities {
	
	public static TileEntityAnimus animus;

    public static void init() {
        GameRegistry.registerTileEntity(TileEntityAnimus.class, "assassins_craft__animus");
    }

}