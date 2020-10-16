package se.lexicon.romeobot.RecipeDatabase;

import java.util.List;

public class Recipe {

    private int recipeId;
    private String recipeName;
    private List<RecipeIngredient> recipeIngredients;
    RecipeInstruction instruction;
    List<RecipeCategory> categories;
}
