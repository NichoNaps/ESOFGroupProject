package ESOFGroupProject;

/**
 * Represents something that recieves ingredients from other classes.
 * @author Nicholas C
 */
public interface IngredientObserver {
    
    public void addItem(Ingredient newIngredient);
    public void removeItem(Ingredient oldIngredient);
}
