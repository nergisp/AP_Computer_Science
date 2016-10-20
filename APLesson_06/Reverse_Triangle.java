import java.util.Scanner;

public class Reverse_Triangle {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string for word triangle");
		String word = kb.next();
		
		for (int i = word.length(); i >=0; i--) {
			
			System.out.println(word.substring(0,i));
			
		}
		
	}
		
}