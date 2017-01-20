import java.util.Scanner;

public class MPHRunner{
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the distance: ");
		int di = kb.nextInt();
		System.out.println("Enter the hours: ");
		int ho = kb.nextInt();
		System.out.println("Enter the minutes: ");
		int mi = kb.nextInt();
		double mph = 0;
		MilesPerHour object = new MilesPerHour(di, ho, mi, mph);
		
		object.setValues(di, ho, mi, mph);
		
		System.out.printf("For a distance of %d, %d hours, and %d minutes, the mph is %2f", di, ho, mi, object.getMPH());
		
		System.out.println("Enter the distance: \n");
		int di2 = kb.nextInt();
		System.out.println("Enter the hours: \n");
		int ho2 = kb.nextInt();
		System.out.println("Enter the minutes: \n");
		int mi2 = kb.nextInt();
		
		object.setValues(di2, ho2, mi2, mph);
		
		System.out.printf("For a distance of %d, %d hours, and %d minutes, the mph is %2f", di2, ho2, mi2, object.getMPH());
		
		
		
	}
	
	
}