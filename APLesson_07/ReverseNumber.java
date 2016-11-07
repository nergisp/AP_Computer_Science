import java.util.Scanner;

public class ReverseNumber {
	
	static int rev;
	static int num;
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
		int number = kb.nextInt();
		num = number;
		rev = 0;
		
		getReverse();
		
		System.out.printf("The %d reversed is %d", number, rev);
	}
	
	public static void getReverse() {
		
		while(num>0) {
			
			rev*=10;
			rev = (rev + (num%10));
			num/=10;
		}
		
	}
}