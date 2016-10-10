import java.util.Scanner;
public class test {
	
	public static void main(String[]main) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = kb.nextLine();
		System.out.println("Please enter your school site: ");
		String site = kb.nextLine();
		System.out.println("Please enter your school year: ");
		String year = kb.nextLine();
		System.out.println("Please enter your subject: ");
		String sub = kb.nextLine();
		
		System.out.println("______________________________________");
		format(site, year);
		format(name, sub);
		System.out.println("______________________________________");
	}
	
	public static void format(String one, String two) {
		
		System.out.printf("+ %20s\t%15s +\n", one, two);
		
	}
}