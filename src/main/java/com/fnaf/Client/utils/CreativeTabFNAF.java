package com.fnaf.Client.utils;

import com.fnaf.Common.Items.FNAFItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class CreativeTabFNAF extends CreativeTabs {
 
	public CreativeTabFNAF(String label) {
		super(label);
		this.setBackgroundImageName("fnaf.png");
	}
    
    
 
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
 
       return FNAFItems.logo;
    }
}