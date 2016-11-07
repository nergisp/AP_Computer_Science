import java.util.Scanner;

public class ReplaceAts {
	
	static String sentence;
	static String newsentence;
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an sentence: ");
		sentence = kb.nextLine();
		
		replace();
		
		System.out.printf(newsentence);
	}
	
	public static void replace() {
		
		newsentence = "";
		int i = 0;
		while(i<sentence.length()) {
			Character letter = sentence.charAt(i);
			if (letter.equals('a'))
				letter = '@';
			newsentence = newsentence + letter;
			i+=1;
		}
		
	}
}