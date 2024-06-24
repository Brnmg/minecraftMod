package com.allthegoodthingsmod.block;

import com.allthegoodthingsmod.ExampleMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MAGIC_CRYSTAL = registerBlock("magic_crystal",
            new Block(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS)
                .requiresTool()
                    .strength(2.0f, 2.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ExampleMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlock() {
        ExampleMod.LOGGER.info("Registering mod blocks");
    }
}
