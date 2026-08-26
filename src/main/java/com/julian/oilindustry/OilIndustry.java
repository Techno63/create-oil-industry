package com.julian.oilindustry;

import com.julian.oilindustry.items.ModItems;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(OilIndustry.MODID)
public class OilIndustry {

    public static final String MODID = "oilindustry";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final Registrate REGISTRATE = Registrate.create(MODID);

    public OilIndustry(IEventBus modEventBus, ModContainer modContainer) {
        //REGISTRATE.registerEventListeners(modEventBus);

        ModItems.init();
    }
}