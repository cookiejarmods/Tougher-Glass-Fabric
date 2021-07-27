package com.github.teamfrost.tougherglass.data.basic;

import com.github.teamfrost.tougherglass.core.TougherGlass;
import com.github.teamfrost.tougherglass.core.registry.TougherGlassBlocks;
import com.github.teamfrost.tougherglass.data.TougherDataGen;
import me.shedaniel.cloth.api.datagen.v1.LootTableData;
import org.apache.logging.log4j.Level;

public class TougherTables {
    public static void init(LootTableData tables) {
        try {
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_WHITE_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_ORANGE_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_MAGENTA_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_LIGHT_BLUE_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_YELLOW_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_LIME_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_PINK_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_GRAY_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_LIGHT_GRAY_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_CYAN_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_PURPLE_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_BLUE_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_BROWN_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_GREEN_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_RED_STAINED_GLASS);
            tables.registerBlockDropSelfRequiresSilkTouch(TougherGlassBlocks.REINFORCED_BLACK_STAINED_GLASS);

            TougherDataGen.handler.run();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            TougherGlass.log(Level.INFO, "TougherTables Failed!");
            System.exit(1);
        }
        TougherGlass.log(Level.INFO, "TougherTables Loaded!");
    }
}
