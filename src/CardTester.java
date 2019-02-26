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
		Card cardOne = new Card("King", "Spades", 13); 
		Card cardTwo = new Card("Queen", "Diamonds", 12); 
		Card cardThree = new Card("Nine", "Clubs", 9); 
		
		System.out.println("Does Card one match Card two? " + cardOne.matches(cardTwo));
		System.out.println("Does Card one match Card three? " + cardOne.matches(cardThree));    
		System.out.println("Suit of Card two: " + cardTwo.suit());
		System.out.println("Card three: " + cardThree.toString());
	}
}
