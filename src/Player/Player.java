package Player;

import java.util.ArrayList;

public abstract class Player {
    private ArrayList<Cards.Card> hand;
    // private int coin;
    // private int rankRate;
    private int score;
    private String name;
    

    public Player() {
        score = 0;
        // coin = 0;
        // rankRate = 0;
        name = "None";
    }

    public Player (String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    public ArrayList<Cards.Card> getPlayerHand() {
        return hand;
    }

    public void addPlayerHand(Cards.Card card) {
        hand.add(card);
        updatePlayerScore();
    }

    public void updatePlayerScore() {
        int totalScore = 0;

        for (Cards.Card card : hand) {
            int rank = card.getRank();

            if (rank == 1) {
                totalScore += 11;
            } else if (rank > 10) {
                totalScore += (totalScore + 11 > 21) ? 1 : 11 ;
            } else {
                totalScore += rank;
            }
        }
        score = totalScore;
    }

    public int getScore() {
        return score;
    }

    // public int getCoin() {
    //     return this.coin;
    // }
    
    // public void setCoin(int coin) {
    //     this.coin = coin;
    // }
    
    // public int getRankRate() {
    //     return this.rankRate;
    // }
    
    // public void setRankRate(int rankRate) {
    //     this.rankRate = rankRate;
    // }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}


