import java.util.Scanner;

public class Center {
	static String newword;

	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word1 = kb.next();
		System.out.println("Enter a word: ");
		String word2 = kb.next();
		System.out.println("Enter a word: ");
		String word3 = kb.next();
		makeCenter(word1);
		makeCenter(word2);
		makeCenter(word3);
	}
	
	public static void makeCenter(String w) {
		
		if (w.length()>=20) {
			System.out.println(w);
		}
		else {
			newword = " "+w+" ";
			makeCenter(newword);
		}
	}
}