public class Honda extends Car
{
	private double xcoor;
	private double ycoor;
	
	public Honda(double [] p)
	{
		super();
		move(p[0], p[1]);
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
