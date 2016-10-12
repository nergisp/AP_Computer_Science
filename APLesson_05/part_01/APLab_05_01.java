import java.util.Random;

public class APLab_05_01 {
	
	static int computer;
	static int user;
	static String winner;
	
	public static void main(String[]args) {
		
		// create objects
		Random rand = new Random();
		
		computer = 1 + (int)((Math.random()* 5));
		
		user = 1 + rand.nextInt(5);
		
		System.out.println("You rolled a " + user);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + rollDice());
		
	}
	
	public static String rollDice() {
		
		if (computer > user) {
			
			winner = "computer";
			
		}
		
		if (user > computer) {
			
			winner = "you";
			
		}
		
		if (computer == user) {
			
			winner = "no one: both rolled the same number";
			
		}
		
		return winner;
		
	}
}