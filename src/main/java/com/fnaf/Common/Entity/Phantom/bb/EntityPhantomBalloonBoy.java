package com.fnaf.Common.Entity.Phantom.bb;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityPhantomBalloonBoy {
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		
		createEntity(EntityPhantomBalloonBoyMob.class, "BalloonBoy", 0xF20521, 0x2011CF);
		
	}
	//Sounds


	
	protected String getLivingSound()
	{
	    return "scare";
	}
	protected String getHurtSound()
	{
	    return "";
	}
	protected String getDeathSound()
	{
	    return "CROWD_SMALL_CHIL_EC049202";
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Common.mod.MAIN_FNAF.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}


}