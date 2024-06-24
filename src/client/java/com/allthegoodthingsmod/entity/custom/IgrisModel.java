// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.example.mod;
   
public class Igris extends EntityModel<Entity> {
	private final ModelPart bone2;
	private final ModelPart body;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart Cape;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart RightOmArm;
	private final ModelPart RightArm;
	private final ModelPart RightMArm;
	private final ModelPart Sword;
	private final ModelPart LeftOmArm;
	private final ModelPart LeftArm;
	private final ModelPart LeftMArm;
	private final ModelPart Rightleg;
	private final ModelPart RightMLeg;
	private final ModelPart Leftleg;
	private final ModelPart LeftMLeg;
	public Igris(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.body = root.getChild("body");
		this.Head = root.getChild("Head");
		this.bone = root.getChild("bone");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.Cape = root.getChild("Cape");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.RightOmArm = root.getChild("RightOmArm");
		this.RightArm = root.getChild("RightArm");
		this.RightMArm = root.getChild("RightMArm");
		this.Sword = root.getChild("Sword");
		this.LeftOmArm = root.getChild("LeftOmArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftMArm = root.getChild("LeftMArm");
		this.Rightleg = root.getChild("Rightleg");
		this.RightMLeg = root.getChild("RightMLeg");
		this.Leftleg = root.getChild("Leftleg");
		this.LeftMLeg = root.getChild("LeftMLeg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone2 = modelPartData.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = bone2.addChild("body", ModelPartBuilder.create().uv(49, 32).cuboid(-7.0F, -17.9981F, -5.0436F, 14.0F, 9.0F, 10.0F, new Dilation(0.0F))
		.uv(82, 74).cuboid(-6.0F, -9.5F, -3.0F, 12.0F, 10.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -19.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(0, 107).cuboid(-2.5F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new Dilation(0.01F)), ModelTransform.of(-5.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.3927F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(62, 108).cuboid(-1.5F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new Dilation(0.01F)), ModelTransform.of(5.0F, 2.0F, 0.5F, 0.0F, 0.0F, -0.3927F));

		ModelPartData Head = body.addChild("Head", ModelPartBuilder.create().uv(49, 52).cuboid(-5.0F, -12.2385F, -5.3262F, 10.0F, 11.0F, 10.0F, new Dilation(0.2F))
		.uv(0, 86).cuboid(-8.5F, -19.2385F, -5.2262F, 17.0F, 20.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 65).cuboid(-5.0F, -12.2385F, -5.3262F, 10.0F, 11.0F, 10.0F, new Dilation(0.0F))
		.uv(90, 61).cuboid(-4.0F, -2.2385F, -3.3262F, 8.0F, 3.0F, 7.0F, new Dilation(0.0F))
		.uv(25, 16).cuboid(-1.0F, -15.2385F, -1.3262F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -17.7615F, 0.3262F));

		ModelPartData Head_r1 = Head.addChild("Head_r1", ModelPartBuilder.create().uv(70, 123).cuboid(-0.75F, -1.5F, -2.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.2F)), ModelTransform.of(5.5F, -6.7385F, -0.3262F, 0.0F, 0.0F, 0.3927F));

		ModelPartData Head_r2 = Head.addChild("Head_r2", ModelPartBuilder.create().uv(57, 123).cuboid(-1.25F, -1.5F, -2.0F, 2.0F, 6.0F, 4.0F, new Dilation(0.2F)), ModelTransform.of(-5.5F, -6.7385F, -0.3262F, 0.0F, 0.0F, -0.3927F));

		ModelPartData bone = Head.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -14.6038F, 0.1617F));

		ModelPartData bone_r1 = bone.addChild("bone_r1", ModelPartBuilder.create().uv(73, 92).cuboid(-3.0F, -3.5F, -3.0F, 6.0F, 6.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.6348F, -0.4879F, 0.7854F, 0.0F, 0.0F));

		ModelPartData bone5 = bone.addChild("bone5", ModelPartBuilder.create().uv(90, 44).cuboid(-4.0F, -5.1827F, -0.6321F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.9878F, 1.4452F));

		ModelPartData bone6 = bone5.addChild("bone6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.1058F, 7.2107F));

		ModelPartData bone6_r1 = bone6.addChild("bone6_r1", ModelPartBuilder.create().uv(94, 24).cuboid(-3.0F, -0.5F, -5.0F, 6.0F, 6.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5724F, 2.9976F, -0.7854F, 0.0F, 0.0F));

		ModelPartData bone7 = bone6.addChild("bone7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 2.9335F, 4.2386F));

		ModelPartData bone7_r1 = bone7.addChild("bone7_r1", ModelPartBuilder.create().uv(95, 99).cuboid(-2.0F, 0.5F, -5.0F, 4.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.887F, 2.0971F, -1.3526F, 0.0F, 0.0F));

		ModelPartData bone8 = bone7.addChild("bone8", ModelPartBuilder.create().uv(23, 107).cuboid(-1.0F, -1.0F, -1.5F, 2.0F, 16.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.06F, 0.4518F));

		ModelPartData Cape = body.addChild("Cape", ModelPartBuilder.create().uv(87, 1).cuboid(-10.0F, 0.0F, 0.7995F, 20.0F, 10.0F, 0.0F, new Dilation(0.0F))
		.uv(122, 28).cuboid(-9.0F, 0.0F, -0.2995F, 18.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -17.9981F, 5.1569F));

		ModelPartData bone3 = Cape.addChild("bone3", ModelPartBuilder.create().uv(49, 16).cuboid(-13.0F, 0.0F, 0.05F, 26.0F, 15.0F, 0.0F, new Dilation(0.0F))
		.uv(82, 127).cuboid(-12.0F, 0.0F, -0.05F, 24.0F, 15.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.0F, 0.7495F));

		ModelPartData bone4 = bone3.addChild("bone4", ModelPartBuilder.create().uv(25, 0).cuboid(-15.0F, 0.0F, 0.05F, 30.0F, 15.0F, 0.0F, new Dilation(0.0F))
		.uv(127, 0).cuboid(-14.0F, 0.0F, -0.05F, 28.0F, 15.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, 0.0F));

		ModelPartData RightOmArm = body.addChild("RightOmArm", ModelPartBuilder.create(), ModelTransform.pivot(-6.8195F, -15.0521F, 0.3859F));

		ModelPartData RightOmArm_r1 = RightOmArm.addChild("RightOmArm_r1", ModelPartBuilder.create().uv(40, 94).mirrored().cuboid(-10.5F, -11.0F, 1.5F, 14.0F, 16.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
		.uv(41, 74).mirrored().cuboid(-5.5F, -3.0F, -4.9564F, 9.0F, 8.0F, 11.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.6805F, 0.054F, -1.4077F, 0.0F, 0.0F, -0.2182F));

		ModelPartData RightArm = RightOmArm.addChild("RightArm", ModelPartBuilder.create().uv(39, 123).cuboid(-4.1805F, -1.4479F, -2.8641F, 4.0F, 13.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData RightMArm = RightArm.addChild("RightMArm", ModelPartBuilder.create().uv(122, 18).cuboid(0.0F, 0.0F, -5.0F, 4.0F, 2.0F, 5.0F, new Dilation(0.3F))
		.uv(0, 0).cuboid(0.0F, 0.0F, -5.0F, 4.0F, 11.0F, 5.0F, new Dilation(0.0F))
		.uv(115, 39).cuboid(-6.7779F, -4.2082F, -2.5436F, 11.0F, 9.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.1805F, 11.5521F, 2.1359F));

		ModelPartData Sword = RightMArm.addChild("Sword", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 8.9F, -3.5218F));

		ModelPartData Sword_r1 = Sword.addChild("Sword_r1", ModelPartBuilder.create().uv(34, 86).cuboid(-26.5F, -49.0F, -0.5F, 1.0F, 17.0F, 1.0F, new Dilation(0.0F))
		.uv(120, 58).cuboid(-27.0F, -32.0F, -1.0F, 2.0F, 21.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 71).cuboid(-30.0F, -11.0F, -1.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 107).cuboid(-27.0F, -9.0F, -1.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(128, 48).cuboid(-34.0F, -56.0F, 0.0F, 16.0F, 47.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 26.0F, 6.6F, 1.5708F, 0.0F, 1.5708F));

		ModelPartData LeftOmArm = body.addChild("LeftOmArm", ModelPartBuilder.create(), ModelTransform.pivot(6.8195F, -15.0521F, 0.8641F));

		ModelPartData LeftOmArm_r1 = LeftOmArm.addChild("LeftOmArm_r1", ModelPartBuilder.create().uv(40, 94).cuboid(-3.5F, -11.0F, 1.5F, 14.0F, 16.0F, 0.0F, new Dilation(0.0F))
		.uv(41, 74).cuboid(-3.5F, -3.0F, -4.9564F, 9.0F, 8.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.6805F, 0.054F, -1.4077F, 0.0F, 0.0F, 0.2182F));

		ModelPartData LeftArm = LeftOmArm.addChild("LeftArm", ModelPartBuilder.create().uv(39, 123).mirrored().cuboid(0.1805F, -1.4479F, -2.8641F, 4.0F, 13.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData LeftMArm = LeftArm.addChild("LeftMArm", ModelPartBuilder.create().uv(122, 18).mirrored().cuboid(-4.0F, 0.0F, -5.0F, 4.0F, 2.0F, 5.0F, new Dilation(0.3F)).mirrored(false)
		.uv(0, 0).mirrored().cuboid(-4.0F, 0.0F, -5.0F, 4.0F, 11.0F, 5.0F, new Dilation(0.0F)).mirrored(false)
		.uv(115, 39).mirrored().cuboid(-4.2221F, -4.2082F, -2.5436F, 11.0F, 9.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.1805F, 11.5521F, 2.1359F));

		ModelPartData Rightleg = bone2.addChild("Rightleg", ModelPartBuilder.create().uv(101, 11).cuboid(-2.5F, 0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.5F, -19.0F, 0.5F));

		ModelPartData RightMLeg = Rightleg.addChild("RightMLeg", ModelPartBuilder.create().uv(0, 122).cuboid(-2.5F, 1.0F, -0.5F, 5.0F, 4.0F, 5.0F, new Dilation(0.2F))
		.uv(113, 92).cuboid(-2.5F, 3.0F, -0.5F, 5.0F, 7.0F, 5.0F, new Dilation(0.0F))
		.uv(85, 113).cuboid(-2.5F, 10.0F, -2.5F, 5.0F, 3.0F, 7.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, 6.5F, -2.0F));

		ModelPartData Leftleg = bone2.addChild("Leftleg", ModelPartBuilder.create().uv(101, 11).mirrored().cuboid(-2.5F, 0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(3.5F, -19.0F, 0.5F));

		ModelPartData LeftMLeg = Leftleg.addChild("LeftMLeg", ModelPartBuilder.create().uv(0, 122).mirrored().cuboid(-2.5F, 1.0F, -0.5F, 5.0F, 4.0F, 5.0F, new Dilation(0.2F)).mirrored(false)
		.uv(113, 92).mirrored().cuboid(-2.5F, 3.0F, -0.5F, 5.0F, 7.0F, 5.0F, new Dilation(0.0F)).mirrored(false)
		.uv(85, 113).mirrored().cuboid(-2.5F, 10.0F, -2.5F, 5.0F, 3.0F, 7.0F, new Dilation(0.2F)).mirrored(false), ModelTransform.pivot(0.0F, 6.5F, -2.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}