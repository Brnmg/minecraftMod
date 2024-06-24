package com.allthegoodthingsmod;

import com.allthegoodthingsmod.block.ModBlocks;
import com.allthegoodthingsmod.entity.ModEntities;
import com.allthegoodthingsmod.entity.ModModelLayers;
import com.allthegoodthingsmod.entity.custom.IgrisModel;
import com.allthegoodthingsmod.entity.custom.IgrisRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ExampleModClient implements ClientModInitializer {
	public static final String MOD_ID = "allthegoodthingsmod";

	public static final Identifier KNIGHT_KILLER = id("knight_killer");
	public static final Identifier MAGIC_CRYSTAL = id("magic_crystal");


	@Override
	public void onInitializeClient() {
		ModelLoadingPlugin.register(pluginContext -> {
			pluginContext.addModels(KNIGHT_KILLER);
			pluginContext.addModels(MAGIC_CRYSTAL);
		});

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGIC_CRYSTAL, RenderLayer.getTranslucent());

		EntityRendererRegistry.register(ModEntities.IGRIS, IgrisRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.IGRIS, IgrisModel::getTexturedModelData);
	}


	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}