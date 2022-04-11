/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Maliziola
 */
public class Recipe {
    String name;
    ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
    
    Recipe() {}
    
    void setName(String n) {
        name = n;
    }
    
    String getName() {
        return name;
    }
    
    void addIngredient(Ingredient i) {
        ingredient.add(i)
    }
    
    void getIngredients() {
        return ingredient;
    }
}
