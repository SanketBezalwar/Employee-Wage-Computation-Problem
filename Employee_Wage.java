package Employee_Wage_Computation;

import java.util.Random;

public class Employee_Wage {
	static int isPresent;
	static int wage_Per_Hour = 20;
	static int full_Day_Hour = 8;
	static int part_Time_Hour = 8;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");
		System.out.println();
		Random inp = new Random();
		isPresent = inp.nextInt(2);

		if (isPresent == 0) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

		// Calculate daily employee wage

		int dailyWage = 0;
		int dailyWage2 = 0;

		dailyWage = full_Day_Hour * wage_Per_Hour;
		System.out.println("Daily wage of Employee is " + dailyWage);

		dailyWage2 = part_Time_Hour * 10;
		System.out.println("Employee is Part Time");
		System.out.println("Daily wage of part time employee is " + dailyWage2 + " Rs");

		// Solved using switch case

		isPresent = inp.nextInt(3);
		switch (isPresent) {
		case 0:
			System.out.println("Employee is Present");
			break;

		case 1:
			System.out.println("Employee is Part Time");
			break;

		case 2:
			System.out.println("Employee is Absent");
			break;
		}

		// Calculate monthly wage

		int monthlyWage = 0;
		int monthDays = 20;

		monthlyWage = dailyWage * monthDays;
		System.out.println("Monthly wage of Employee is " + monthlyWage);

		monthlyWage = dailyWage2 * monthDays;
		System.out.println("Monthly wage of part time Employee is " + monthlyWage);

		// Wages till hours or days is reached

		int isWorking;
		int monthlyWage2 = 0;
		int workingDays = 0;
		int workingHours = 0;

		while (workingHours <= 100 && workingDays <= 20) {
			isWorking = inp.nextInt(2);
			workingDays = workingDays + 1;

			switch (isWorking) {
			case 0:
				monthlyWage2 = monthlyWage2 + wage_Per_Hour * 4;
				workingHours = workingHours + 4;
				break;

			case 1:
				monthlyWage2 = monthlyWage2 + wage_Per_Hour * 8;
				workingHours = workingHours + 8;
				break;
			}
		}

		System.out.println("Employee wage for total working hours is " + monthlyWage2);
	}
}
