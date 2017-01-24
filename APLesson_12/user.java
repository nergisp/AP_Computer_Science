import java.lang.Math.*;
import java.util.Scanner;

public class user {
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
   
	public user() {
		//default constructor
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
    public user(String fN, String lN) {
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
   
	public user(String fN, String lN, String av) {
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setuserID(int id) {
		userID = id;
	}
	
	public String toString() {
		return "Customer Info...\nFirst Name: " + firstName +
				"\nLast Name: " + lastName +
				"\nAvatar: " + avatar +
				"\nUser ID#: " + userID;
	}
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		user user1 = new user();
		
		System.out.println("Would you like to use a public avatar?");
		String answr = kb.next();
		if(answr.equals("n")) {
			user1 = new user("Piril", "Nerg");
		}
		if(answr.equals("y")) {
			System.out.println("Enter an avatar");
			String avt = kb.next();
			user1 = new user("Piril", "Nerg", avt);
		}
		
		System.out.println(user1);
	}
}