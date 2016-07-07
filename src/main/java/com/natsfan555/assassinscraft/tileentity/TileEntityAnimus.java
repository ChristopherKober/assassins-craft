package com.natsfan555.assassinscraft.tileentity;


import java.util.ArrayList;
import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityAnimus extends TileEntity {
	
	public List<String> playerHistory = new ArrayList<String>();

	public void addPlayer(String playerName) {
		playerHistory.add(playerName);
	}

//    public int decrement() {
//        counter--;
//        //markDirty();
//        return counter;
//    }
//
//    public int increment() {
//        counter++;
//        //markDirty();
//        return counter;
//    }

    @Override
    public void readFromNBT(NBTTagCompound comp) {
    	super.readFromNBT(comp);
    	NBTTagList tagList = comp.getTagList("MyStringList", 10);
    	for(int i = 0; i < tagList.tagCount(); i++) {
    		NBTTagCompound tag = tagList.getCompoundTagAt(i);
    		String s = tag.getString("MyString" + i);
    		playerHistory.add(i, s);
    	}
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
    	super.writeToNBT(compound);
    	NBTTagList tagList = new NBTTagList();
    	for(int i = 0; i < playerHistory.size(); i++) {
    		String s = playerHistory.get(i);
    		if(s != null) {
    			NBTTagCompound tag = new NBTTagCompound();
    			tag.setString("MyString" + i, s);
    			tagList.appendTag(tag);
    		}
    	}
    	compound.setTag("MyStringList", tagList);
    	return compound;
    }
    
}
