package main;

import Player.Player;

public class GameLogics {
    public static void determineWinner(Player player, Player dealer) {
        int playerScore = calculateScore(player);
        int dealerScore = calculateScore(dealer);

        if (playerScore > 21) {
            System.out.println("플레이어가 버스트! 딜러의 승리입니다.");
        } else if (dealerScore > 21) {
            System.out.println("딜러가 버스트! 플레이어의 승리입니다.");
        } else if (playerScore > dealerScore) {
            System.out.println("플레이어가 승리했습니다!");
        } else if (playerScore < dealerScore) {
            System.out.println("딜러가 승리했습니다.");
        } else {
            System.out.println("무승부입니다.");
        }
    }

    public static int calculateScore(Player player) {
        return player.getScore();
    }

}
