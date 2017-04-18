public abstract class Car implements Location
{
	private int ID;
	private double[] location;
	
	public Lab_14_1_CarClass()
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
