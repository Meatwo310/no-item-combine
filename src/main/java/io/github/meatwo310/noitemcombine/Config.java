package io.github.meatwo310.noitemcombine;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue FORCE_STOP_COMBINE = BUILDER
            .comment("If true, items will NEVER combine with each other.")
            .define("forceStopCombine", true);

    public static final ForgeConfigSpec.DoubleValue X_RANGE = BUILDER
            .comment("Items within this range will combine. Ignored if forceStopCombine is true.")
            .defineInRange("xRange", 0.5, 0.0, 100.0);

    public static final ForgeConfigSpec.DoubleValue Y_RANGE = BUILDER
            .defineInRange("yRange", 0.0, 0.0, 100.0);

    public static final ForgeConfigSpec.DoubleValue Z_RANGE = BUILDER
            .defineInRange("zRange", 0.5, 0.0, 100.0);

    public static final ForgeConfigSpec SPEC = BUILDER.build();
}
