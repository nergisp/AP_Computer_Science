
public class Song {
	
	public static void main(String[]args) {
		
		sing("Na", 4);
		System.out.println("\n");
		sing("Na", 4);
		System.out.println("\n");
		sing("Hey", 3);
		System.out.println("\n");
		sing("Goodbye!", 1);
		
	}
	
	public static void sing(String word, int repeat) {
		
		for (int i = 1; i<=repeat; i++) {
			
			System.out.print(word + " ");
		
		}
	}
	
}