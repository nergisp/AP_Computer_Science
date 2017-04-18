public abstract class Car1 implements Location1
{
	private int ID;
	private double[] location;
	
	public Car1()
	{
		ID = (int) (Math.random() * 1000000) + 1;
		location = new double[2];
	}
	
	public abstract void move(double x, double y);
	
	public int getID()
	{
		return ID;
	}
}
