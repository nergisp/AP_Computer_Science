public class Advance extends Ticket {
	
	private int daysLeft;
	
	public Advance() {
		this.daysLeft = 0;
	}
	
	public Advance(int d) {
		this.daysLeft = d;
	}
	
	public String getPrice() {
		if (this.daysLeft >=10) {
			return "30.00";
		}
		else {return "40.00";}
	}
	
}