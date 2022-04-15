package ESOFGroupProject;

import java.io.*;
import java.util.*;

public class DailyPlan {
    //start varibale declaration
    private static final int iNumofMeals = 3; //number of meals for the day
    private ArrayList<Recipe> recipes = new ArrayList<Recipe>(iNumofMeals); //array of recipes for day
    private int check = 0; //check if array has been populated
    //end variable declaration

    public ArrayList<Recipe> getRecipes(){ // returns an array of recipes
        if(check == 0){  // If the array has not been populated then populate the array and set the check to 1
            check = 1;
            populateRecipes();   
        }
        return recipes;
    }

    private ArrayList<Recipe> populateRecipes(){ // populates the array with recipes
        for (int i = 1; i <= iNumofMeals; i++) {
            Recipe recipe = new Recipe();
            recipes.add(recipe.getIngredients());
        }
    }

}
