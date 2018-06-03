package Singletoon.deck;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
public class SingletonExercise {
	public static void main(String args[]) {
		Deck d = Deck.getInstanceOff();
		d.print();
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		Deck decks = Deck.getInstanceOff();
		decks.print();
	}
}