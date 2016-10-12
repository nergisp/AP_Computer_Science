
// BMI calculator

import java.util.Scanner;

public class APLab5_02 {
	
	static double bmi;
	static String result;
	
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in meters?");
		double height = keyboard.nextDouble();	
		System.out.println("weight in kg?");
		double weight = keyboard.nextDouble();
		
		calcBMI(weight, height);
		
		System.out.printf("Your BMI is %2.1f\n", bmi);
		System.out.printf("You are %s", result);
		
	}

	public static double calcBMI(double weight, double height) {
		
		bmi = weight/(height*height);
		if (bmi > 39.9)
			result = "Morbidly Obese";
		
		else if (bmi > 35)
			result = "Very Obese";
		
		else if (bmi > 29.9)
			result = "Obese";
		
		else if (bmi > 24.9)
			result = "Overweight";
		
		else if (bmi > 18.5)
			result = "Normal";
		
		else if (bmi <= 18.5)
			result = "Underweight";		
		
		return bmi;
	}
	
}