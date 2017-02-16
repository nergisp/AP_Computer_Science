public class AFigure extends Toy
{
	//default constructor 
	public AFigure()
	{
		super();
	}
	
	//constructor with parameters
	public AFigure(String n)
	{
		super(n);
	}

	public String getType()
	{
		return "Action Figure";
	}
}