import java.util.Scanner;

public class ReverseWord {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		String[] words = new String[5];
		
		System.out.println("Enter a word: ");
		words[0]= kb.next();
		System.out.println("Enter a word: ");
		words[1] = kb.next();
		System.out.println("Enter a word: ");
		words[2] = kb.next();
		System.out.println("Enter a word: ");
		words[3] = kb.next();
		System.out.println("Enter a word: ");
		words[4] = kb.next();
		
		System.out.println("In order...");
		for (int i=0; i<words.length; i++)
			System.out.print(words[i]+" ");
		
		System.out.println("\nReversed...");
		for (int i=(words.length-1); i>=0; i--)
			System.out.print(words[i]+" ");
	}
	
}