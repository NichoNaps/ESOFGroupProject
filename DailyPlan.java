package ESOFGroupProject;
/**
 * @author Ethan Skelton
 */
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

    private void populateRecipes(){ // populates the array with recipes
        
        Recipe breakfast = new Recipe();
        breakfast.setName("eggs");
        breakfast.addIngredient(new Ingredient("egg"));
        breakfast.addIngredient(new Ingredient("salt"));
        breakfast.addIngredient(new Ingredient("shredded cheese"));
        
        Recipe lunch = new Recipe();
        lunch.setName("sandwich");
        lunch.addIngredient(new Ingredient("bread"));
        lunch.addIngredient(new Ingredient("sliced cheese"));
        lunch.addIngredient(new Ingredient("ham"));
        
        Recipe dinner = new Recipe();
        dinner.setName("steak");
        dinner.addIngredient(new Ingredient("steak"));
        dinner.addIngredient(new Ingredient("steak seasoning"));
        dinner.addIngredient(new Ingredient("butter"));
        
        recipes.add(breakfast);
        recipes.add(lunch);
        recipes.add(dinner);
        
    }

}
