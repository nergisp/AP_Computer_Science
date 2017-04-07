public class StudentAdvance extends Advance {
	
	private int daysLeft;
	
	public StudentAdvance(int d) {		
		super();
		daysLeft=d;
	}
	
	public String getPrice() {
		if (daysLeft >=10) {
			return "15.00";
		}
		else {return "20.00";}
	}
	
}