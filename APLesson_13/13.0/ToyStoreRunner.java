import java.util.Scanner;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String toysList = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a list of toys: ");
		toysList = kb.nextLine();
		
		ToyStore toys = new ToyStore(toysList);
		System.out.println(toys);
		System.out.println("Most Frequent Toy: " + toys.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toys.getMostFrequentType());
	}
}