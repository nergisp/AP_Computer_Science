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
		
		receipt.receiptformat(item_01, item_02, item_03, price_01, price_02, price_03);
		
		
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
		
		idcard.idformat(school, year, first_name, last_name, title, subject);
		
	}
	
	public void receiptformat(String item1, String item2, String item3, double price1, double price2, double price3)
	{
		
		double subtotal = price1 + price2 + price3;
		
		double tax = subtotal*.069;
		
		double total = subtotal + tax;
		
		System.out.printf("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		System.out.printf("*  %s ........      %f\n", item1, price1);
		System.out.printf("*     %s ........      %f\n", item2, price2);
		System.out.printf("*             %s ........      %f\n", item3, price3);
		System.out.printf("\n");
		System.out.printf("*        Subtotal: ........      %f\n", subtotal);
		System.out.printf("*             Tax: ........      %f\n", tax);
		System.out.printf("*           Total: ........      %f\n", total);
		System.out.printf("__________________________________________");
		System.out.printf(" * Thank you for your support *\n\n");
		
	}
	
	public void idformat(String school, String year, String first_name, String last_name, String title, String subject)
	{
		System.out.printf("***********************************\n");
		System.out.printf("*  %s           %s *\n", school, year );
		System.out.printf("*       %s         %s *\n", first_name, last_name);
		System.out.printf("*       %s  %s *\n", title, subject);
		System.out.printf("***********************************\n");

		
		
	}
}