package com.allthegoodthingsmod.entity.custom;

import com.allthegoodthingsmod.item.ModItems;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class IgrisEntity extends TameableEntity {
    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(IgrisEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public IgrisEntity(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createIgrisAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 50)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 25)
                .add(EntityAttributes.GENERIC_ARMOR, 20);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if(!this.isTamed()) {
            if (!itemStack.isOf(ModItems.MAGIC_CRYSTAL)) return super.interactMob(player, hand);
            itemStack.decrementUnlessCreative(1, player);
            this.tryTame(player);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    private void tryTame(PlayerEntity player) {
        if (this.random.nextInt(3) == 0) {
            this.setOwner(player);
            this.navigation.stop();
            this.setTarget(null);
            this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_POSITIVE_PLAYER_REACTION_PARTICLES);
        } else {
            this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_NEGATIVE_PLAYER_REACTION_PARTICLES);
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
//        this.targetSelector.add(1, new TrackOwnerAttackerGoal(this));
//        this.targetSelector.add(2, new AttackWithOwnerGoal(this));
//        this.goalSelector.add(3, new FollowOwnerGoal(this, 1.0, 10f, 2f));
        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.add(10, new LookAtEntityGoal(this, PlayerEntity.class, 5f));
        this.goalSelector.add(10, new LookAroundGoal(this));

        this.targetSelector.add(1, new ActiveTargetGoal<>(this, HostileEntity.class, true));
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        this.dataTracker.set(ATTACKING, false);
    }

    //    @Override
//    public void tick() {
//        super.tick();
//    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    //Synthetic func, decompiler stuff
    @Override
    public EntityView method_48926() {
        return this.getWorld();
    }
}
