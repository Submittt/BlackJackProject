import java.util.Random;
import Cards.Card;
import Cards.CardDeck;

public class Action {

    // 카드 셔플
    public static void shuffleDeck(CardDeck cardDeck) {
        Random rand = new Random();
        Card[] deck = cardDeck.getDeck();

        for (int i = 0; i < cardDeck.getDeckSize(); i++) {
            int j = rand.nextInt(cardDeck.getDeckSize());
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    // 플레이어 핸드에 카드를 추가하는 메서드
    public static void addCardToHand(Player player, Card card) {
        for (int i = 0; i < player.getPlayerHand().length; i++) {
            if (player.getPlayerHand()[i] == null) {  // 빈 자리에 카드 추가
                player.getPlayerHand()[i] = card;
                break;
            }
        }
    }

    // 게임 시작 시 카드 2장씩 배분
    public static void startDealCards(User user, Dealer dealer, CardDeck cardDeck) {
        for (int i = 0; i < 2; i++) {
            addCardToHand(user, cardDeck.drawCard());
            addCardToHand(dealer, cardDeck.drawCard());
        }
    }    
    
}
