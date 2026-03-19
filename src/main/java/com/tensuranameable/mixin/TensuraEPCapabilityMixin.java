package com.tensuranameable.mixin;
import com.github.manasmods.tensura.capability.ep.TensuraEPCapability;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
@Mixin(value = TensuraEPCapability.class, remap = false)
public class TensuraEPCapabilityMixin {
    @Inject(method = "canBeNamed", at = @At("HEAD"), cancellable = true)
    private void alwaysNameable(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
