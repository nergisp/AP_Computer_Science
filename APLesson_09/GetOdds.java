
public class GetOdds {
	
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
		System.out.print("\nThe ");
		for(int o : getOdds()) {
			if (!(o == 0))
				System.out.print(o +" ");
		}
		System.out.print("are odd numbers");
	}
	
	public static int[] getOdds(){
		int i=0;
		int[] odds = new int[10];
		for (int x : num) {
			if (!(x%2==0)) {
				odds[i]= x;
			}
			i++;
		}
		return odds;
	}
}