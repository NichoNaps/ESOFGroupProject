package ESOFGroupProject;

import java.util.*;

/**
 * This class represents a user's weekly plan.
 * @author Nicholas C
 */
public class WeeklyPlan implements IngredientProducer {
	
	// member vars
	private DailyPlan monday = new DailyPlan();
	private DailyPlan tuesday = new DailyPlan();
	private DailyPlan wednesday = new DailyPlan();
	private DailyPlan thursday = new DailyPlan();
	private DailyPlan friday = new DailyPlan();
	private DailyPlan saturday = new DailyPlan();
	private DailyPlan sunday = new DailyPlan();


	//// observer vars ////
	private ArrayList<IngredientObserver> observers = new ArrayList<IngredientObserver>();
	// ingredients to be added to observers
	private ArrayList<Ingredient> ingredientsAdded = new ArrayList<Ingredient>(); 
	// ingredients to be removed from observesr
	private ArrayList<Ingredient> ingredientsRemoved = new ArrayList<Ingredient>();

	public WeeklyPlan() {
		
		// CONFIGURE DEMO RECIPIES, 
		// this will shunt the ingredients of DailyPlans demos recipies 
		// into our ingredientsAdded list
		for (Recipe r : monday.getRecipes())
		{
			addRecipeIngredients(r);
		}
		
	}

	
	// getters for days
	public DailyPlan getMonday() {return monday;}
	public DailyPlan getTuesday() {return tuesday;}
	public DailyPlan getWednesday() {return wednesday;}
	public DailyPlan getThursday() {return thursday;}
	public DailyPlan getFriday() {return friday;}
	public DailyPlan getSaturday() {return saturday;}
	public DailyPlan getSunday() {return sunday;}


	@Override
	public void addObserver(IngredientObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IngredientObserver o) {
		observers.remove(o);
	}

	@Override
	public void updateObservers() {
		// update all observers with the changes 
		for (IngredientObserver o : observers) {

			// add ingredients
			for (Ingredient i : ingredientsAdded) {
				o.addIngredient(i);
			}

			// remove ingredients
			for (Ingredient i : ingredientsRemoved) {
				o.removeIngredient(i);
			}
		}

		// reset
		ingredientsAdded.clear();
		ingredientsRemoved.clear();
	}
	
	private void addRecipeIngredients(Recipe r) {
		updateIngredientDelta(r, ingredientsAdded, ingredientsRemoved);
	}

	private void removeRecipeIngredients(Recipe r) {
		updateIngredientDelta(r, ingredientsRemoved, ingredientsAdded);
	}
	
	/**
	 * Utility function for canceling out an ingredient if it exists in 
	 * either list passed and only add it if it's not a repeat. 
	 * 
	 * @param r
	 * @param adder
	 * @param remover
	 */
	private void updateIngredientDelta(
		Recipe r,
		ArrayList<Ingredient> adder, 
		ArrayList<Ingredient> remover) {
		
		// register ingredients to add to observers
		for (Ingredient ing : r.getIngredients()) {

			// if were already removing this ingredient then cancel out the remove 
			if (remover.contains(ing)) {
				remover.remove(ing);
			}
			// otherwise as long as we havent already add it to add
			else if (!adder.contains(ing)) {
				adder.add(ing);
			}
			
		}
	}


	

	/**
	 * Utility mentod to print each daily as one line of text
	 * @param dp the daily plan to print
	 */
	private void printRecipies(DailyPlan dp) {

		// print otu the recipes
		for (Recipe r : dp.getRecipes()) {
			System.out.print(r.getName() + " ");

			// print out the ingredients
			
			ArrayList<Ingredient> ings = r.getIngredients();
			
			// only print ingredients if they exist
			if (ings.size() > 0)
			{
				System.out.print("(");
				for (int i = 0; i < ings.size(); i++) {
	
					// don't print comma on last run
					if (i == ings.size() - 1) {
						System.out.print(ings.get(i).getName());
					} 
					else {
						System.out.print(ings.get(i).getName() + ", ");
					}
				}
				System.out.print("); ");
			}
			
		}

		System.out.println(); // new line
	}

	/**
	 * Displays a users weekly plan
	 */
	public void view()
	{
		System.out.print("Monday:    ");
		printRecipies(monday);
		System.out.print("Tuesday:   ");
		printRecipies(tuesday);
		System.out.print("Wednesday: ");
		printRecipies(wednesday);
		System.out.print("Thursday:  ");
		printRecipies(thursday);
		System.out.print("Friday:    ");
		printRecipies(friday);
		System.out.print("Saturday:  ");
		printRecipies(saturday);
		System.out.print("Sunday:    ");
		printRecipies(sunday);
	}
	

	
}
