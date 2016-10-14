import java.util.Scanner;

public class password {
	static String usernametrue;
	static String passwordtrue;
	static String usernameinput;
	static String passwordinput;
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		usernametrue = "pswag";
		passwordtrue = "bob";
		
		passCheck();
	}
	
	public static void passCheck() {
		
		System.out.println("Enter your username: ");
		usernameinput = kb.nextLine();
		System.out.println("Enter your password: ");
		passwordinput = kb.nextLine();
		
		if (usernameinput == usernametrue || passwordinput == passwordtrue) {
		System.out.println("You are granted access!"); }
		else if (usernameinput == usernametrue) {
			System.out.println("Your passowrd is incorrect!");
			recursion(); }
		else if (passwordinput == passwordtrue) {
			System.out.println("Your username is incorrect!");
			recursion(); }
		else {
			System.out.println("Your username and password are incorrect!");
			recursion(); }
		
	}
	
}