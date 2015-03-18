/*  1:   */ package com.fnaf.puppet;
/*  2:   */ 
/*  3:   */ import net.minecraft.client.model.ModelBase;
/*  4:   */ import net.minecraft.client.renderer.entity.RenderLiving;
/*  5:   */ import net.minecraft.entity.Entity;
/*  6:   */ import net.minecraft.util.ResourceLocation;
/*  7:   */ 
/*  8:   */ public class RenderPuppetMob
/*  9:   */   extends RenderLiving
/* 10:   */ {
/* 11:12 */   private static final ResourceLocation mobTextures = new ResourceLocation("fnaf2:textures/models/puppet.png");
/* 12:   */   private static final String __OBFID = "CL_00000984";
/* 13:   */   
/* 14:   */   public RenderPuppetMob(ModelBase par1ModelBase, float par2)
/* 15:   */   {
/* 16:16 */     super(par1ModelBase, par2);
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected ResourceLocation getEntityTexture(EntityPuppetMob entity)
/* 20:   */   {
/* 21:21 */     return mobTextures;
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected ResourceLocation func_110775_a(Entity entity)
/* 25:   */   {
/* 26:25 */     return getEntityTexture((EntityPuppetMob)entity);
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.puppet.RenderPuppetMob
 * JD-Core Version:    0.7.1
 */