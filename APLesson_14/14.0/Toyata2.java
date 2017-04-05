import java.util.Random;
import java.util.ArrayList;

public class Toyota2 implements Location {
	private int[] location;
	private int x,y;
	
	public Toyota() {
		super;
		l = new double[2]
	}
	
	public Toyota() {
		x = Integer.parseInteger(l.substring(0,1));
		y = Integer.parseInteger(l.substring(3));
	}
	
	public int getID() {
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
	}
	
	public void move(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int[] getLoc() {
		int[] coordinates = {x,y};
		return coordinates;
	}
}
