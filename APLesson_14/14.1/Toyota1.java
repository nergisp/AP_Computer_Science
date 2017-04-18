import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends CarClass
{
	private double xcoor;
	private double ycoor;
	
	public Toyota(String p)
	{
		super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(p.split(", ")));
        Double pX = Double.parseDouble(position.get(0));
		Double pY = Double.parseDouble(position.get(1));
        move(pX, pY);
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
