import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Keep_Composites {
	static ArrayList<Integer> nums;
	public static void main(String[]args) {
		
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		nums = new ArrayList<Integer>(Arrays.asList(numbers));
		removePrimes();
		System.out.print(nums);
	}
	
	public static int gFactor(int n){
		for (int i=2; i<n; i++) {
			if (n%i==0) {
				return 1;
			}
		}
		return 0;
		
	}
	public static void removePrimes() {
		for (int i=0; i<nums.size(); i++) {
			if (gFactor(nums.get(i)) == 0) {
				nums.remove(i);
			}
		}
	}
	
}