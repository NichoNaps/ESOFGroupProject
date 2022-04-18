package ESOFGroupProject;

import java.util.Scanner;

/**
 * @author Will Jordan
 */
public class User {
    private String name;
    private int age;
    private int weight;
    private int dailyCalories;
    WeeklyPlan wp;
    GroceryList gl;

    public User(){
        gl = new GroceryList();
        wp = new WeeklyPlan();
        wp.addObserver(gl);
        wp.updateObservers();
    }

    public User(String name, int age, int weight, int dailyCalories) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalories = dailyCalories;

        gl = new GroceryList();
        wp = new WeeklyPlan();
        wp.addObserver(gl);
        wp.updateObservers();
    }

    public void configure(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tour Name:");
        name = scan.nextLine();
        System.out.println("How old are you?");
        age = scan.nextInt();
        System.out.println("How much do you weigh?");
        weight = scan.nextInt();
        System.out.println("what is your daily calorie goal?");
        dailyCalories = scan.nextInt();
        System.out.println("Thanks " + name + " you are ready to go!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDailyCalories() {
        return dailyCalories;
    }

    public void setDailyCalories(int dailyCalories) {
        this.dailyCalories = dailyCalories;
    }

    public void viewPlan(){
        wp.view();
    }

    public void viewGroceryList() {
        gl.displayList();
    }

    public void glAdd(String s){
        gl.addItem(s);
    }

    public void glRemove(String s){
        gl.removeItem(s);
    }

    public void glClear(){
        gl.clearList();
    }
}
