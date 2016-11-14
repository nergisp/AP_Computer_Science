import java.util.Scanner;

public class Underscores {
	static String newsentence;

	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = kb.nextLine();
		newsentence="";
		replace(sentence, 0);
	}
	
	public static void replace(String sent, int i) {
		
		if (!(sent.indexOf(' ')>=0)) {
			sent = newsentence;
			System.out.println(sent);
		}
		else {
			Character letter = sent.charAt(i);
			if (letter.equals(' ')) {
				letter = '_';
			}
			newsentence = newsentence + letter;
			replace(sent,i+1);
		}
	}
}