
public class DeckTester
{
	public static void main(String[] args)
	{
	    		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"3", "5", "Ace", "Queen"};
		String[] suits1 = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] pointValues1 = {3, 5, 1, 12};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		System.out.println("The first deck should be empty: " + deck1.isEmpty());
		
		String[] ranks2 = {"Jack", "King", "Queen", "Ace"};
		String[] suits2 = {"Diamonds", "Diamonds", "Hearts", "Spades"};
		int[] pointValues2 = {11, 13, 12, 1};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);
		System.out.println("The second deck's size should be: " + deck2.size());
		
		String[] ranks3 = {"8", "4", "King"};
		String[] suits3 = {"Spades", "Clubs", "Hearts"};
		int[] pointValues3 = {8, 4, 13};
		Deck deck3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println("The third deck's dealt card is: " + deck3.deal());
		
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck = new Deck(ranks, suits, pointValues);

		System.out.println("The whole deck's dealt card is: " + deck.deal());
	   
	}
}
