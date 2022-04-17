package ESOFGroupProject;

public class WeeklyPlan {
	
	//print statement for user
	System.out.println("Hello" + user.getName() + " here is your weekly meal plan");
	
	//objects for the daily meal list
	DailyPlan Monday = new DailyPlan();
	DailyPlan Tuesday = new DailyPlan();
	DailyPlan Wednesday = new DailyPlan();
	DailyPlan Thursday = new DailyPlan();
	DailyPlan Friday = new DailyPlan();
	DailyPlan Saturday = new DailyPlan();
	DailyPlan Sunday = new DailyPlan();
	
	//print statement for the user to see all meals
	System.out.println(Monday.createPlan() 
						+ Tuesday.createPlan() 
						+ Wednesday.createPlan() 
						+ Thuesday.createPlan() 
						+ Friday.createPlan() 
						+ Saturday.createPlan()
						+ Sunday.createPlan() 
						);
}
