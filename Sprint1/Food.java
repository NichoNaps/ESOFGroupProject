package Sprint1;

public interface Food {
    public String getName();

    public double getAmount();
    public void setAmount(double amount);

    public void viewSetAmount(); // take input from user to set amount

    public void getNutrients(); // @TODO what does this return?
    public void getRestrictions(); // @TODO what does this return?
}
