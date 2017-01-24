import java.lang.Math.*;
import java.util.Scanner;
public class inventory {
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private int price;
   
	public inventory() {
		//default constructor
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
    public inventory(String man, String nm) {
		manufacturer = man;
		name = nm;
		category = "Undefined";
		UPC = (int)(Math.random() * 100000000) + 1;
		price = 0;
	}
   
	public inventory(String man, String nm, String cat, int p) {
		manufacturer = man;
		name = nm;
		category = cat;
		UPC = (int)(Math.random() * 100000000) + 1;
		price = p;
	}
	
	public String toString() {
		return "Inventory Info...\nManufacturer: " + manufacturer +
				"\nName: " + name +
				"\nCategory: " + category +
				"\nUPC#: " + UPC +
				"\nPrice: " + price;
	}
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		inventory inventory1 = new inventory();
		
		System.out.println("Enter category and price too?");
		String answr = kb.next();
		if(answr.equals("n")) {
			inventory1 = new inventory("Piril", "Nerg");
		}
		if(answr.equals("y")) {
			System.out.println("Enter a category: ");
			String cate = kb.next();
			System.out.println("Enter a price: ");
			int pri = kb.nextInt();
			inventory1 = new inventory("Piril", "Nerg", cate, pri);
		}
		
		System.out.println(inventory1);
	}
}