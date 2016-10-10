import java.util.Scanner;

public class study_guide_02 {
	
	static double area;
	static int radius;
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius of your circle: ");
		int radius = kb.nextInt();
		calcArea();
		radPrint();
	}
	
	//question 1
	public static void totalformat(double one, double two) {
		
		double total = one + two;
		System.out.printf("The total cost of your order is $%.2f", total);
		
	}
	
	//question 2
	public static void recieptformat(String item, double price) {
		
		System.out.printf("\n* %15s  ......  %5.2f", item, price);
		
	}

	//question 3: d (see test)
	
	//question 4
	
	public static double calcSurf(int side) {
		
		return 6 * (Math.pow(side, 2));
		
	}
	
	public static void surfPrint(int side) {
		
		System.out.printf("The surface are of your cube is %.5f inches", calcSurf(side));
		
	}
	//question 5
	public static double calcSum(int one, int two) {
		
		return one + two;
		
	}
	
	public static void sumPrint(int one, int two) {
		
		System.out.printf("The sum of %d and %d is %.2f", one, two, calcSum(one, two));
		
	}
	
	//question 6: c because initiating twice
	public static void calcArea() {
		
		double area = 3.14 * (radius*radius);
		
	}

	public static void radPrint() {
		
		System.out.printf("The radius of your circle is %.3f.",area);
		
	}
	
	//question 7: fails because not static method
	//question 8: a success
	
}