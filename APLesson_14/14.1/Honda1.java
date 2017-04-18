public class Honda1 extends Car1
{
	private double xcoor;
	private double ycoor;
	
	public Honda1(double [] p)
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
