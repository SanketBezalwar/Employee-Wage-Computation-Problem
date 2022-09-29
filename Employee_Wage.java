package Employee_Wage_Computation;

import java.util.Random;

public class Employee_Wage {
	static int isPresent;
	static int wage_Per_Hour = 20;
	static int full_Day_Hour = 8;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		Random inp = new Random();
		isPresent = inp.nextInt(2);

		if (isPresent == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

		// Calculate daily employee wage
		
		int dailyWage = 0;
		dailyWage = full_Day_Hour * wage_Per_Hour;
		
		System.out.println("Daily wage of Employee is " + dailyWage);
	}
}
