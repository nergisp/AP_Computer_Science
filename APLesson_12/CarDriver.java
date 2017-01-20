import java.util.Scanner;

public class CarDriver {
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the paint: ");
		String paint = kb.next();
		System.out.println("Enter the interior: ");
		String interior = kb.next();
		System.out.println("Enter the engine: ");
		String engine = kb.next();
		System.out.println("Enter the tires: ");
		String tires = kb.next();

		Car object = new Car(paint, interior, engine, tires);
		
		object.setCustom(paint, interior, engine, tires);
		
		System.out.printf("Your vehicle is ready......\n Paint: %s \n Interior: %s \n Engine: %s \n Tires: %s", object.getPaint(),object.getInterior(),object.getEngine(),object.getTires());
			
	}
	
}