package com.example.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "damage")
	private void damageInjection(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {

	}
}