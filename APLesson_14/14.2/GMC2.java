import java.util.Random;

public class GMC2 implements Location2 {
	int x,y;
	
	public GMC2() {
		x=0;
		y=0;
	}
	
	public int GMC2(int xx, int yy) {
		x=xx;
		y=yy;
	}
	
	public int getID() {
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
	}
	
	public void move(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int getLoc() {
		int[] coordinates = {x,y};
		return coordinates;
	}
}