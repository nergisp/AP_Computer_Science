import java.lang.Math.*;

public class Distance {
	
	//instance variables
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance() {
		//default constructor
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0.0;
	}
	
	public Distance(int x1, int x2, int y1, int y2) {
		//constructor with params
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0.0;
	}
	
	public void setValues(int x1, int x2, int y1, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0.0;
	}
	
	public double getDist() {
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}