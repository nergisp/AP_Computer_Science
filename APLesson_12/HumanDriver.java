import java.util.Scanner;

public class HumanDriver {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the hair: ");
		String hair = kb.next();
		System.out.println("Enter the eyes: ");
		String eyes = kb.next();
		System.out.println("Enter the skin: ");
		String skin = kb.next();

		Human object = new Human(hair, eyes, skin);
		
		object.setHES(hair, eyes, skin);
		
		System.out.printf("hair: %s \n eyes: %s \n skin: %s", object.gethair(),object.geteyes(),object.getskin());
		
		System.out.println("\nEnter friend's hair: ");
		hair = kb.next();
		System.out.println("Enter friend's eyes: ");
		eyes = kb.next();
		System.out.println("Enter friend's skin: ");
		skin = kb.next();
		
		object.setHES(hair, eyes, skin);
		
		System.out.printf("Friend's hair: %s \n Friend's eyes: %s \n Friend's skin: %s", object.gethair(),object.geteyes(),object.getskin());
	}
	
}