package ESOFGroupProject;

/**
 * Represents something that publishes ingredients to other classes.
 * @author Nicholas C
 */
public interface IngredientProducer {
    
    public void updateObservers();
    public void addObserver(IngredientObserver o);
    public void removeObserver(IngredientObserver o);
}
