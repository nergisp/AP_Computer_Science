import java.util.Scanner;

public class Underscores {
	static String newsentence;

	public static void main(String[] args) {
		
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
	String sentence = kb.nextLine();
	replace(sentence);

    	}
	
	public static void replace(String sent, int i) {
		
		if (sent.indexOf(' ')>0) {
            sent=sent.substring(0,sent.indexOf(" "))+ "_" + sent.substring(sent.indexOf(" ")+1);
            replace(sent);
        }
	else {
            System.out.println(sent);
        }
}
}
