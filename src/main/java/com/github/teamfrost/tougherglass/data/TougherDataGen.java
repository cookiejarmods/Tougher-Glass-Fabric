package com.github.teamfrost.tougherglass.data;

import com.github.teamfrost.tougherglass.core.TougherGlass;
import com.github.teamfrost.tougherglass.data.basic.TougherRecipes;
import com.github.teamfrost.tougherglass.data.basic.TougherStates;
import com.github.teamfrost.tougherglass.data.basic.TougherTables;
import me.shedaniel.cloth.api.datagen.v1.DataGeneratorHandler;
import me.shedaniel.cloth.api.datagen.v1.LootTableData;
import me.shedaniel.cloth.api.datagen.v1.ModelStateData;
import me.shedaniel.cloth.api.datagen.v1.RecipeData;
import org.apache.logging.log4j.Level;

import java.nio.file.Paths;

public class TougherDataGen {
    public static final DataGeneratorHandler handler = DataGeneratorHandler.create(Paths.get("../src/generated/resources"));

    public static void init() {
        ModelStateData modelStates = handler.getModelStates();
        LootTableData tables = handler.getLootTables();
        RecipeData recipes = handler.getRecipes();

        TougherStates.init(modelStates);
        TougherTables.init(tables);
        TougherRecipes.init(recipes);

        TougherGlass.log(Level.INFO, "TougherDataGen Loaded!");
    }
}
