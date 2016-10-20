import java.util.Scanner;

public class Graph_Table {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = kb.nextInt();
		System.out.println("Enter the size of the table");
		int size = kb.nextInt();
		
		for (int i = 1; i<=size; i++) {
			
			int outputnum = num*i;
			System.out.printf("%10d | %d\n", i, outputnum);
			
		}

		
	}
	
}