import java.lang.Math.*;

public class MilesPerHour {
	
	//instance variables
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour() {
		//default constructor
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0.0;
	}
	
	public MilesPerHour(int d, int h, int min, double mph) {
		//constructor with params
		distance = d;
		hours = h;
		minutes = min;
		mph = 0.0;
	}
	
	public void setValues(int d, int h, int min, double mph) {
		distance = d;
		hours = h;
		minutes = min;
		mph = 0.0;
	}
	
	public double getMPH() {
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}