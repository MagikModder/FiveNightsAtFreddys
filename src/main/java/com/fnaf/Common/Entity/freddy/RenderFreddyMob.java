package com.fnaf.Common.Entity.freddy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFreddyMob extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Common.mod.Reference.MODID + ":textures/models/freddy.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderFreddyMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityFreddyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityFreddyMob)entity);
	}

}
