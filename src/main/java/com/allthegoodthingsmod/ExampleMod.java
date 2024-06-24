package com.allthegoodthingsmod;

import com.allthegoodthingsmod.block.ModBlocks;
import com.allthegoodthingsmod.entity.ModEntities;
import com.allthegoodthingsmod.entity.custom.IgrisEntity;
import com.allthegoodthingsmod.item.ModItemGroups;
import com.allthegoodthingsmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExampleMod implements ModInitializer {

	public static final String MOD_ID = "allthegoodthingsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		FabricDefaultAttributeRegistry.register(ModEntities.IGRIS, IgrisEntity.createIgrisAttributes());
	}
}