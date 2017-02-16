import java.util.Random;


public class GameSystem {
	private String platform;
	private int serialnum;

	//constructors
	public GameSystem() {
		platform = "";
		serialnum = 0;
	}

	public GameSystem(String p) {
		platform = p;
		Random rand = new Random();
		serialnum = rand.nextInt(9000000) + 1000000;		
	}

	//Accessors
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNumber()
	{
		return serialnum;
	}
}