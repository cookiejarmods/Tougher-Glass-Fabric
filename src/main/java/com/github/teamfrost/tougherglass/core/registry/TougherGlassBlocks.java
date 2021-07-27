package com.github.teamfrost.tougherglass.core.registry;

import com.github.teamfrost.tougherglass.core.TougherGlass;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.registry.Registry;

public class TougherGlassBlocks {

    public static Block REINFORCED_GLASS = register("reinforced_glass", new GlassBlock(Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_WHITE_STAINED_GLASS = register("reinforced_white_stained_glass", new StainedGlassBlock(DyeColor.WHITE, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_ORANGE_STAINED_GLASS = register("reinforced_orange_stained_glass", new StainedGlassBlock(DyeColor.ORANGE, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_MAGENTA_STAINED_GLASS = register("reinforced_magenta_stained_glass", new StainedGlassBlock(DyeColor.MAGENTA, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_LIGHT_BLUE_STAINED_GLASS = register("reinforced_light_blue_stained_glass", new StainedGlassBlock(DyeColor.LIGHT_BLUE, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_YELLOW_STAINED_GLASS = register("reinforced_yellow_stained_glass", new StainedGlassBlock(DyeColor.YELLOW, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_LIME_STAINED_GLASS = register("reinforced_lime_stained_glass", new StainedGlassBlock(DyeColor.LIME, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_PINK_STAINED_GLASS = register("reinforced_pink_stained_glass", new StainedGlassBlock(DyeColor.PINK, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_GRAY_STAINED_GLASS = register("reinforced_gray_stained_glass", new StainedGlassBlock(DyeColor.GRAY, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_LIGHT_GRAY_STAINED_GLASS = register("reinforced_light_gray_stained_glass", new StainedGlassBlock(DyeColor.LIGHT_GRAY, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_CYAN_STAINED_GLASS = register("reinforced_cyan_stained_glass", new StainedGlassBlock(DyeColor.CYAN, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_PURPLE_STAINED_GLASS = register("reinforced_purple_stained_glass",new StainedGlassBlock(DyeColor.PURPLE, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_BLUE_STAINED_GLASS = register("reinforced_blue_stained_glass", new StainedGlassBlock(DyeColor.BLUE, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_BROWN_STAINED_GLASS = register("reinforced_brown_stained_glass", new StainedGlassBlock(DyeColor.BROWN, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_GREEN_STAINED_GLASS = register("reinforced_green_stained_glass", new StainedGlassBlock(DyeColor.GREEN, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_RED_STAINED_GLASS = register("reinforced_red_stained_glass", new StainedGlassBlock(DyeColor.RED, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);
    public static Block REINFORCED_BLACK_STAINED_GLASS = register("reinforced_black_stained_glass", new StainedGlassBlock(DyeColor.BLACK, Settings.REINFORCED_GLASS), ItemGroup.BUILDING_BLOCKS);


    public static void init(){}

    public static class Settings {
        public static FabricBlockSettings REINFORCED_GLASS = FabricBlockSettings.copyOf(Blocks.GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque();
    }

    public static <T extends Block> T register(String path, T block, ItemGroup group) {
        Registry.register(Registry.BLOCK, TougherGlass.id(path), block);
        Registry.register(Registry.ITEM, TougherGlass.id(path), new BlockItem(block, new FabricItemSettings().group(group)));

        return block;
    }

    public static <T extends Block> T register(String path, T block) {
        Registry.register(Registry.BLOCK, TougherGlass.id(path), block);

        return block;
    }
}
