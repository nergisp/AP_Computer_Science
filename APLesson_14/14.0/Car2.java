import java.util.Random;

public abstract class Car2 implements Location
{
	private int ID;
	private double[] location = new double[2];
	
	public Car()
	{
     Random rand = new Random();
		 ID = rand.nextInt(900000) + 100000;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location; 
	}
}
