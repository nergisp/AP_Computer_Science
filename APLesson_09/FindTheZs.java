import java.util.Scanner;

public class FindTheZs {
	
	static String[] words;
	
	public static void main(String[]args) {
		
		
		
		words = new String[5];
		
		fillArray();
		printArray();
		
	}
	
	public static void fillArray() {
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			words[i] = kb.next();
		}
	}
	
	public static void printArray() {
		
		System.out.print("For the following words...");
		for(String i : words) {
			System.out.print(i +" ");
		}
		System.out.print("\nOnly ");
		for(String o : hasZs()) {
			if (!(o == null))
				System.out.print(o +" ");
		}
		System.out.print("contain(s) the letter z");
	}
	
	public static String[] hasZs(){
		int i=0;
		String[] zs = new String[5];
		for (String x : words) {
			if (!(x.indexOf("z")<0)) {
				zs[i]= x;
			}
			i++;
		}
		return zs;
	}
}