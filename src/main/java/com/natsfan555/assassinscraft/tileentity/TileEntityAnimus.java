package com.natsfan555.assassinscraft.tileentity;


import java.util.ArrayList;
import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityAnimus extends TileEntity {
	
	public List<String> playerHistory = new ArrayList<String>();

	
	TileEntityAnimus() {
		super();
		
	}
	
	public void addPlayer(String playerName) {
		playerHistory.add(playerName);
	}
	
	public Object[] getPlayerHistory(World par1World, int x, int y, int z) {
		TileEntityAnimus tea = (TileEntityAnimus)par1World.getTileEntity(new BlockPos(x,y,z));
		 
		for(int i=tea.playerHistory.size();i <= 0;i--) {
			System.out.println(tea.playerHistory.get(i) + " has entered the animus.");
		}
		
		return tea.playerHistory.toArray();
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound var1) {
		var1.setInteger("theNameOfTheVariable", 0);
		super.writeToNBT(var1);
		return var1;
	}
	
	public void readFromNBT(NBTTagCompound var1) {
		int temp = var1.getInteger("theNameOfTheVariable");
	    super.readFromNBT(var1);
	}
	
//	public Packet getDescriptionPacket() {
//		NBTTagCompound tagCompound = new NBTTagCompound();
//		writeToNBT(tagCompound);
//		return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, tagCompound);
//	}

}
