package net.itscyno.ageofillagers.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.itscyno.ageofillagers.AoiMain;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class AoiItemGroups {
    public static final ItemGroup AOI_MAIN = FabricItemGroupBuilder.build(new Identifier(AoiMain.MOD_ID, "aoi_main"),
            () -> new ItemStack(AoiItems.BRONZE_ALLOY));

    public static final ItemGroup AOI_EGGS = FabricItemGroupBuilder.build(new Identifier(AoiMain.MOD_ID, "aoi_eggs"),
            () -> new ItemStack(Items.PILLAGER_SPAWN_EGG));
}
