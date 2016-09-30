
import java.util.Scanner;

public class Circle {
	
	static double radius;
	static double area;
	
	public static void main(String[]args) {
	// initiate keyboard
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter radius: ");
		radius = kb.nextDouble();
		
		areacalc();
		print();
	
	}
	
	public static double areacalc() {
		
		return radius*radius*3.14;
	}
	
	public static void print() {
		
		System.out.printf("The area of a circle with a radius of %f is %.5f.", radius, areacalc());
	
	}
	
}