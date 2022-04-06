package Units;
import java.util.Scanner;

public abstract class FoodUnits {

    private String units;
    private double perGram;

    public FoodUnits(double perGram, String units) {
        this.perGram = perGram;
        this.units = units;
    }

    public double fromGrams(double amount) {
        return amount * perGram;
    }

    public double toGrams(double amount) {
        return amount / perGram;
    }

    //@TODO is this needed?
    public double toGrams(String input) {
        Scanner scanner = new Scanner(input);
        double amount = scanner.nextDouble();
        scanner.close();

        return toGrams(amount);
    }

    public String getUnits() {
        return units;
    }
}