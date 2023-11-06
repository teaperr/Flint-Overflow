package net.teaper.flintoverflow.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.flintoverflow.FlintOverflow;

public class OverflowBlocks {

    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X1 = registerBlock("compressed_flint_block_x1",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X2 = registerBlock("compressed_flint_block_x2",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X3 = registerBlock("compressed_flint_block_x3",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X4 = registerBlock("compressed_flint_block_x4",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X5 = registerBlock("compressed_flint_block_x5",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X6 = registerBlock("compressed_flint_block_x6",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X7 = registerBlock("compressed_flint_block_x7",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COMPRESSED_FLINT_BLOCK_X8 = registerBlock("compressed_flint_block_x8",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(FlintOverflow.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(FlintOverflow.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        FlintOverflow.LOGGER.debug("Registering Blocks for " + FlintOverflow.MOD_ID);
    }
}
