public class GMC implements Location
{
	private double xcoor;
	private double ycoor;
	
	public GMC()
	{
		xcoor = ycoor = 0;
	}
	
	public GMC(double x, double y)
	{
		xcoor = x;
		ycoor = y;
	}
	
	public int getID()
	{
		return (int) (Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		xcoor = x;
		ycoor = y;
	}
	
	public double[] getLoc()
	{
		double [] location = {xcoor, ycoor};  
		return location;
	}
}
