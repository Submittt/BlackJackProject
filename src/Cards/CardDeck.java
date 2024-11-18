package Cards;

public class CardDeck {
    
    private int cardCounter;
    private Card[] deck = new Card[4 * Card.SizeOfOneSuit];

    private void createSuit(String whichSuit) {
        for (int i = 1; i <= Card.SizeOfOneSuit; i++) {
            deck[cardCounter] = new Card(whichSuit, i);
            cardCounter++;
        }
    }

    // suit별 13장의 카드 생성 메서드
    private void createDeck() {
        createSuit(Card.Spades);
        createSuit(Card.Hearts);
        createSuit(Card.Diamonds);
        createSuit(Card.Clubs);
    }

    // 기본 생성자 (객체 생성 시 52장의 덱을 생성)
    public CardDeck() {
        createDeck();
    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.deck.length);
        for (int i = 0; i <= (Card.SizeOfOneSuit * 4) -1; i++) {
            System.out.println(i+1 + "번째 카드는 "+ cardDeck.deck[i].getSuit() + " " + cardDeck.deck[i].getRank());
        }
    }
}
