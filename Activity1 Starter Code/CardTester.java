/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Spades", 13); 
		Card card2 = new Card("Queen", "Diamonds", 12); 
		Card card3 = new Card("Nine", "Clubs", 9); 
		
		System.out.println("Does Card one match Card two? " + card1.matches(card2));
		System.out.println("Does Card one match Card three? " + card1.matches(card3));    
		System.out.println("Suit of Card two: " + card2.suit());
		System.out.println("Card three: " + card3.toString());
	}
}
