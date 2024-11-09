import java.util.Scanner;


public class BlackJackGameMain {

    static int userSelectNum;
            
        public static void playGame() {
    
            System.out.println("블랙잭 게임에 오신 것을 환영합니다.");
            userSelectNum = inputSelector();

            if (userSelectNum == 1) {
                System.out.println("게임을 진행합니다.");
            } else if (userSelectNum == 2) {
                System.out.println("게임을 종료합니다.");
            }
    }

    public static int inputSelector() {

        Scanner scan = new Scanner(System.in);
        int userSelectNum;

        while (true) {
            System.out.println("1. 게임시작  2. 게임 종료");
            userSelectNum = scan.nextInt();
            
            if (userSelectNum == 1 || userSelectNum == 2) {
                break;
            } else {
                System.out.println("잘못된 입력값입니다 다시 입력해주세요.");
                continue;
            } 
        }
        return userSelectNum;
    }


    public static void main(String[] args) {

        playGame();
    }
}
