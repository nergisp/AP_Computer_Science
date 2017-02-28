public class PlayStation extends Console
{
	//default constructor 
	public PlayStation()
	{
		super();
	}
	
	//constructor with parameters
	public PlayStation(String p)
	{
		super(p);
	}
	
		public String getController()
	{
		return "PS DualShock 3";
	}

			public String getPlatform()
	{
		return "PlayStation";
	}
}