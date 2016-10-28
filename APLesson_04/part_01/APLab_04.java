import java.util.Scanner;

public class APLab_04
{
	
	public static void main(String[]args)
	{
		
		// initiate keyboard
		Scanner kb = new Scanner(System.in);
		
		// Reciept
		
		System.out.printf("Please enter item 1: ");
		String item_01 = kb.nextLine();
		System.out.printf("Please enter the price: ");
		double price_01 = kb.nextDouble();
		
		// soak up extra \n
		kb.nextLine();
		
		System.out.printf("Please enter item 2: ");
		String item_02 = kb.nextLine();
		System.out.printf("Please enter the price: ");
		double price_02 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.printf("Please enter item 3: ");
		String item_03 = kb.nextLine();
		System.out.printf("Please enter the price: ");
		double price_03 = kb.nextDouble();
		
		kb.nextLine();
		
		APLab_04 receipt = new APLab_04();
		
		double subtotal = price_01 + price_02 + price_03;
		double tax = subtotal*.069;
		double total = subtotal + tax;
		
		System.out.printf("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.receiptformat(item_01, price_01);
		receipt.receiptformat(item_02, price_02);
		receipt.receiptformat(item_03, price_03);
		System.out.println("\n");
		receipt.receiptformat("Subtotal", subtotal);
		receipt.receiptformat("Tax", tax);
		receipt.receiptformat("Total", total);
		System.out.printf("\n__________________________________________");
		System.out.printf("\n * Thank you for your support *\n\n");
		
		// ID CardLayout
		System.out.printf("\nEnter your first name: ");
		String first_name = kb.nextLine();
		
		System.out.printf("Enter your last name: ");
		String last_name = kb.nextLine();
		
		System.out.printf("Enter your title: ");
		String title = kb.nextLine();
		
		System.out.printf("Enter the school site: ");
		String school = kb.nextLine();
		
		System.out.printf("Enter the school year: ");
		String year =  kb.nextLine();
		
		System.out.printf("What is your subject? ");
		String subject = kb.nextLine();
		
		APLab_04 idcard = new APLab_04();
		
		System.out.printf("***********************************\n");
		idcard.idformat(school, year);
		idcard.idformat(first_name, last_name);
		idcard.idformat(title, subject);
		System.out.printf("***********************************\n");
	}
	
	public void receiptformat(String item, double price)
	{
		
		System.out.printf("\n* %15s ........ %5.2f", item, price);
		
	}
	
	public void idformat(String item1, String item2)
	{
		
		System.out.printf("* %20s\t%20s *\n", item1, item2);
		
	}
}