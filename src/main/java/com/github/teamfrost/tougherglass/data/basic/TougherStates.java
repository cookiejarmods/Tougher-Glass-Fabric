package com.github.teamfrost.tougherglass.data.basic;

import com.github.teamfrost.tougherglass.core.TougherGlass;
import com.github.teamfrost.tougherglass.core.registry.TougherGlassBlocks;
import com.github.teamfrost.tougherglass.data.TougherDataGen;
import me.shedaniel.cloth.api.datagen.v1.ModelStateData;
import net.minecraft.data.client.model.TexturedModel;
import org.apache.logging.log4j.Level;

public class TougherStates {
    public static void init(ModelStateData states) {
        try {
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_WHITE_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_ORANGE_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_MAGENTA_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_LIGHT_BLUE_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_YELLOW_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_LIME_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_PINK_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_GRAY_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_LIGHT_GRAY_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_CYAN_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_PURPLE_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_BLUE_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_BROWN_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_GREEN_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_RED_STAINED_GLASS, TexturedModel.CUBE_ALL);
            states.addSingletonBlock(TougherGlassBlocks.REINFORCED_BLACK_STAINED_GLASS, TexturedModel.CUBE_ALL);

            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_WHITE_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_ORANGE_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_MAGENTA_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_LIGHT_BLUE_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_YELLOW_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_LIME_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_PINK_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_GRAY_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_LIGHT_GRAY_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_CYAN_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_PURPLE_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_BLUE_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_BROWN_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_GREEN_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_RED_STAINED_GLASS);
            states.addSimpleBlockItemModel(TougherGlassBlocks.REINFORCED_BLACK_STAINED_GLASS);

            TougherDataGen.handler.run();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            TougherGlass.log(Level.INFO, "TougherStates Failed!");
            System.exit(1);
        }
        TougherGlass.log(Level.INFO, "TougherStates Loaded!");
    }
}
