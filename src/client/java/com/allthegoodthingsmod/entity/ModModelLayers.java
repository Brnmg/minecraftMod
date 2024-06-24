package com.allthegoodthingsmod.entity;

import com.allthegoodthingsmod.ExampleMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer IGRIS =
            new EntityModelLayer(Identifier.of(ExampleMod.MOD_ID, "igris"), "main");
}
