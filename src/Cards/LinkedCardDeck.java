package Cards;
import List.LinkedList;

public class LinkedCardDeck {

    private LinkedList list = new LinkedList();

    
    private void createSuit(String whichSuit) {
        for (int i = 1; i <= Card.SizeOfOneSuit; i++) {
            list.addLast(new Card(whichSuit, i));
            // cardCounter++;
        }
    }

    private void createDeck() {
        createSuit(Card.Spades);
        createSuit(Card.Hearts);
        createSuit(Card.Diamonds);
        createSuit(Card.Clubs);
    }

    public LinkedCardDeck() {
        createDeck();
    }

    public static void main(String[] args) {
        LinkedCardDeck d1 = new LinkedCardDeck();
        for (int i = 0; i <= (d1.list.size()) - 1; i++) {
            Card card = (Card) d1.list.get(i);
            System.out.println(i+1+ "번째 카드는 " + card.getSuit() +" "+ card.getRank());
        }
    }
}
