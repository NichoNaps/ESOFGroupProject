package Sprint1;

import java.util.ArrayList;
import java.util.Scanner;

import Units.Cup;
import Units.Gram;
import Units.Unit;



public class Ingredient {

    private ArrayList<Unit> units = new ArrayList<Unit>();
    private double amount = 0.0F; // in grams

    private String name;

    public Ingredient(String name, float amountGrams)
    {
        this.name = name;
        setAmount(amountGrams);
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    /**
     * set the amount using a specific unit
     * @return
     */
    public void setAmount(double amount, int unitIndex) {
        this.amount = getUnit(unitIndex).toGrams(amount);
    }

    /**
     * @return the amount in the specified units
     */
    public double getAmount(int unitIdx) {
        return getUnit(unitIdx).fromGrams(amount);
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
            System.out.println(i + ": " + getUnit(i).getUnits());
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
         " amount in " + getUnit(unitIdx).getUnits());
        
        double amount = scanner.nextDouble();
        setAmount(amount, unitIdx);

        scanner.close();
    }

    /**
     * Gets the unit at the specified index.
     * Defaults to grams if we have no other units defined
     */
    private Unit getUnit(int idx)
    {
        if (this.units.size() == 0) {
            return new Gram();
        }

        return units.get(idx);
    }

    public static void main(String[] args)
    {
        Ingredient i = new Ingredient("test", 1.0F);
        i.addUnit(new Gram());
        i.addUnit(new Cup());
        i.viewEditAmount();

        System.out.println(i.getAmount());
    }

   // public void getNutrients(); // @TODO what does this return? implement me!
   // public void getRestrictions(); // @TODO what does this return? implement me!

}
