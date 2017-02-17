import java.util.*;

public class Joker{
	public static void main(String[] args) {
		Card[] cards = new Card[54];
		int i = 0;
		for (int rank = Card.three; rank < Card.color - 1; ++ rank) {
			cards[i++] = new Card(0,rank);
			cards[i++] = new Card(1,rank);
			cards[i++] = new Card(2,rank);
			cards[i++] = new Card(3,rank);
		}
		cards[i++] = new Card(4, Card.black);
		cards[i++] = new Card(4, Card.color);
		Random r = new Random();
		for (i = cards.length - 1; i >= 1; -- i) {
			int j = r.nextInt(i);
			Card t = cards[i]; cards[i] = cards[j]; cards[j] = t;
		}
		Player[] players = {
			new Player(1, "Tom"),
			new Player(2, "Jerry"),
			new Player(3, "gaowei")
		};
		int j = 0;
		for (i = 0; i < cards.length; ++ i) {
			Card c = cards[i];
			players[j++ % players.length].add(c);
		}
	}
}

class Card extends Object{
	private int suit;
	private int rank;
	public static final int club = 0;
	public static final int diamond = 1;
	public static final int heart = 2;
	public static final int spade = 3;
	public static final int joke = 4;

	public static final int three = 0;
	public static final int four = 1;
	public static final int five = 2;
	public static final int six = 3;
	public static final int seven = 4;
	public static final int eight = 5;
	public static final int nine = 6;
	public static final int ten = 7;
	public static final int jack = 8;
	public static final int queen = 9;
	public static final int king = 10;
	public static final int ace = 11;
	public static final int deuce = 12;
	public static final int black = 13;
	public static final int color =14;
	public Card() {}
	public Card(int suit, int rank) {
		this.rank = rank;
		this.suit = suit;
	}
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Card) {
			Card other = (Card)obj;
			return this.rank == other.rank
				&& this.suit == other.suit;
		}
		return false;
	}
}

class Player{
	private int id;
	private String name;
	private Card[] cards = {};
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void add(Card card) {
		cards = Arrays.copyOf(cards, cards.length + 1);
		cards[cards.length - 1] = card;
	}
}
