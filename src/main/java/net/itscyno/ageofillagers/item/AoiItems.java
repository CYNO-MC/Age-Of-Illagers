package net.itscyno.ageofillagers.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.itscyno.ageofillagers.AoiMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AoiItems {

    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_ZINC = registerItem("raw_zinc",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BRONZE_ALLOY = registerItem("bronze_alloy",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AoiMain.MOD_ID, name), item);
    }

    public static void registerAoiItems() {
        System.out.println("Registering Items for " + AoiMain.MOD_ID);
    }

}
