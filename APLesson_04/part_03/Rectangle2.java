
import java.util.Scanner;

public class Rectangle2 {
	
	static double length;
	static double height;
	
	public static void main(String[]args) {
	// initiate keyboard
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter length: ");
		length = kb.nextDouble();
		System.out.println("Enter height: ");
		height = kb.nextDouble();
		
		pericalculate();
		print();
		
	}
	
	public static double pericalculate() {
		
		return ((2*length) + (2*height)); 
		
	}
	
	public static void print() {
		
		System.out.printf("Your rectangle is %.5f sq ft around", pericalculate());
		
	}
	
}