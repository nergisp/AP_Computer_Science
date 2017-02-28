public class Advance extends Ticket {
	
	private int daysLeft;
	
	public Advance(int d) {
		daysLeft = d;
	}
	
	public String getPrice() {
		if (daysLeft >=10) {
			return "30.00";
		}
		else {return "40.00";}
	}
	
}