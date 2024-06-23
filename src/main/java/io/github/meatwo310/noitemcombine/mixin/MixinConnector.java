package io.github.meatwo310.noitemcombine.mixin;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class MixinConnector implements IMixinConnector  {
    @Override
    public void connect() {
        Mixins.addConfigurations("mixins.noitemcombine.json");
    }
}
