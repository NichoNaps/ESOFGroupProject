package Units;

public abstract class GramRelativeUnit implements Unit {

    private String units;
    private double perGram;

    public GramRelativeUnit(double perGram, String units) {
        this.perGram = perGram;
        this.units = units;
    }

    public double fromGrams(double amount) {
        return amount * perGram;
    }

    public double toGrams(double amount) {
        return amount / perGram;
    }

    public String getUnits() {
        return units;
    }
}