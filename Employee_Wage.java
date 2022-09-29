package Employee_Wage_Computation;

import java.util.Random;

public class Employee_Wage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		Random inp = new Random();
		int isPresent = inp.nextInt(2);
		if (isPresent == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
