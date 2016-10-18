import java.util.Scanner;

public class password {
	static String usernametrue;
	static String passwordtrue;
	
	public static void main(String[]args) {
		
		usernametrue = "pswag";
		passwordtrue = "bob";
		
		passCheck();
	}
	
	public static void passCheck() {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String usernameinput = kb.nextLine();
		System.out.println("Enter your password: ");
		String passwordinput = kb.nextLine();
		
		if (usernameinput.equals(usernametrue) && passwordinput.equals(passwordtrue)) {
			System.out.println("You are granted access!"); }
		else if (usernameinput.equals(usernametrue)) {
			System.out.println("Your password is incorrect!");
			passCheck(); }
		else if (passwordinput.equals(passwordtrue)) {
			System.out.println("Your username is incorrect!");
			passCheck(); }
		else {
			System.out.println("Your username and password are incorrect!");
			passCheck(); }
		
	}
	
}