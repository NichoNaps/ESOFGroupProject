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
        breakfast.addIngredient("egg");
        breakfast.addIngredient("salt");
        breakfast.addIngredient("shredded cheese");
        
        Recipe lunch = new Recipe();
        lunch.setName("sandwich");
        lunch.addIngredient("bread");
        lunch.addIngredient("sliced cheese");
        lunch.addIngredient("ham");
        
        Recipe dinner = new Recipe();
        dinner.setName("steak");
        dinner.addIngredient("steak");
        dinner.addIngredient("steak seasoning");
        dinner.addIngredient("butter");
        
        recipes.add(breakfast);
        recipes.add(lunch);
        recipes.add(dinner);
        
    }

}
