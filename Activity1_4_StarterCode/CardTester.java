public class CardTester
{

	public static void main(String[] args)
	{
		Card card1 = new Card("Heart", "9", 9);
		Card card2 = new Card("Heart", "9", 9);
		Card card3 = new Card("Heart", "Jack", 11);
		
		System.out.println(card3.toString());
		
		System.out.println("Card 1 and Card 2 should match: " + card2.matches(card1));
		System.out.println("Card 2 and Card 3 should not match: " + !card2.matches(card3));
	}
}
