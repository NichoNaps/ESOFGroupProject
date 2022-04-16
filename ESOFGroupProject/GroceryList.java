package ESOFGroupProject;

import java.util.*;

public class GroceryList implements IngredientObserver {
    private ArrayList<Ingredient> groceryList;

    public GroceryList(){
        groceryList = new ArrayList<Ingredient>();
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
