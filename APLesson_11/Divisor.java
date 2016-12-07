import java.util.Arrays;
import java.util.Scanner;

public class Divisor {
	
	public static void main(String[]args) {
		
		int[][]nums = new int [4][4];
		Scanner kb = new Scanner(System.in);
		
		for(int i=0; i < nums.length; i++) {
			for(int j=0; j < nums[i].length; j++) {
				nums[i][j] = (int)(Math.random()*100)+1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("Please enter a number: ");
		int divisor = kb.nextInt();
		int count = 0;

		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[i].length; j++) {
				if (nums[i][j] % divisor == 0) {
					count++;
				}
			}
		}
		System.out.printf("There are %d numbers divisible by %d int the Array.", count, divisor);
		
	}
}