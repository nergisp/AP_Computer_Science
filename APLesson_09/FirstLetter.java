import java.util.Scanner;

public class FirstLetter {
	
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
			first(words[i]);
	}
	
	public static void first(String word) {
		System.out.print(word.charAt(0)+" ");
		
	}
}