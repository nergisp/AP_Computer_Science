public class TicketDriver {

	public static void main(String[]args) {
		
		Walkup p1 = new Walkup();
		Advance p2 = new Advance(12);
		StudentAdvance p3 = new StudentAdvance(4);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}
}