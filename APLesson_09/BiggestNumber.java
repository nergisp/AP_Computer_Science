
public class BiggestNumber {
	
	static int[] num;
	
	public static void main(String[]args) {
		
		num = new int[10];
		
		fillArray();
		printArray();
		
	}
	
	public static void fillArray() {
		
		for (int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*100)+1;
		
	}
	
	public static void printArray() {
		
		System.out.print("For the following numbers...");
		for(int i : num) {
			System.out.print(i +" ");
		}
		System.out.print("\nThe biggest number is "+getBiggest());

	}
	
	public static int getBiggest(){
		int max = num[0];
		for (int i : num) {
			if (max<i) {
				max=i;
			}
		}
		return max;
	}
}