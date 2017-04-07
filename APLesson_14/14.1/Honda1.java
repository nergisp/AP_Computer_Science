import java.util.Random;

public abstract Car implements Location
{
	private int ID;
	private double[] location;
	
	public Car()
	{

     Random rand = new Random();
		 ID = rand.nextInt(900000) + 1000
     location = new double[2];
	}
	
	public abstract void move(double xx, double yy);
	
	public int getID()
	{
		return ID;
	}
}