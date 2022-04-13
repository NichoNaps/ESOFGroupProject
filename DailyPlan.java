package Sprint1;
import java.io.*;
import java.util.*;
public class DailyPlan extends {

    public ArrayList<Recipe> createPlan(){
        //start local variables
        int iNumofMeals = 3; //number of meals for the day
        ArrayList<Recipe> dailyPlan = new ArrayList<Recipe>(iNumofMeals); //array of recipes for day
        //end local variables



        for (int i = 1; i <= iNumofMeals; i++) {
            Recipe recipe = new Recipe();
            dailyPlan.add(recipe.getIngredients());
        }

        return dailyPlan;
    }

}
