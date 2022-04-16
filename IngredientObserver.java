package ESOFGroupProject;

/**
 * Represents something that recieves ingredients from other classes.
 * @author Nicholas C
 */
public interface IngredientObserver {
    
    public void addIngredient(Ingredient newIngredient);
    public void removeIngredient(Ingredient oldIngredient);
}
