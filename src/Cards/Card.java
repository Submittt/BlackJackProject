package Cards;

public class Card {
    // Fields
    public static final String Spades = "spades";
    public static final String Hearts = "hearts";
    public static final String Diamonds = "diamonds";
    public static final String Clubs = "clubs";

    private static final int Ace = 1;
    private static final int Jack = 11;
    private static final int Queen = 12;
    private static final int King = 13;

    public static final int SizeOfOneSuit = 13;

    String suit;
    int rank;

    public Card(String s, int r) {
        suit = s;
        rank = r;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    // public boolean isEquals(Card c) {
    //     return suit.equals(c.suit) && rank == c.rank;
    // }

    public boolean isEquals(Card c) {
        if (suit.equals(c.suit) && rank == c.rank){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Card {" +
                "suit= '" + suit + '\'' +
                ", rank= " + rank +
                '}';
    }
    
    // public static void main(String[] args) {
    //     Card card = new Card("spades", 1);
    //     Card card2 = new Card("spades", 1);
    //     System.out.println(card.isEquals(card2));
    // }

}
