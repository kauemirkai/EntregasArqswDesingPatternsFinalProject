package Singletoon.deck;
/**
 * 
 * @author Kaue victor Paz Garcia Mirkai.
 * Ra:81613004
 * Professor:Bonato
 * 			
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {
	public static Deck firstIntance = null;

	public Deck() {
		

	}

	static Deck getInstanceOff() {
		
		if (firstIntance == null) {
		firstIntance = new Deck();
		cards = new ArrayList<Card>();
		// build the deck
		Suit[] suits = { Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
		// shuffle it!
		Collections.shuffle(cards, new Random());
		
		}
		
		return firstIntance;
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

	private static List<Card> cards;
}