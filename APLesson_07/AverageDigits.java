import java.util.Scanner;

public class AverageDigits {
	
	static int digits;
	static int average;
	static int num;
	static int number;
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
		number = kb.nextInt();
		digits = 0;
		average = 0;
		avDigits();
		
		System.out.printf("The average of the digits in %d is %d", number, average);
	}
	
	public static void avDigits() {
		
		num = number;
		
		while(num>0) {
			digits+=1;
			average = average+num%10;
			num/=10;
		}
		
		average = (average/digits);
		
	}
	
}
