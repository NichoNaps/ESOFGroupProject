package ESOFGroupProject;

import java.util.Scanner;

/**
 * @author William Jordan
 */
public class Main {
    User user;

    public Main(){
        user = new User();
        user.configure();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.REPL();
    }

    public void REPL(){
        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.println("What do you want to do?");
        System.out.println(" 1. Look at Plan");
        System.out.println(" 2. View Grocery List");
        System.out.println(" 3. Update Grocery List");
        System.out.println(" 4. Update User Info");
        System.out.println(" X. Exit");
            switch (scan.nextLine()) {
                case "1" -> viewPlan();
                case "2" -> viewGroceryList();
                case "3" -> updateGroceryList();
                case "4" -> {
                    updateUserInfo();
                    System.out.println("Update Complete\n");
                }
                case "X", "x" -> {
                    System.out.println("Exit Complete");
                    scan.close();
                    return;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private void viewPlan(){
        user.viewPlan();
    }

    private void viewGroceryList() {
        user.viewGroceryList();
    }

    public void updateGroceryList(){
        System.out.println("What would you like to change?");
        System.out.println(" 1. Add Ingredient");
        System.out.println(" 2. Remove Ingredient");
        System.out.println(" 3. Clear");
        System.out.println(" X. Exit");

        while (true) {
            Scanner scan = new Scanner(System.in);
            switch (scan.nextLine()) {
                case "1" -> {
                    System.out.println("Enter Item to add");
                    user.glAdd(scan.nextLine());
                    return;
                }
                case "2" -> {
                    System.out.println("Enter Item to remove");
                    user.glRemove(scan.nextLine());
                    return;
                }
                case "3" -> {
                    user.glClear();
                    return;
                }
                case "x", "X" -> {
                    return;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    private void updateUserInfo() {
        System.out.println("What would you like to change?");
        System.out.println(" 1. Name");
        System.out.println(" 2. Age");
        System.out.println(" 3. Weight");
        System.out.println(" 4. Calorie Goal");
        System.out.println(" X. Exit");
        while (true) {
            Scanner scan = new Scanner(System.in);
            switch (scan.nextLine()) {
                case "1" -> {
                    System.out.println("Enter new name:");
                    user.setName(scan.nextLine());
                    return;
                }
                case "2" -> {
                    System.out.println("Enter new age:");
                    user.setAge(scan.nextInt());
                    return;
                }
                case "3" -> {
                    System.out.println("Enter new weight:");
                    user.setWeight(scan.nextInt());
                    return;
                }
                case "4" -> {
                    System.out.println("Enter new calorie goal:");
                    user.setDailyCalories(scan.nextInt());
                    return;
                }
                case "x", "X" -> {
                    return;
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
