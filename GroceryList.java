package ESOFGroupProject;

import java.util.*;

public class GroceryList {
    private WeeklyPlan weeklyPlan;
    private ArrayList<Ingredient> groceryList;

    public GroceryList(WeeklyPlan wp){
        this.weeklyPlan = wp;
        groceryList = new ArrayList<Ingredient>();
        // get Mondays plan
        DailyPlan monday = wp.getMonday();
        ArrayList<Recipe> meals = monday.getRecipes();
        // build grocery list array from ingredients in monday plan
        for (Recipe recipe : meals){
            // get recipe ingredients
            for (Ingredient ingredient : recipe.getIngredients()){
                // unique ingredients only
                if (!groceryList.contains(ingredient.getName()))
                    groceryList.add(ingredient);
            }
        }
        // full implementation would repeat for all other days not just Monday
    }
    public void displayList(){
        int num = 1;
        for (Ingredient ingredient : groceryList){
            System.out.println(num + ") " + ingredient.getName());
            num++;
        }
    }

    public void addItem(String s){
        for (Ingredient ingredient : groceryList){
            if (ingredient.getName() == s){
                System.out.println(s + " is already on your list");
                return;
            }
        }
        groceryList.add(new Ingredient(s));
        System.out.println(s + " has been added to your list");
    }

    public void removeItem(String s){
        for (Ingredient ingredient : groceryList){
            if (ingredient.getName() == s){
                groceryList.remove(ingredient);
                System.out.println(s + " has been removed from your list");
                return;
            }
        }
        System.out.println(s + " is not on your list");
    }

    public void clearList(){
        groceryList.clear();
        System.out.println("Grocery list has been cleared");
    }
}
