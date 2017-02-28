public class GameRunner {

	public static void main(String[]args) {
		
		xbox g1 = new xbox("xbox360");
		PlayStation g2 = new PlayStation("PS4");
		PC g3 = new PC("Windows");
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(g3.toString());
		
	}
}
