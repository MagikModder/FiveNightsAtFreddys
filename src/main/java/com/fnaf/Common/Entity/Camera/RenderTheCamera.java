package com.fnaf.Common.Entity.camera;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Common.Entity.toybonnie.EntityToyBonnieMob;

public class RenderTheCamera extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Common.mod.Reference.MODID + ":textures/models/camera.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderTheCamera(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityCameraMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityCameraMob)entity);
	}

}
