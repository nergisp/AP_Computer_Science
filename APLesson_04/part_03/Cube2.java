
import java.util.Scanner;

public class Cube2 {
	
	static double length;
	
	public static void main(String[]args) {
	// initiate keyboard
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter side length: ");
		length = kb.nextDouble();
		
		sacalc();
		print();
	
	}
	
	public static double sacalc() {
		
		return (length*length)*6;
		
	}
	
	public static void print() {
		
		System.out.printf("The surface area of a cube with side length %.5f is %.5f.", length, sacalc());
		
	}
	
}