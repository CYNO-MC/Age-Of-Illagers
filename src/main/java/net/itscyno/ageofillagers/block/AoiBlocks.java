package net.itscyno.ageofillagers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.itscyno.ageofillagers.AoiMain;
import net.itscyno.ageofillagers.item.AoiItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AoiBlocks {

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.METAL, MapColor.PALE_YELLOW).requiresTool()
                    .strength(8.0F, 9.0F).sounds(BlockSoundGroup.COPPER)), AoiItemGroups.AOI_MAIN);

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool()
                    .strength(2.5F, 3.5F).sounds(BlockSoundGroup.STONE)), AoiItemGroups.AOI_MAIN);

    public static final Block ZINC_ORE = registerBlock("zinc_ore",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool()
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.STONE)), AoiItemGroups.AOI_MAIN);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AoiMain.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AoiMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerAoiBlocks() {
        System.out.println("Registering Blocks for " + AoiMain.MOD_ID);
    }
}
