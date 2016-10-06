
import java.util.Random;
import java.util.Scanner;

public class APLab_05_02 {
	
	static double subtotal;
	static double discount;
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		APLab_05_02 receipt = new APLab_05_02();
		
		System.out.println("Enter the first item: ");
		String item_01 = kb.nextLine();
		System.out.println("Enter its price: ");
		double price_01 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter the second item: ");
		String item_02 = kb.nextLine();
		System.out.println("Enter its price: ");
		double price_02 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter the third item: ");
		String item_03 = kb.nextLine();
		System.out.println("Enter its price: ");
		double price_03 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter the forth item: ");
		String item_04 = kb.nextLine();
		System.out.println("Enter its price: ");
		double price_04 = kb.nextDouble();
	
		subtotal = price_01 + price_02 + price_03 + price_04;
		calcdiscount();
		double tax = subtotal*.069;
		double total = subtotal - discount + tax;
		
		System.out.printf("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.format(item_01, price_01);
		receipt.format(item_02, price_02);
		receipt.format(item_03, price_03);
		receipt.format(item_04, price_04);
		receipt.format("subtotal", subtotal);
		receipt.format("discount", discount);
		receipt.format("tax", tax);
		receipt.format("total", total);
		System.out.printf("\n__________________________________________\n");
		System.out.printf(" * Thank you for your support *");
	
	}
	
	public static void calcdiscount() {
		
		if (subtotal >= 2000) {
			
			discount = subtotal*.15;
			
		}
		
		if (subtotal < 2000) {
			
			discount = 0;
			
		}
		
	}
	
	public static void format(String item, double price) {
		
		System.out.printf("\n* %15s  ......  %5.2f", item, price);
		
	}

}