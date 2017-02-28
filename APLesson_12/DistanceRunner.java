import java.util.Scanner;

public class DistanceRunner {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the x1: ");
		int x1 = kb.nextInt();
		System.out.println("Enter the y1: ");
		int y1 = kb.nextInt();
		System.out.println("Enter the x2: ");
		int x2 = kb.nextInt();
		System.out.println("Enter the y2: ");
		int y2 = kb.nextInt();

		Distance object = new Distance(x1, y1, x2, y2);
		
		object.setValues(x1, y1, x2, y2);
		
		System.out.printf("distance is %.2f\n", object.getDist());
		
		System.out.println("Enter the second x1: ");
		x1 = kb.nextInt();
		System.out.println("Enter the second y1: ");
		y1 = kb.nextInt();
		System.out.println("Enter the second x2: ");
		x2 = kb.nextInt();
		System.out.println("Enter the second y2: ");
		y2 = kb.nextInt();
		
		object.setValues(x1, y1, x2, y2);
		
		System.out.printf("distance is %.2f", object.getDist());
			
	}
}