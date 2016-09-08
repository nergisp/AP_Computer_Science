
//rudeAI
//asks numerous questions, use scanner

import java.util.Scanner;

public class ex_01
{
	public static void main(String[]args)
		{
			//instantiate the new Scanner object "keyboard"
			Scanner keyboard =  new Scanner(System.in);
			
			//prompt for user input
			System.out.println("What is your name? ");
			String name = keyboard.next();
			
			//sassy response
			System.out.printf("Great, you're %s \n", name);
			
			System.out.println("How old are you? ");
			int age = keyboard.nextInt();
			System.out.printf("Wow, %d. How do you even have friends. \n", age);
			
			System.out.println("What do you do for fun? ");
			String fun = keyboard.next();
			System.out.printf("%s ? ....okay \n", fun);
			
			System.out.println("What kind of music do you like? ");
			String music = keyboard.next();
			System.out.printf("Weirdo. Who likes %s \n", music);
			
			System.out.println("How many siblings do you have? ");
			int siblings = keyboard.nextInt();
			System.out.printf("That sucks to have %d siblings \n", siblings);
			
			System.out.println("What do you want to be when you grow up? ");
			String grow = keyboard.next();
			System.out.printf("Good luck with being a %s ,nerd \n", grow);
			
		}
}

