import java.util.Scanner;

public class Box {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an string");
		String word = kb.next();
		
		for(int i = 1; i <= word.length(); i++) {
			
			System.out.println(word);
			
		}
	}
	
	
}