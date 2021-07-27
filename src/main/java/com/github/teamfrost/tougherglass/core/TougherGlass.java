package com.github.teamfrost.tougherglass.core;

import com.github.teamfrost.tougherglass.core.registry.TougherGlassBlocks;
import com.github.teamfrost.tougherglass.data.TougherDataGen;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TougherGlass implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "tougherglass";
    public static final String MOD_NAME = "Tougher Glass";

    @Override
    public void onInitialize() {
        TougherGlassBlocks.init();
        TougherDataGen.init();

        log(Level.INFO, "Toughing the Glass!");
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}
