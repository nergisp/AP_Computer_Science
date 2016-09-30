
import java.util.Scanner;

public class Average {
	
		static double num1;
		static double num2;
		static double num3;
		static double avg;
	
	public static void main(String[]args) {
	// initiate keyboard
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter number 1: ");
		num1 = kb.nextDouble();
		System.out.println("Enter number 2: ");
		num2 = kb.nextDouble();
		System.out.println("Enter number 3: ");
		num3 = kb.nextDouble();
		
		avgcalc();
		print();
	
	}
	
	public static void avgcalc() {
		
		avg = (num1 + num2 +  num3)/3;
		
	}
	
	public static void print() {
		
		System.out.printf("The average of %f, %f, and %f is %.5f", num1, num2, num3, avg);
		
	}
	
}