package com.github.teamfrost.tougherglass.data.basic;

import com.github.teamfrost.tougherglass.core.TougherGlass;
import com.github.teamfrost.tougherglass.core.registry.TougherGlassBlocks;
import com.github.teamfrost.tougherglass.data.TougherDataGen;
import me.shedaniel.cloth.api.datagen.v1.RecipeData;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import org.apache.logging.log4j.Level;

public class TougherRecipes {
    public static void init(RecipeData recipes) {
        try {
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.GLASS)
                    .criterion("has_" + Blocks.GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_WHITE_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.WHITE_STAINED_GLASS)
                    .criterion("has_" + Blocks.WHITE_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.WHITE_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_ORANGE_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.ORANGE_STAINED_GLASS)
                    .criterion("has_" + Blocks.ORANGE_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.ORANGE_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_MAGENTA_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.MAGENTA_STAINED_GLASS)
                    .criterion("has_" + Blocks.MAGENTA_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.MAGENTA_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_LIGHT_BLUE_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.LIGHT_BLUE_STAINED_GLASS)
                    .criterion("has_" + Blocks.LIGHT_BLUE_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.LIGHT_BLUE_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_YELLOW_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.YELLOW_STAINED_GLASS)
                    .criterion("has_" + Blocks.YELLOW_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.YELLOW_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_LIME_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.LIME_STAINED_GLASS)
                    .criterion("has_" + Blocks.LIME_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.LIME_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_PINK_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.PINK_STAINED_GLASS)
                    .criterion("has_" + Blocks.PINK_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.PINK_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_GRAY_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.GRAY_STAINED_GLASS)
                    .criterion("has_" + Blocks.GRAY_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.GRAY_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_LIGHT_GRAY_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.LIGHT_GRAY_STAINED_GLASS)
                    .criterion("has_" + Blocks.LIGHT_GRAY_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.LIGHT_GRAY_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_CYAN_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.CYAN_STAINED_GLASS)
                    .criterion("has_" + Blocks.CYAN_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.CYAN_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_PURPLE_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.PURPLE_STAINED_GLASS)
                    .criterion("has_" + Blocks.PURPLE_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.PURPLE_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_BLUE_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.BLUE_STAINED_GLASS)
                    .criterion("has_" + Blocks.BLUE_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.BLUE_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_BROWN_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.BROWN_STAINED_GLASS)
                    .criterion("has_" + Blocks.BROWN_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.BROWN_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_GREEN_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.GREEN_STAINED_GLASS)
                    .criterion("has_" + Blocks.GREEN_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.GREEN_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_RED_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.RED_STAINED_GLASS)
                    .criterion("has_" + Blocks.RED_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.RED_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);
            ShapedRecipeJsonFactory.create(TougherGlassBlocks.REINFORCED_BLACK_STAINED_GLASS, 1)
                    .pattern("###")
                    .pattern("#G#")
                    .pattern("###")
                    .input('#', Blocks.OBSIDIAN)
                    .input('G', Blocks.BLACK_STAINED_GLASS)
                    .criterion("has_" + Blocks.BLACK_STAINED_GLASS.toString(), InventoryChangedCriterion.Conditions.items(Blocks.BLACK_STAINED_GLASS))
                    .criterion("has_" + Blocks.OBSIDIAN.toString(), InventoryChangedCriterion.Conditions.items(Blocks.OBSIDIAN))
                    .offerTo(recipes);

            TougherDataGen.handler.run();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            TougherGlass.log(Level.INFO, "TougherRecipes Failed!");
            System.exit(1);
        }
        TougherGlass.log(Level.INFO, "TougherRecipes Loaded!");
    }
}
