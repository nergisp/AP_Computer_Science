
import java.util.Scanner; //import statement

public class lesson_03
{
	public static void main(String[]args)
		{
			//instantiate the nwe Scanner object "keyboard"
			Scanner keyboard = new Scanner(System.in);
			
			//prompt for user input
			System.out.println("How old are you? ");
			
			//search for the next integer that the user enters
			String answer = keyboard.next();
			
			//print the results...
			System.out.println("Wow! " + answer + " is perfect.");
		}
}