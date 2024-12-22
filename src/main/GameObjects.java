package main;

import Cards.CardDeck;
import Player.Dealer;
import Player.HumanPlayer;

public class GameObjects {

    private CardDeck cardDeck;
    private Dealer dealer;
    private HumanPlayer humanPlayer;

    public GameObjects(String playerName) {
        this.cardDeck = new CardDeck();
        this.dealer = new Dealer();
        this.humanPlayer = new HumanPlayer(playerName);
    }

    public CardDeck getCardDeck() {
        return this.cardDeck;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public HumanPlayer getHumanPlayer() {
        return this.humanPlayer;
    }

}
