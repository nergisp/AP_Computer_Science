import java.util.Scanner;

public class TreeDeg60 {

	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = kb.next();
		int stop = word.length();
		tree(word,1,stop);
	}
	
	public static void tree(String w, int start, int stop) {
		
		if (start<=stop) {
			System.out.printf("%-s",w.substring(0,start));
			start+=1;
			tree(w,start,stop);
			}
	}
}