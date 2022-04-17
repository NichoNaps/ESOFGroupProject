package ESOFGroupProject;
/**
 * author of the class is Ethan Skelton
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
        Recipe lunch = new Recipe();
        breakfast.setName("sandwich");
        Recipe dinner = new Recipe();
        breakfast.setName("steak");
        recipes.add(breakfast);
        recipes.add(lunch);
        recipes.add(dinner);
        
    }

}
