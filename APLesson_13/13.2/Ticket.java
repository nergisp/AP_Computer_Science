import java.util.Random;

public abstract class Ticket {
	public String platform;
	public int serialnum;

	//constructors
	public Ticket() {
		Random rand = new Random();
		serialnum = rand.nextInt(9000000) + 1000000;
	}

	//Accessors
	public abstract String getPrice();
	
	public int getSerialNumber()
	{
		return serialnum;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNumber() + "\nPrice: " + getPrice();
	}
}