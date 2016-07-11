package com.natsfan555.assassinscraft.blocks;

import java.util.Random;
import javax.annotation.Nullable;

import com.natsfan555.assassinscraft.tileentity.TileEntityAnimus;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockAnimus extends BlockContainer {

    public BlockAnimus()
    {
        super(Material.ROCK);
        
        
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
    	
    	TileEntity tect = worldIn.getTileEntity(pos);
    	
    	if (tect instanceof TileEntityAnimus) {
    		
    		((TileEntityAnimus) tect).addPlayer(playerIn.getName());
        	System.out.println(((TileEntityAnimus) tect).playerHistory);
    		playerIn.addChatMessage(new TextComponentString("Added Player to List"));
    		
    		playerIn.displayGui((TileEntityAnimus)tect);
    		
    		
    	}
    	
    	return true;
    }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityAnimus();
	}
}