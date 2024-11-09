public abstract class Player {
    private int coin;
    private int rankRate;
    private String name;


    public Player() {
        coin = 0;
        rankRate = 0;
        name = "None";
    }

    public Player (int coin, int rankRate, String name) {
        this.coin = coin;
        this.rankRate = rankRate;
        this.name = name;
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

}


