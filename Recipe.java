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
    private String name;
    private ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
    
    Recipe() {}
    
    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public void addIngredient(Ingredient i) {
        ingredient.add(i)
    }
    
    public ArrayList<Ingredient> getIngredients() {
        return ingredient;
    }
}
