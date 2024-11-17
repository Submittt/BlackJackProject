import java.util.InputMismatchException;
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
    int userSelectNum = -1;

    try {
        while (true) {
            System.out.println("1. 게임 시작  2. 게임 종료");
            try {
                userSelectNum = scan.nextInt();

                if (userSelectNum == 1 || userSelectNum == 2) {
                    break;
                } else {
                    System.out.println("1 또는 2를 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요. 1 또는 2를 입력해주세요.");
                scan.next(); //값 버리기
            }
        }
    } finally {
        scan.close();
    }

    return userSelectNum;
}



    public static void main(String[] args) {

        playGame();
    }
}
