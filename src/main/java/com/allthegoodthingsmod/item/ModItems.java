package com.allthegoodthingsmod.item;

import com.allthegoodthingsmod.ExampleMod;
import com.allthegoodthingsmod.block.ModBlocks;
import com.allthegoodthingsmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FIRST_ITEM = registerItem("first_item", new Item(new Item.Settings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new Item.Settings().maxDamage(64)));
    public static final Item KNIGHT_KILLER = registerItem("knight_killer", new SwordItem(ModToolMaterial.KNIGHT_KILLER, new Item.Settings()));
    public static final Item MAGIC_CRYSTAL = registerItem("magic_crystal", new BlockItem(ModBlocks.MAGIC_CRYSTAL, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID, name), item);
    }

    private static void addItemsToTab(FabricItemGroupEntries entries) {
        entries.add(FIRST_ITEM);
        entries.add(METAL_DETECTOR);
        entries.add(KNIGHT_KILLER);
        entries.add(MAGIC_CRYSTAL);
    }

    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToTab);
    }
}
