package com.julian.oilindustry.items;

import com.julian.oilindustry.OilIndustry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final ItemEntry<Item> STEEL_INGOT =
            OilIndustry.REGISTRATE
                    .item("steel_ingot", Item::new)
                    .register();

    public static void init() {}

}
