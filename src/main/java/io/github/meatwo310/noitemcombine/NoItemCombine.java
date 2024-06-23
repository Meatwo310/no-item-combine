package io.github.meatwo310.noitemcombine;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(NoItemCombine.MODID)
public class NoItemCombine {
    public static final String MODID = "noitemcombine";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NoItemCombine() {
        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
