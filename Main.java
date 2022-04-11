package ESOFGroupProject;

import java.util.Scanner;

public class Main {
    User user;

    public Main(){
        user = new User();
        user.start();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.REPL();
    }

    public void REPL(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println(" 1. Look at Plan");
        System.out.println(" 2. View Grocery List");
        System.out.println(" 3. Update User Info");
        System.out.println(" X. Exit");

        switch (scan.nextLine()){
            case "1" -> viewPlan();
            case "2" -> viewGroceryList();
            case "3" -> updateUserInfo();
            case "X", "x" -> System.out.println("Exit Complete");
            default -> {
                System.out.println("Invalid Input");
                REPL();
            }
        }
    }


    private void viewPlan(){
        System.out.println(user.toString());
        REPL();
    }

    private void viewGroceryList() {
        System.out.println(user.toString());
        REPL();
    }

    private void updateUserInfo(){
        System.out.println("What would you like to change?");
        System.out.println(" 1. Name");
        System.out.println(" 2. Age");
        System.out.println(" 3. Weight");
        System.out.println(" 4. Calorie Goal");
        System.out.println(" X. Exit");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "1" -> {
                System.out.println("Enter new name:");
                user.setName(scan.nextLine());
            }
            case "2" -> {
                System.out.println("Enter new age:");
                user.setAge(scan.nextInt());
            }
            case "3" -> {
                System.out.println("Enter new weight:");
                user.setWeight(scan.nextInt());
            }
            case "4" -> {
                System.out.println("Enter new calorie goal:");
                user.setDailyCalories(scan.nextInt());
            }
            case "x", "X" -> {}
            default -> {
                System.out.println("Invalid Input");
                updateUserInfo();
            }
        }
        REPL();
    }
}
