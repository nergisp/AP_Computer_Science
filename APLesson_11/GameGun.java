import java.util.Scanner;

public class GameGun {
	
	static int bulletCount;
	static int clipsize = 16;
	static int shotCount;
	static String[] clip;
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String [clipsize];
		resetClip();
		
		while (bulletCount>0 || shotCount>0) {
			System.out.println("Action: ");
			String response = kb.next();
			
			if (response.equals("R")) {
				reload();
			}
			if (response.equals("S")) {
				System.out.println(shoot());
			}
			System.out.println(printClip());
		}
		
		System.out.println("Out of bullets!");
		
	}
	
	public static void resetClip() {
		
		for (int i= 0; i<clip.length; i++) {
			clip[i] = "[]";
		}
		
	}
	
	public static String shoot() {
		
		if (shotCount > 0) {
			clip[shotCount-1] = "[]";
			shotCount--;
			return "Boom!!!";
		}
		else {
			return "Reload!!!";
		}
	}
	
	public static void reload() {
		if (bulletCount >= clipsize) {
			bulletCount = bulletCount - clipsize;
			shotCount = clipsize;
		}
		else {
			shotCount=bulletCount;
			bulletCount=0;
		}
		
		resetClip();
		for (int i=0; i<shotCount;i++) {
			clip[i] = " * ";
		}
	}
	
	public static String printClip() {
		String output = "";
		output = "Bullets: " + "\t" + bulletCount + "\n" + "Clip: " + "\t";
		for (int i=0; i<clipsize; i++) {
			output = output + clip[i];
		}
		
		return output;
	}
	
}