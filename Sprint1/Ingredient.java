package Sprint1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Ingredient {

    private ArrayList<FoodUnits> units = new ArrayList<FoodUnits>();
    private double amount = 0.0F; // in grams

    private String name;

    public Ingredient(String name, float amountGrams)
    {
        this.name = name;
        setAmount(amountGrams);
    }

    public void addUnit(FoodUnits unit) {
        units.add(unit);
    }

    /**
     * set the amount using a specific unit
     * @return
     */
    public void setAmount(double amount, int unitIndex) {
        this.amount = units.get(unitIndex).toGrams(amount);
    }

    /**
     * @return the amount in the specified units
     */
    public double getAmount(int unitIdx) {
        return units.get(unitIdx).fromGrams(amount);
    }

    /**
     * @return the amount in grams
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @return set the amount using grams
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String getName() {
        return name;
    }


    /**
     * Display the unit options for the user to choose from
     */
    private void viewAmountUnits() {
        for (int i = 0; i < units.size(); i++) {
            System.out.println(i + ": " + units.get(i).getUnits());
        }
    }

    /**
     * command line interface for the user to edit the amount
     */
    public void viewEditAmount() {
        Scanner scanner = new Scanner(System.in);
        int unitIdx = 0;


        // first let user select the desired unit
        if (units.size() > 1) {
            
            System.out.println("Select a unit to edit the amount");
            viewAmountUnits();

            unitIdx = scanner.nextInt();
        }

        // now let the user edit the amount
        System.out.println("Input the " + getName() +
         " amount in " + units.get(unitIdx).getUnits());

        double amount = scanner.nextDouble();
        setAmount(amount, unitIdx);

        scanner.close();
    }

   // public void getNutrients(); // @TODO what does this return?
   // public void getRestrictions(); // @TODO what does this return?

}
