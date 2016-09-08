
//Pythagorean Theorem

import java.util.Scanner;

public class ex_03
{
	
	public static void main(String[]args)
	
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("We will be calculating the hypontenuse \n Enter the first side ");
		
		double a = keyboard.nextDouble();
		
		System.out.println("Enter the next side ");
		
		double b = keyboard.nextDouble();
		
		double hypontenuse;
		hypontenuse = Math.sqrt(a*a + b*b);
		
		System.out.println(hypontenuse);
		
		System.out.println("The hypontenuse is " + hypontenuse);
		
	}
}