import java.util.Scanner;


public class APLab_041 {

	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		// compoundedinterest
		System.out.println("Enter the interest rate: ");
		double r = kb.nextDouble();
		System.out.println("Enter the principal: ");
		double p = kb.nextDouble();
		System.out.println("Enter the number of times the loan is compounded per year: ");
		double n = kb.nextDouble();
		System.out.println("Enter the life of the loan in years: ");
		double t = kb.nextDouble();
		
		APLab_041 totalpayment = new APLab_041();
		
		double amount = totalpayment.compoundedinterest(r, p, n, t);
		System.out.printf("The total payment is $%.2f\n", amount);
		
		
		//volume
		
		System.out.println("Enter the height: ");
		double h = kb.nextDouble();
		System.out.println("Enter the width: ");
		double w = kb.nextDouble();
		System.out.println("Enter the length: ");		
		double l = kb.nextDouble();
		
		APLab_041 subwooferbox = new APLab_041();
		
		
		double result = subwooferbox.volume(h, w, l);
		System.out.printf("The volume is %f cubic feet", result);
	}
	
	public double compoundedinterest(double r, double p, double n, double t) {
		
		return p*(Math.pow((1+(r/n)),(n*t)));
	}
	
	public double volume(double h, double w, double l) {
		
		double hft = h/12;
		double wft = w/12;
		double lft = l/12;
		
		return hft*wft*lft;

	}
	
}