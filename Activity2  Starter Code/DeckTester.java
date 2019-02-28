/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"King", "Queen", "Jack"}; 
		int[] values = {1, 3, 5}; 
		
		Deck deck = new Deck(ranks, suits, values); 
		
		System.out.println("What is the deck size: " + deck.size()); 
		System.out.println("Is deck empty?: " + deck.isEmpty()); 
	}
}
