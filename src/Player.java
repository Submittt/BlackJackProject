import Cards.Card;

public abstract class Player {
    private int coin;
    private int rankRate;
    private String name;
    private Card[] playerHand;


    public Player() {
        coin = 0;
        rankRate = 0;
        name = "None";
        playerHand = new Card[5];
    }

    public Player (int coin, int rankRate, String name, int handSize) {
        this.coin = coin;
        this.rankRate = rankRate;
        this.name = name;
        this.playerHand = new Card[handSize];
    }

    public int getCoin() {
        return this.coin;
    }
    
    public void setCoin(int coin) {
        this.coin = coin;
    }
    
    public int getRankRate() {
        return this.rankRate;
    }
    
    public void setRankRate(int rankRate) {
        this.rankRate = rankRate;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Card[] getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Card[] playerHand) {
        this.playerHand = playerHand;
    }

    // 카드 합 계산
    public int getHandValue() {
        int totalValue = 0;
        for (Card card : playerHand) {
            if (card != null) {
                totalValue += card.getRank();
            }
        }
        return totalValue;
    }
}


