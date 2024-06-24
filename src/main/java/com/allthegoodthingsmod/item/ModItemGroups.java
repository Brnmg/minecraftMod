package com.allthegoodthingsmod.item;

import com.allthegoodthingsmod.ExampleMod;
import com.allthegoodthingsmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExampleMod.MOD_ID, "solo_leveling"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.solo_leveling"))
                    .icon(() -> new ItemStack(ModItems.FIRST_ITEM)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.FIRST_ITEM);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.KNIGHT_KILLER);
                        entries.add(ModBlocks.MAGIC_CRYSTAL);
                    }))
                    .build());

    public static void registerItemGroup() {
        ExampleMod.LOGGER.info("Registering mod group");
    }
}
