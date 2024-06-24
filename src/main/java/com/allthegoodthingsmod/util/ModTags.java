package com.allthegoodthingsmod.util;

import com.allthegoodthingsmod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> DETECTABLE_BLOCKS = createTag("detectable_blocks.json");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExampleMod.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
