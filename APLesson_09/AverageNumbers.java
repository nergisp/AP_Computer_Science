import java.util.Scanner;

public class AverageNumbers {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		for (int i=0; i<numbers.length; i++)
			numbers[i] = (int)(Math.random()*100)+1;
		
		for(int num : numbers) {
			System.out.print(num +" ");
		}
		
		System.out.println("\nThe average of the above numbers is "+average(numbers));
	}
	
	public static int average(int[] anum) {
		int avg = 0;
		for (int i=0; i<anum.length; i++) {
			avg+=anum[i];
		}
		return avg/anum.length;
	}
}