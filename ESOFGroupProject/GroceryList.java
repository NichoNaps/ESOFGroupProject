package ESOFGroupProject;

import java.util.*;

public class GroceryList implements IngredientObserver {
    private ArrayList<Ingredient> groceryList;

    public GroceryList(){
        groceryList = new ArrayList<Ingredient>();
    }

    public void displayList(){
        int num = 1;
        if(groceryList.isEmpty()){
            System.out.println("Your grocery list is empty");
            return;
        }
        for (Ingredient ingredient : groceryList){
            System.out.println(num + ") " + ingredient.getName());
            num++;
        }
    }
    //  addItem and removeItem functions for user-specified additions and removals
    public void addItem(String s){
        for (Ingredient ingredient : groceryList){
            if (ingredient.getName().equals(s)){
                System.out.println(s + " is already on your list");
                return;
            }
        }
        groceryList.add(new Ingredient(s));
        System.out.println(s + " has been added to your list");
    }

    public void removeItem(String s){
        for (Ingredient ingredient : groceryList){
            if (ingredient.getName().equals(s)){
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

    // addIngredient and removeIngredient for populating groceryList array
    public void addIngredient(Ingredient item){
        for (Ingredient ingredient : groceryList){
            if (ingredient.getName().equals(item.getName())){
                System.out.println(ingredient.getName() + " is already on your list");
                return;
            }
        }
        groceryList.add(new Ingredient(item.getName()));
        System.out.println(item.getName() + " has been added to your list");
    }

    public void removeIngredient(Ingredient item){
        for (Ingredient ingredient : groceryList){
            if (ingredient.getName().equals(item.getName())){
                groceryList.remove(item);
                System.out.println(ingredient.getName() + " is already on your list");
                return;
            }
        }
        System.out.println(item.getName() + " is not on your list");
    }
}
