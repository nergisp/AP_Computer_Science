public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure t1 = new AFigure("Bob");
		Car t2 = new Car("Honda");
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}