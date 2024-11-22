
package Cards;

import java.util.ArrayList;
import java.util.Arrays;

public class CardDeck {
    
    private int cardCounter;
    private Card[] deck = new Card[4 * Card.SizeOfOneSuit];
    private int remainingCards; // 남은 카드

    public CardDeck() {
        createDeck();
        remainingCards = deck.length;
    }

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

    // 카드 뽑기 메서드
    public Card drawCard() {
        if (remainingCards > 0) {
            remainingCards--;
            return deck[remainingCards]; // 맨 위 카드를 반환하고 남은 카드 수 감소
        }
        return null; // 카드가 없다면 null 반환
    }
    

    public int getRemainingCards() {
        return remainingCards;
    }

    public Card[] getDeck() {
        return deck;
    }

    public int getDeckSize() {
        return deck.length;
    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        ArrayList<Card> list = new ArrayList<>(Arrays.asList(cardDeck.deck));
        System.out.println(cardDeck.deck.length);
        for (int i = 0; i <= (Card.SizeOfOneSuit * 4) -1; i++) {
            System.out.println(i+1 + "번째 카드는 "+ cardDeck.deck[i].getSuit() + " " + cardDeck.deck[i].getRank());
        }
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        for (Card c : list ) { System.out.println(c);};
    }
}
