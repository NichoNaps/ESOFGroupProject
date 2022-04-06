package Sprint1;

import java.util.ArrayList;

public abstract class Ingredient implements Food {

    private ArrayList<FoodUnits> units = new ArrayList<FoodUnits>();
    private double amount = 0.0F; // in grams

    public Ingredient(float amountGrams)
    {
        
    }

    public void addUnit(FoodUnits unit) {
        units.add(unit);
    }

    /**
     * Display the unit options for the user to choose from
     */
    private void viewAmountUnits() {
        for (int i = 0; i < units.size(); i++) {
            System.out.println(i + ": " + units.get(i).getUnits());
        }
    }

    public void setAmount(float amount) {

    }


    public double getAmount(int unitIdx);

}
