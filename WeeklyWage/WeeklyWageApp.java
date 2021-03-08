package WeeklyWage;

import java.util.*;


public class WeeklyWageApp{
	public static void main(String args[]){
		
		String workerName;
		int daysWorked;
		double dailyRate;
		double totalPay;


		//objects
		Scanner keyboard;
		keyboard = new Scanner(System.in);

		//bring in our instantiable calss
		WeeklyWage myWeeklyWage = new WeeklyWage();


		//inputs
		System.out.println("What is your name");
		//Store the answer
		workerName = keyboard.nextLine();


		System.out.println("How many days have you worked this week " + workerName);
		daysWorked = keyboard.nextInt();
		myWeeklyWage.setDays(daysWorked);

		//Ask the user for their daily rate
		System.out.println("What is your daily rate?");
		dailyRate = keyboard.nextDouble();
		String dailyRateOutput = String.format("%.2f", dailyRate); //Format this as a string and have it output to decimal places
		
		

		myWeeklyWage.setMoney(dailyRate);
		
	
		myWeeklyWage.compute();


		//grab back the total pay from inst class
		totalPay = myWeeklyWage.getTotalPay();
		String totalPayOutput = String.format("%.2f", totalPay);
		
		System.out.println(workerName + " has worked "  + daysWorked + "days @ €" + dailyRateOutput + "per day is...");
		System.out.println("€" + totalPayOutput + "Earned this week");

		keyboard.close();
	}

}