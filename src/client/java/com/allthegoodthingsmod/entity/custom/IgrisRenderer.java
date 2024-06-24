package com.allthegoodthingsmod.entity.custom;

import com.allthegoodthingsmod.ExampleMod;
import com.allthegoodthingsmod.entity.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class IgrisRenderer extends MobEntityRenderer<IgrisEntity, IgrisModel<IgrisEntity>> {
    private static final Identifier TEXTURE = Identifier.of(ExampleMod.MOD_ID, "textures/entity/shadow_igris.png");

    public IgrisRenderer(EntityRendererFactory.Context context) {
        super(context, new IgrisModel<>(context.getPart(ModModelLayers.IGRIS)), 0.6f);
    }

    @Override
    public Identifier getTexture(IgrisEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(IgrisEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
