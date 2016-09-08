
// BMI calculator

import java.util.Scanner;

public class ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height?");
		int height = keyboard.nextInt();
		
		System.out.println("weight?");
		int weight = keyboard.nextInt();
		
		int bmi;
		bmi = weight/height^2;
		
		System.out.printf("Your BMI is %d", bmi);
	}
}