import java.util.Scanner;

public class CountbyX {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a final number: ");
		int fnum = kb.nextInt();
		
		System.out.println("Input the step size: ");
		int step = kb.nextInt();

		for (int i = step; i<=fnum; i+=step) {
			
			System.out.print(i+ " ");
			
		}
	}
	
}