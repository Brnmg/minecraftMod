package com.allthegoodthingsmod.entity;

import com.allthegoodthingsmod.ExampleMod;
import com.allthegoodthingsmod.entity.custom.IgrisEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<IgrisEntity> IGRIS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ExampleMod.MOD_ID, "shadow_igris"),
            EntityType.Builder.create(IgrisEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 3f).build());

    public static void registerModEntities() {
        ExampleMod.LOGGER.info("Registering Entities");
    }
}
