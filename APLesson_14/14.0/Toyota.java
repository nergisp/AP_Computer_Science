import java.util.Random;
import java.util.ArrayList;

public class Toyota {
	private int[] location;
	
	public Toyota(String loc) {
		
	}
	
	
	public int getID() {
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
	}
	
	public void move(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public ArrayList<Integer> getLoc() {
		ArrayList<Integer> coordinates = new ArrayList<>();
		coordinates.add(x);
		coordinates.add(y);
		return coordinates;
	}
}