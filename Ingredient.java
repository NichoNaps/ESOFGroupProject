package ESOFGroupProject;

/**
 * Represents an ingredient in a recipe. 
 * 
 * In the future the plan would be to add 
 * amount and allergens property. 
 * 
 * @author Nicholas C
 */
public class Ingredient {

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
     * 
     * @author Amanda F
     */
	@Override
	public boolean equals(Object o){
			//reference of both object
			if(this == o) return true;
			//compare value
			Ingredient ingredient = (Ingredient)o;
			if(ingredient.name.equals(this.name)) {
				return true;
			} else return false;
	}
	
	

}
