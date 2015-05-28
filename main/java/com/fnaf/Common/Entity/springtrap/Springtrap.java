package com.fnaf.Common.Entity.springtrap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class Springtrap extends ModelBase
{
  //fields
	  ModelRenderer Right_Leg_1;
	    ModelRenderer Left_Leg_1;
	    ModelRenderer Right_Leg_2;
	    ModelRenderer Left_Leg_2;
	    ModelRenderer Right_Knee;
	    ModelRenderer Left_Knee;
	    ModelRenderer Hip;
	    ModelRenderer Right_Leg_3;
	    ModelRenderer Left_Leg_3;
	    ModelRenderer Body_articulation;
	    ModelRenderer Body_1;
	    ModelRenderer Left_Leg_articulation;
	    ModelRenderer Right_Leg_articulation;
	    ModelRenderer Body_2;
	    ModelRenderer Neck;
	    ModelRenderer Lower_Mouth_1;
	    ModelRenderer Lower_Mouth_2;
	    ModelRenderer Head_1;
	    ModelRenderer Head_2;
	    ModelRenderer Upper_Mouth_1;
	    ModelRenderer Upper_Mouth_2;
	    ModelRenderer Nose;
	    ModelRenderer Right_Ear;
	    ModelRenderer Left_Ear_1;
	    ModelRenderer Left_Ear_2;
	    ModelRenderer Right_Shoulder;
	    ModelRenderer Left_Shoulder;
	    ModelRenderer Right_Arm_1;
	    ModelRenderer Left_Arm_1;
	    ModelRenderer Right_Arm_2;
	    ModelRenderer Left_Arm_2;
	    ModelRenderer Right_Hand;
	    ModelRenderer Left_Hand;
	    ModelRenderer Right_Eye;
	    ModelRenderer Left_Eye;
	    ModelRenderer Right_Finger_1;
	    ModelRenderer Right_Finger_2;
	    ModelRenderer Right_Finger_3;
	    ModelRenderer Right_Finger_4;
	    ModelRenderer Left_Finger_1;
	    ModelRenderer Left_Finger_2;
	    ModelRenderer Left_Finger_3;
	    ModelRenderer Left_Finger_4;
	    ModelRenderer Button_1;
	    ModelRenderer Button_2;
	    ModelRenderer Head_3;
	    ModelRenderer Lower_Teeth;
	    ModelRenderer Upper_Teeth;
	    ModelRenderer Upper_Mouth_3;
	  
	  public Springtrap()
	  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      Right_Leg_1 = new ModelRenderer(this, 0, 0);
	      Right_Leg_1.addBox(-2F, 0F, -6F, 4, 2, 7);
	      Right_Leg_1.setRotationPoint(-2.5F, 22F, 3F);
	      Right_Leg_1.setTextureSize(128, 64);
	      Right_Leg_1.mirror = true;
	      setRotation(Right_Leg_1, 0F, 0F, 0F);
	      Left_Leg_1 = new ModelRenderer(this, 0, 0);
	      Left_Leg_1.addBox(-2F, 0F, -6F, 4, 2, 7);
	      Left_Leg_1.setRotationPoint(2.5F, 22F, 3F);
	      Left_Leg_1.setTextureSize(128, 64);
	      Left_Leg_1.mirror = true;
	      setRotation(Left_Leg_1, 0F, 0F, 0F);
	      Right_Leg_2 = new ModelRenderer(this, 0, 18);
	      Right_Leg_2.addBox(-1.5F, 0F, -1.7F, 3, 6, 4);
	      Right_Leg_2.setRotationPoint(-2.5F, 17F, 1F);
	      Right_Leg_2.setTextureSize(128, 64);
	      Right_Leg_2.mirror = true;
	      setRotation(Right_Leg_2, 0.122173F, 0F, 0F);
	      Left_Leg_2 = new ModelRenderer(this, 0, 18);
	      Left_Leg_2.addBox(-1.5F, 0F, -1.7F, 3, 6, 4);
	      Left_Leg_2.setRotationPoint(2.5F, 17F, 1F);
	      Left_Leg_2.setTextureSize(128, 64);
	      Left_Leg_2.mirror = true;
	      setRotation(Left_Leg_2, 0.122173F, 0F, 0F);
	      Right_Knee = new ModelRenderer(this, 0, 44);
	      Right_Knee.addBox(-2F, 0F, -2.5F, 4, 3, 2);
	      Right_Knee.setRotationPoint(-2.5F, 15F, 1.5F);
	      Right_Knee.setTextureSize(128, 64);
	      Right_Knee.mirror = true;
	      setRotation(Right_Knee, 0F, 0F, 0F);
	      Left_Knee = new ModelRenderer(this, 0, 44);
	      Left_Knee.addBox(-2F, 0F, -2.5F, 4, 3, 2);
	      Left_Knee.setRotationPoint(2.5F, 15F, 1.5F);
	      Left_Knee.setTextureSize(128, 64);
	      Left_Knee.mirror = true;
	      setRotation(Left_Knee, 0F, 0F, 0F);
	      Hip = new ModelRenderer(this, 0, 53);
	      Hip.addBox(-4F, 0F, -2F, 8, 2, 5);
	      Hip.setRotationPoint(0F, 9.466666F, 1F);
	      Hip.setTextureSize(128, 64);
	      Hip.mirror = true;
	      setRotation(Hip, 0.0349066F, 0F, 0F);
	      Right_Leg_3 = new ModelRenderer(this, 0, 34);
	      Right_Leg_3.addBox(-1.5F, 0F, -2F, 3, 5, 4);
	      Right_Leg_3.setRotationPoint(-2.5F, 11.46667F, 1.5F);
	      Right_Leg_3.setTextureSize(128, 64);
	      Right_Leg_3.mirror = true;
	      setRotation(Right_Leg_3, 0F, 0F, 0F);
	      Left_Leg_3 = new ModelRenderer(this, 0, 34);
	      Left_Leg_3.addBox(-1.5F, 0F, -2F, 3, 5, 4);
	      Left_Leg_3.setRotationPoint(2.5F, 11.46667F, 1.5F);
	      Left_Leg_3.setTextureSize(128, 64);
	      Left_Leg_3.mirror = true;
	      setRotation(Left_Leg_3, 0F, 0F, 0F);
	      Body_articulation = new ModelRenderer(this, 28, 55);
	      Body_articulation.addBox(-1F, 0.4666667F, -2F, 2, 1, 4);
	      Body_articulation.setRotationPoint(0F, 8.466666F, 1.5F);
	      Body_articulation.setTextureSize(128, 64);
	      Body_articulation.mirror = true;
	      setRotation(Body_articulation, 0F, 0F, 0F);
	      Body_1 = new ModelRenderer(this, 17, 38);
	      Body_1.addBox(-3.533333F, -1F, -2.2F, 7, 6, 6);
	      Body_1.setRotationPoint(0F, 4.3F, 1F);
	      Body_1.setTextureSize(128, 64);
	      Body_1.mirror = true;
	      setRotation(Body_1, -0.0174533F, 0F, 0F);
	      Left_Leg_articulation = new ModelRenderer(this, 0, 29);
	      Left_Leg_articulation.addBox(-1F, -0.5F, -1F, 2, 2, 2);
	      Left_Leg_articulation.setRotationPoint(2.5F, 16F, 2F);
	      Left_Leg_articulation.setTextureSize(128, 64);
	      Left_Leg_articulation.mirror = true;
	      setRotation(Left_Leg_articulation, 0F, 0F, 0F);
	      Right_Leg_articulation = new ModelRenderer(this, 0, 29);
	      Right_Leg_articulation.addBox(-1F, -0.5F, -1F, 2, 2, 2);
	      Right_Leg_articulation.setRotationPoint(-2.5F, 16F, 2F);
	      Right_Leg_articulation.setTextureSize(128, 64);
	      Right_Leg_articulation.mirror = true;
	      setRotation(Right_Leg_articulation, 0F, 0F, 0F);
	      Body_2 = new ModelRenderer(this, 19, 26);
	      Body_2.addBox(-3.5F, 0F, -3F, 7, 4, 6);
	      Body_2.setRotationPoint(0F, -0.4333333F, 1.733333F);
	      Body_2.setTextureSize(128, 64);
	      Body_2.mirror = true;
	      setRotation(Body_2, 0F, 0F, 0F);
	      Neck = new ModelRenderer(this, 22, 21);
	      Neck.addBox(-1F, -1.5F, -1F, 2, 2, 2);
	      Neck.setRotationPoint(0F, -0.4333333F, 1.733333F);
	      Neck.setTextureSize(128, 64);
	      Neck.mirror = true;
	      setRotation(Neck, 0F, 0F, 0F);
	      Lower_Mouth_1 = new ModelRenderer(this, 66, 56);
	      Lower_Mouth_1.addBox(-2.5F, 0F, -5F, 5, 1, 6);
	      Lower_Mouth_1.setRotationPoint(0F, -2.433333F, 2.733333F);
	      Lower_Mouth_1.setTextureSize(128, 64);
	      Lower_Mouth_1.mirror = true;
	      setRotation(Lower_Mouth_1, 0.122173F, 0F, 0F);
	      Lower_Mouth_2 = new ModelRenderer(this, 0, 13);
	      Lower_Mouth_2.addBox(-2F, 0F, -6F, 4, 1, 1);
	      Lower_Mouth_2.setRotationPoint(0F, -2.433333F, 2.733333F);
	      Lower_Mouth_2.setTextureSize(128, 64);
	      Lower_Mouth_2.mirror = true;
	      setRotation(Lower_Mouth_2, 0.122173F, 0F, 0F);
	      Head_1 = new ModelRenderer(this, 50, 44);
	      Head_1.addBox(-3F, -6F, -4F, 6, 5, 5);
	      Head_1.setRotationPoint(0F, -1.9F, 2.733333F);
	      Head_1.setTextureSize(128, 64);
	      Head_1.mirror = true;
	      setRotation(Head_1, 0F, 0F, 0F);
	      Head_2 = new ModelRenderer(this, 50, 38);
	      Head_2.addBox(-2.5F, -7F, -3.5F, 5, 1, 4);
	      Head_2.setRotationPoint(0F, -1.9F, 2.733333F);
	      Head_2.setTextureSize(128, 64);
	      Head_2.mirror = true;
	      setRotation(Head_2, 0F, 0F, 0F);
	      Upper_Mouth_1 = new ModelRenderer(this, 18, 14);
	      Upper_Mouth_1.addBox(-2.5F, -3F, -5F, 5, 2, 1);
	      Upper_Mouth_1.setRotationPoint(0F, -1.9F, 2.733333F);
	      Upper_Mouth_1.setTextureSize(128, 64);
	      Upper_Mouth_1.mirror = true;
	      setRotation(Upper_Mouth_1, 0F, 0F, 0F);
	      Upper_Mouth_2 = new ModelRenderer(this, 36, 21);
	      Upper_Mouth_2.addBox(-2F, -2F, -6F, 4, 1, 1);
	      Upper_Mouth_2.setRotationPoint(0F, -1.9F, 2.733333F);
	      Upper_Mouth_2.setTextureSize(128, 64);
	      Upper_Mouth_2.mirror = true;
	      setRotation(Upper_Mouth_2, 0F, 0F, 0F);
	      Nose = new ModelRenderer(this, 36, 17);
	      Nose.addBox(-1F, -1.5F, -0.1F, 2, 1, 1);
	      Nose.setRotationPoint(0F, -3.566667F, -3.466667F);
	      Nose.setTextureSize(128, 64);
	      Nose.mirror = true;
	      setRotation(Nose, -0.2617994F, 0F, 0.0872665F);
	      Right_Ear = new ModelRenderer(this, 34, 11);
	      Right_Ear.addBox(-2.5F, -4F, -1F, 2, 4, 1);
	      Right_Ear.setRotationPoint(0F, -8.433333F, 2.733333F);
	      Right_Ear.setTextureSize(128, 64);
	      Right_Ear.mirror = true;
	      setRotation(Right_Ear, 0F, 0F, -0.0698132F);
	      Left_Ear_1 = new ModelRenderer(this, 34, 11);
	      Left_Ear_1.addBox(0.5F, -4F, -1F, 2, 4, 1);
	      Left_Ear_1.setRotationPoint(0F, -8.433333F, 2.733333F);
	      Left_Ear_1.setTextureSize(128, 64);
	      Left_Ear_1.mirror = true;
	      setRotation(Left_Ear_1, 0F, 0F, 0.0698132F);
	    
	      Left_Ear_2 = new ModelRenderer(this, 34, 11);
	      Left_Ear_2.addBox(0.9F, -3F, -1F, 2, 4, 1);
	      Left_Ear_2.setRotationPoint(0F, -13.43333F, 2.4F);
	      Left_Ear_2.setTextureSize(128, 64);
	      Left_Ear_2.mirror = true;
	      setRotation(Left_Ear_2, 0.2443461F, 0F, 0.0698132F);
	      Left_Ear_2.mirror = false;
	      Right_Shoulder = new ModelRenderer(this, 25, 2);
	      Right_Shoulder.addBox(-2F, 0F, -2F, 3, 2, 4);
	      Right_Shoulder.setRotationPoint(-3.5F, -1F, 2F);
	      Right_Shoulder.setTextureSize(128, 64);
	      Right_Shoulder.mirror = true;
	      setRotation(Right_Shoulder, 0F, 0F, 0.3316126F);
	      Left_Shoulder = new ModelRenderer(this, 25, 2);
	      Left_Shoulder.addBox(-1F, 0F, -2F, 3, 2, 4);
	      Left_Shoulder.setRotationPoint(3.5F, -1F, 2F);
	      Left_Shoulder.setTextureSize(128, 64);
	      Left_Shoulder.mirror = true;
	      setRotation(Left_Shoulder, 0F, 0F, -0.3316126F);
	      Right_Arm_1 = new ModelRenderer(this, 47, 5);
	      Right_Arm_1.addBox(-2F, 0.5333334F, -1.5F, 3, 5, 3);
	      Right_Arm_1.setRotationPoint(-3.5F, 0F, 2F);
	      Right_Arm_1.setTextureSize(128, 64);
	      Right_Arm_1.mirror = true;
	      setRotation(Right_Arm_1, 0F, 0F, 0.3316126F);
	      Left_Arm_1 = new ModelRenderer(this, 47, 5);
	      Left_Arm_1.addBox(-1F, 0.5333334F, -1.5F, 3, 5, 3);
	      Left_Arm_1.setRotationPoint(3.5F, 0F, 2F);
	      Left_Arm_1.setTextureSize(128, 64);
	      Left_Arm_1.mirror = true;
	      setRotation(Left_Arm_1, 0F, 0F, -0.3316126F);
	    
	      Right_Arm_2 = new ModelRenderer(this, 47, 5);
	      Right_Arm_2.addBox(-1.5F, 0.5333334F, -1.5F, 3, 5, 3);
	      Right_Arm_2.setRotationPoint(-5.5F, 4.5F, 2F);
	      Right_Arm_2.setTextureSize(128, 64);
	      Right_Arm_2.mirror = true;
	      setRotation(Right_Arm_2, -0.1047198F, 0F, 0F);
	      Right_Arm_2.mirror = false;
	
	      Left_Arm_2 = new ModelRenderer(this, 47, 5);
	      Left_Arm_2.addBox(-1.5F, 0.5333334F, -1.5F, 3, 5, 3);
	      Left_Arm_2.setRotationPoint(5.5F, 4.5F, 2F);
	      Left_Arm_2.setTextureSize(128, 64);
	      Left_Arm_2.mirror = true;
	      setRotation(Left_Arm_2, -0.1047198F, 0F, 0F);
	      Left_Arm_2.mirror = false;
	      Right_Hand = new ModelRenderer(this, 51, 24);
	      Right_Hand.addBox(-1F, 5.533333F, -2F, 2, 2, 3);
	      Right_Hand.setRotationPoint(-5.5F, 4.5F, 2F);
	      Right_Hand.setTextureSize(128, 64);
	      Right_Hand.mirror = true;
	      setRotation(Right_Hand, -0.1047198F, 0F, 0F);
	      Left_Hand = new ModelRenderer(this, 51, 31);
	      Left_Hand.addBox(-1F, 5.533333F, -2F, 2, 2, 3);
	      Left_Hand.setRotationPoint(5.5F, 4.5F, 2F);
	      Left_Hand.setTextureSize(128, 64);
	      Left_Hand.mirror = true;
	      setRotation(Left_Hand, -0.1047198F, 0F, 0F);
	      Right_Eye = new ModelRenderer(this, 67, 47);
	      Right_Eye.addBox(-1.8F, -4.3F, -4.1F, 1, 1, 1);
	      Right_Eye.setRotationPoint(0F, -1.9F, 2.733333F);
	      Right_Eye.setTextureSize(128, 64);
	      Right_Eye.mirror = true;
	      setRotation(Right_Eye, 0F, 0F, 0F);
	      Left_Eye = new ModelRenderer(this, 67, 47);
	      Left_Eye.addBox(0.8F, -4.3F, -4.1F, 1, 1, 1);
	      Left_Eye.setRotationPoint(0F, -1.9F, 2.733333F);
	      Left_Eye.setTextureSize(128, 64);
	      Left_Eye.mirror = true;
	      setRotation(Left_Eye, 0F, 0F, 0F);
	      Right_Finger_1 = new ModelRenderer(this, 14, 23);
	      Right_Finger_1.addBox(-1F, 7.533333F, -2F, 1, 2, 1);
	      Right_Finger_1.setRotationPoint(-5.5F, 4.5F, 2F);
	      Right_Finger_1.setTextureSize(128, 64);
	      Right_Finger_1.mirror = true;
	      setRotation(Right_Finger_1, -0.1047198F, 0F, 0F);
	      Right_Finger_2 = new ModelRenderer(this, 14, 23);
	      Right_Finger_2.addBox(-1F, 7.533333F, 0F, 1, 2, 1);
	      Right_Finger_2.setRotationPoint(-5.5F, 4.5F, 2F);
	      Right_Finger_2.setTextureSize(128, 64);
	      Right_Finger_2.mirror = true;
	      setRotation(Right_Finger_2, -0.1047198F, 0F, 0F);
	      Right_Finger_3 = new ModelRenderer(this, 14, 23);
	      Right_Finger_3.addBox(-1.3F, 7.533333F, -1F, 1, 2, 1);
	      Right_Finger_3.setRotationPoint(-5.5F, 4.5F, 2F);
	      Right_Finger_3.setTextureSize(128, 64);
	      Right_Finger_3.mirror = true;
	      setRotation(Right_Finger_3, -0.1047198F, 0F, 0F);
	      Right_Finger_4 = new ModelRenderer(this, 14, 23);
	      Right_Finger_4.addBox(-0.1333333F, 7.1F, -2.333333F, 1, 2, 1);
	      Right_Finger_4.setRotationPoint(-5.5F, 4.5F, 2F);
	      Right_Finger_4.setTextureSize(128, 64);
	      Right_Finger_4.mirror = true;
	      setRotation(Right_Finger_4, -0.1047198F, 0F, 0F);
	      Left_Finger_1 = new ModelRenderer(this, 14, 23);
	      Left_Finger_1.addBox(0F, 7.533333F, -2F, 1, 2, 1);
	      Left_Finger_1.setRotationPoint(5.5F, 4.5F, 2F);
	      Left_Finger_1.setTextureSize(128, 64);
	      Left_Finger_1.mirror = true;
	      setRotation(Left_Finger_1, -0.1047198F, 0F, 0F);
	      Left_Finger_2 = new ModelRenderer(this, 14, 23);
	      Left_Finger_2.addBox(0F, 7.533333F, 0F, 1, 2, 1);
	      Left_Finger_2.setRotationPoint(5.5F, 4.5F, 2F);
	      Left_Finger_2.setTextureSize(128, 64);
	      Left_Finger_2.mirror = true;
	      setRotation(Left_Finger_2, -0.1047198F, 0F, 0F);
	      Left_Finger_3 = new ModelRenderer(this, 14, 23);
	      Left_Finger_3.addBox(0.3F, 7.533333F, -1F, 1, 2, 1);
	      Left_Finger_3.setRotationPoint(5.5F, 4.5F, 2F);
	      Left_Finger_3.setTextureSize(128, 64);
	      Left_Finger_3.mirror = true;
	      setRotation(Left_Finger_3, -0.1047198F, 0F, 0F);
	      Left_Finger_4 = new ModelRenderer(this, 14, 23);
	      Left_Finger_4.addBox(-0.9F, 7.1F, -2.3F, 1, 2, 1);
	      Left_Finger_4.setRotationPoint(5.5F, 4.5F, 2F);
	      Left_Finger_4.setTextureSize(128, 64);
	      Left_Finger_4.mirror = true;
	      setRotation(Left_Finger_4, -0.1047198F, 0F, 0F);
	      Button_1 = new ModelRenderer(this, 19, 42);
	      Button_1.addBox(-0.5F, -3.366667F, -2.366667F, 1, 1, 1);
	      Button_1.setRotationPoint(0F, 4.3F, 1F);
	      Button_1.setTextureSize(128, 64);
	      Button_1.mirror = true;
	      setRotation(Button_1, 0.0349066F, 0F, 0F);
	      Button_2 = new ModelRenderer(this, 19, 42);
	      Button_2.addBox(-0.5F, -1.966667F, -2.4F, 1, 1, 1);
	      Button_2.setRotationPoint(0F, 4.3F, 1F);
	      Button_2.setTextureSize(128, 64);
	      Button_2.mirror = true;
	      setRotation(Button_2, 0.0349066F, 0F, 0F);
	      Head_3 = new ModelRenderer(this, 75, 44);
	      Head_3.addBox(-3F, -1F, -1F, 6, 1, 2);
	      Head_3.setRotationPoint(0F, -1.9F, 2.733333F);
	      Head_3.setTextureSize(128, 64);
	      Head_3.mirror = true;
	      setRotation(Head_3, 0F, 0F, 0F);
	      Lower_Teeth = new ModelRenderer(this, 10, 29);
	      Lower_Teeth.addBox(-2F, -0.4666667F, -5.733333F, 4, 1, 0);
	      Lower_Teeth.setRotationPoint(0F, -2.433333F, 2.733333F);
	      Lower_Teeth.setTextureSize(128, 64);
	      Lower_Teeth.mirror = true;
	      setRotation(Lower_Teeth, 0.122173F, 0F, 0F);
	      Upper_Teeth = new ModelRenderer(this, 10, 29);
	      Upper_Teeth.addBox(-2F, -2.466667F, -5.733333F, 4, 2, 0);
	      Upper_Teeth.setRotationPoint(0F, -1.9F, 2.733333F);
	      Upper_Teeth.setTextureSize(128, 64);
	      Upper_Teeth.mirror = true;
	      setRotation(Upper_Teeth, 0F, 0F, 0F);
	      Upper_Teeth.mirror = false;
	      Upper_Mouth_3 = new ModelRenderer(this, 46, 21);
	      Upper_Mouth_3.addBox(-2F, -2.7F, -6F, 4, 1, 1);
	      Upper_Mouth_3.setRotationPoint(0F, -1.9F, 2.733333F);
	      Upper_Mouth_3.setTextureSize(128, 64);
	      Upper_Mouth_3.mirror = true;
	      setRotation(Upper_Mouth_3, 0F, 0F, 0F);
	  }
	  
	  public void render(net.minecraft.entity.Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Right_Leg_1.render(f5);
	    Left_Leg_1.render(f5);
	    Right_Leg_2.render(f5);
	    Left_Leg_2.render(f5);
	    Right_Knee.render(f5);
	    Left_Knee.render(f5);
	    Hip.render(f5);
	    Right_Leg_3.render(f5);
	    Left_Leg_3.render(f5);
	    Body_articulation.render(f5);
	    Body_1.render(f5);
	    Left_Leg_articulation.render(f5);
	    Right_Leg_articulation.render(f5);
	    Body_2.render(f5);
	    Neck.render(f5);
	    Lower_Mouth_1.render(f5);
	    Lower_Mouth_2.render(f5);
	    Head_1.render(f5);
	    Head_2.render(f5);
	    Upper_Mouth_1.render(f5);
	    Upper_Mouth_2.render(f5);
	    Nose.render(f5);
	    Right_Ear.render(f5);
	    Left_Ear_1.render(f5);
	    Left_Ear_2.render(f5);
	    Right_Shoulder.render(f5);
	    Left_Shoulder.render(f5);
	    Right_Arm_1.render(f5);
	    Left_Arm_1.render(f5);
	    Right_Arm_2.render(f5);
	    Left_Arm_2.render(f5);
	    Right_Hand.render(f5);
	    Left_Hand.render(f5);
	    Right_Eye.render(f5);
	    Left_Eye.render(f5);
	    Right_Finger_1.render(f5);
	    Right_Finger_2.render(f5);
	    Right_Finger_3.render(f5);
	    Right_Finger_4.render(f5);
	    Left_Finger_1.render(f5);
	    Left_Finger_2.render(f5);
	    Left_Finger_3.render(f5);
	    Left_Finger_4.render(f5);
	    Button_1.render(f5);
	    Button_2.render(f5);
	    Head_3.render(f5);
	    Lower_Teeth.render(f5);
	    Upper_Teeth.render(f5);
	    Upper_Mouth_3.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	  }

	}
