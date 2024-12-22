package main;
import Cards.*;
import Player.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BlackJackGameMain {

    static int userSelectNum;
            
    public static void playGame(Scanner sc) {

        System.out.println("블랙잭 게임에 오신 것을 환영합니다.");
        userSelectNum = inputSelector(sc);
        sc.nextLine();

        if (userSelectNum == 1) {
            System.out.println("게임을 진행합니다.");

            System.out.println("플레이어의 닉네임을 입력하세요:");
            String playerName = sc.nextLine();

            GameObjects gameObjects = new GameObjects(playerName);
            
            CardDeck cardDeck = gameObjects.getCardDeck();
            Dealer dealer = gameObjects.getDealer();
            Player HumanPlayer = gameObjects.getHumanPlayer();
    
            System.out.println(HumanPlayer.getName());
    
        } else if (userSelectNum == 2) {
            System.out.println("게임을 종료합니다.");
        }
    }

    

    public static int inputSelector(Scanner sc) {
        int userSelectNum = -1;
    
        while (true) {
            System.out.println("1. 게임 시작  2. 게임 종료");
            try {
                userSelectNum = sc.nextInt();
                if (userSelectNum == 1 || userSelectNum == 2) {
                    break; // 입력이 올바르면 루프 종료
                } else {
                    System.out.println("1 또는 2를 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요. 1 또는 2를 입력해주세요.");
                sc.next(); // 잘못된 입력 버리기
            }
        }
    
        return userSelectNum; // 올바른 입력 후 반환
    }
    


    public static void main(String[] args) {
        CardDeck c1 = new CardDeck();
        Dealer d1 = new Dealer();
        Player p1 = new HumanPlayer("sy");
        d1.addPlayerHand(c1.deck[(int)(Math.random() * 52) + 1]);
        System.out.println(d1.getScore());
        System.out.println(p1.getScore());
        GameLogics.determineWinner(p1, d1);

        Scanner sc = new Scanner(System.in); // Scanner 객체를 한 번만 생성
        playGame(sc); // Scanner를 메서드에 전달
        sc.close(); // 프로그램 종료 시 Scanner 닫기
    }
}
