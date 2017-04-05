import java.util.Random;

public class Honda implements Location
{
	private int x,y;
	
	public Honda()
	{
		x = 0;
		y = 0;
	}
	
	public Honda(int[] l)
	{
		x = l[0];
		y = l[1];
	}
	
	public int getID()
	{
     Random rand = new Random();
		 return rand.nextInt(900000) + 100000;
	}
	
	public void move(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int[] getLoc()
	{
		int[] coordinates = {x,y};
		return coordinates;
	}
}
