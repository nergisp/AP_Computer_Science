import java.lang.Math.*;

public class Human {
	
	//instance variables
	private String hair, eyes, skin;
	
	public Human() {
		//default constructor
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Human(String h, String e, String s) {
		//constructor
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s) {
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String gethair() {
		return hair;
	}
	public String geteyes() {
		return eyes;
	}
	public String getskin() {
		return skin;
	}
}