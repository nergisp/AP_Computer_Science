public class xbox extends Console
{
	//default constructor 
	public xbox()
	{
		super();
	}
	
	//constructor with parameters
	public xbox(String p)
	{
		super(p);
	}
	
		public String getController()
	{
		return "XBox Wireless Controller";
	}

			public String getPlatform()
	{
		return "XBox";
	}
}