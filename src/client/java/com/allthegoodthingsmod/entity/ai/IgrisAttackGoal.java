package com.allthegoodthingsmod.entity.ai;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.PathAwareEntity;

public class IgrisAttackGoal extends MeleeAttackGoal {
    public IgrisAttackGoal(PathAwareEntity mob, double speed, boolean pauseWhenMobIdle) {
        super(mob, speed, pauseWhenMobIdle);
    }

}
