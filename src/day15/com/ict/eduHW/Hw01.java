package day15.com.ict.eduHW;

import java.util.Random;
import java.util.Scanner;

public class Hw01 {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        Random ran = new Random();

	        String[] choices = { "가위", "바위", "보" };

	        int totalGames = 0;
	        int userWins = 0;

	        System.out.println("가위바위보 게임을 시작합니다.");
	        System.out.println("가위(0), 바위(1), 보(2) 중 하나를 선택하세요.");

	        while (true) {
	            System.out.print("선택: ");
	            int userChoice = scan.nextInt();

	            if (userChoice < 0 || userChoice > 2) {
	                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
	                continue;
	            }

	            int computerChoice = ran.nextInt(3);

	            System.out.println("사용자 선택: " + choices[userChoice]);
	            System.out.println("컴퓨터 선택: " + choices[computerChoice]);

	            int result = (userChoice - computerChoice + 3) % 3;
	            if (result == 0) {
	                System.out.println("무승부입니다.");
	            } else if (result == 1) {
	                System.out.println("사용자가 이겼습니다!");
	                userWins++;
	            } else {
	                System.out.println("컴퓨터가 이겼습니다!");
	            }

	            totalGames++;

	            System.out.print("게임을 계속하시겠습니까? (1: 예, 0: 아니오): ");
	            int playAgain = scan.nextInt();

	            if (playAgain == 0) {
	                break;
	            }
	        }

	        System.out.println("게임을 종료합니다.");
	        System.out.println("총 게임 횟수: " + totalGames);
	        System.out.println("사용자의 승률: " + (double) userWins / totalGames * 100 + "%");
	    }
	}