package io.github.meatwo310.noitemcombine.mixin;

import io.github.meatwo310.noitemcombine.Config;
import net.minecraft.world.entity.item.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public class DoNotCombine {
    @Inject(method = "isMergable", at = @At("HEAD"), cancellable = true)
    private void isMergeable(CallbackInfoReturnable<Boolean> cir) {
        if (Config.FORCE_STOP_COMBINE.get()) cir.setReturnValue(false);
    }

    @Redirect(method = "mergeWithNeighbours", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/item/ItemEntity;getBoundingBox()Lnet/minecraft/world/phys/AABB;"))
    private net.minecraft.world.phys.AABB changeBoundingBox(ItemEntity itemEntity) {
        return itemEntity.getBoundingBox().inflate(Config.X_RANGE.get(), Config.Y_RANGE.get(), Config.Z_RANGE.get());
    }
}