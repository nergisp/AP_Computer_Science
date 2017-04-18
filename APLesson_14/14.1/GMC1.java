public class GMC1 extends Car1
{
	private double xcoor;
	private double ycoor;
	
	public GMC1(double x, double y)
	{
		super();
		move(x, y);
	}
	
	public void move(double x, double y)
	{
		this.xcoor += x;
		this.ycoor += y;
	}
	
	public double [] getLoc()
	{
		double [] location = {xcoor, ycoor};
		return location;
	}
}
