package ESOFGroupProject;

/**
 * Represents an ingredient in a recipe. 
 * 
 * In the future the plan would be to add 
 * amount and allergens property. 
 * 
 * @author Nicholas C
 */
public class Ingredient implements Comparable<Ingredient> {

    private String name;
    
    public Ingredient(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    /**
     * Compares two ingredients.
     * 
     * note: if we add other ingredient attributes,
     * we will need to change this method.
     */
    @Override
    public int compareTo(Ingredient other) {
        return this.name.compareTo(other.name);
    }
    

}
