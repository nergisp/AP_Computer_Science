import java.util.Random;
import java.util.ArrayList;

public class Toyota2 implements Location2 {
	private double[] location;
	private double x,y;
	
	public Toyota2() {
		super();
		l = new double[2];
	}
	
	public Toyota2() {
		x = Double.parsedouble(l.substring(0,1));
		y = Double.parsedouble(l.substring(3));
	}
	
	public int getID() {
		Random rand = new Random();
		return rand.nextint(900000) + 100000;
	}
	
	public void move(double xx, double yy) {
		x = xx;
		y = yy;
	}
	
	public double[] getLoc() {
		double[] coordinates = {x,y};
		return coordinates;
	}
}