package ESOFGroupProject;
import java.util.*;

public class GroceryList {
    public WeeklyPlan weeklyPlan;
    public ArrayList<String> groceryList;

    public GroceryList(WeeklyPlan wp){
        this.weeklyPlan = wp;
        groceryList = new ArrayList<String>();
        // get Mondays plan
        DailyPlan monday = wp.getMonday();
        ArrayList<Recipe> meals = monday.getRecipes();
        // build grocery list array from ingredients in monday plan
        for (int i = 0; i < meals.size(); i++){
            // get recipe ingredients
            for (int j = 0; j < meals[i].size(); j++){
                // unique ingredients only
                if (!groceryList.contains(meals[i][j].getName()))
                    groceryList.add(meals[i][j].getName());
            }
        }
        // full implementation would repeat for all other days not just Monday
    }
    public void displayList(){
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ") " + groceryList.get(i));
        }
    }

    public ArrayList<String> addItem(String s){
        if (groceryList.contains(s)){
            System.out.println(s + " is already on your list");
        }
        else if (!groceryList.contains(s)){
            groceryList.add(s);
            System.out.println(s + " has been added to your list");
        }
        return groceryList;
    }

    public ArrayList<String> removeItem(String s){
        if (groceryList.contains(s)){
            System.out.println(s + " is already on your list");
        }
        else if (!groceryList.contains(s)){
            System.out.println(s + " is not on your list");
        }
        return groceryList;
    }

    public void clearList(){
        groceryList.clear();
        System.out.println("Grocery list has been cleared");
    }
}
