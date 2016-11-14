import java.util.Scanner;

public class FibonacciSequence {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		int start= kb.nextInt();
		System.out.println("Enter the sequence size: ");
		int size = kb.nextInt();
		
		int[] sequence = new int[size];
		
		for (int i=0; i<size; i++) {
			
			if (i==0 || i==1) {
				sequence[i] = start;
			}
			else {
				sequence[i] = sequence[i-2]+sequence[i-1];
			}
			System.out.print(sequence[i]+ " ");
		}
		
	}
	
}