import java.util.ArrayList;
import java.util.Arrays;
public class Toyota2 extends Car 
{
	private double xcoor;
	private double ycoor;
	
    public Toyota2(String p) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(p.split(", ")));
        Double pX = Double.parseDouble(position.get(0));
		Double pY = Double.parseDouble(position.get(1));
        move(pX, pY);
    }
	
}
