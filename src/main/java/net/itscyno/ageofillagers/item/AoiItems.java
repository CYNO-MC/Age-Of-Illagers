package net.itscyno.ageofillagers.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.itscyno.ageofillagers.AoiMain;
import net.itscyno.ageofillagers.entity.AoiEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AoiItems {

    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(AoiItemGroups.AOI_MAIN)));

    public static final Item RAW_ZINC = registerItem("raw_zinc",
            new Item(new FabricItemSettings().group(AoiItemGroups.AOI_MAIN)));

    public static final Item BRONZE_ALLOY = registerItem("bronze_alloy",
            new Item(new FabricItemSettings().group(AoiItemGroups.AOI_MAIN)));

    public static final Item BRASS_ALLOY = registerItem("brass_alloy",
            new Item(new FabricItemSettings().group(AoiItemGroups.AOI_MAIN)));

    public static final Item SPAWN_EGG_EXOLLOGER = registerItem("spawn_egg_exolloger",
            new SpawnEggItem(AoiEntities.EXOLLOGER,0x305158, 0xba8363,
                    new FabricItemSettings().group(AoiItemGroups.AOI_EGGS)));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AoiMain.MOD_ID, name), item);
    }

    public static void registerAoiItems() {
        System.out.println("Registering Items for " + AoiMain.MOD_ID);
    }

}
