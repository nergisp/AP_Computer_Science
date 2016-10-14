import java.util.Scanner;

public class CYOAG {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Rules to play: only respond with the letter, not the full option.\n");
		
		System.out.println("Welcome to your end \n You wake up and find yourself in an underwater dome.");
		
		System.out.println("Do you \n A) Scream \n B) Do nothing \n C) Cry like a baby \n D) Pass out");
		
		String answer = kb.nextLine();
		
		if (answer.equals("A")) {
			System.out.println("Your screams wake up the serpent");
			System.out.println("Do you \n A) Run the hell away \n B) Do nothing and accept it \n C) Cry like a baby \n D) Faint");
			String answer1 = kb.nextLine();
			if (answer1.equals("A")) {
			System.out.println("You ran through the exit, but drowned because you're underwater. Great choice."); System.exit(0);}
			if (answer1.equals("B")) {
				System.out.println("The serpent realizes your existential choice, and refuses to kill you knowing that living would be worse.");
				System.out.println("Do you \n A) Act like you're trying to escape \n B) befriend the serpent");
				String answer2a = kb.nextLine();
				if (answer2a.equals("A")) {
					System.out.println("Serpent's smarter than you. It leaves you there in that dome left to die."); System.exit(0); }
				else {
					System.out.println("Serpent laughs at you for thinking you could be friends and eats you."); System.exit(0);}
			}
			if (answer1.equals("C")) {
				System.out.println("Your insane cries scare the serpent away, you're safe for now. You search around the dome and find a few things.");
				System.out.println("Do you \n A) Pull the lever \n B) Press that YUGE red button \n C) Use the hammer to break the glass dome \n D) Open the fuse box");
				String answer2b = kb.nextLine();
				if (answer2b.equals("D")) {
					System.out.println("You open the fuse box, which wire do you cut?");
					System.out.println("Do you \n A) Yellow \n B) Red \n C) Blue \n D) Green");
					String answer3 = kb.nextLine();
					if (answer3.equals("C")) {
						System.out.println("Congrats, you make it out because you aren't in the ocean. You're in a lab meant to test human psychology. The blue wire saved you.\n\n\n\n\njk, the scientist kills you."); System.exit(0);}
					else {
						System.out.println("The dome explodes, bye"); System.exit(0);}
				}
				else {
					System.out.println("The dome explodes, bye"); System.exit(0); }
			}
			else {
				System.out.println("You wake up on a table, a scientist looks over you with her scapels and grins."); System.exit(0); }
		}
		if (answer.equals("D")) {
		System.out.println("You wake up on a table, a scientist looks over you with her scapels and grins."); System.exit(0);}
		else {
		System.out.println("You starve to death because the creator of this game was lazy."); }
	
	
	}
}