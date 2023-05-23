package day15.com.ict.eduHW;

import java.util.Scanner;
public class HW02 {
	public static void main(String[] args) {


        int count = 1;
        int num = (int) (Math.random() * 100) + 1;

        Scanner scan = new Scanner(System.in);

        int num_enter = 0;

        while (num != num_enter) {
            System.out.print("1~100 숫자 입력: ");
            num_enter = scan.nextInt();
            if (num > num_enter) {
                System.out.println("UP");
                count++;
            } else if (num < num_enter) {
                System.out.println("DOWN");
                count++;
            }
        }
        System.out.println("정답입니다! " + count + "회 만에 맞췄습니다.");

        System.out.print("계속하시겠습니까? (1: 예, 0: 아니오): ");
        int continueGame = scan.nextInt();

        if (continueGame == 1) {
            // 게임을 다시 시작하는 로직 추가
        } else {
            System.out.println("게임을 종료합니다.");
        }

        scan.close();
 }

}