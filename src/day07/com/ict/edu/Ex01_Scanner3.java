package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 계속할까요(1.yes 2.no)일 때 Ex01_Scanner2는 숫자로 받았는데
		// 문자가 들어오면 오류가 발생 된다.
		// 문자로 받아서 처리하기

		// 전체 횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기(소숫점 첫째자리 까지 구하기)
		int count = 0;
		int jsu = 0;

		esc: while (true) {
			count++; // ?
			System.out.print("숫자입력 : ");
			int su = scan.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
				jsu++; // ?
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + "입니다.");

			while (true) {
				System.out.print("계속할까요..??(Y(y)/N(n) >>");
				String s1 = scan.next();
				if (s1.equalsIgnoreCase("y")) {
					continue esc;
				} else if (s1.equalsIgnoreCase("n")) {
					break esc; // 바깥쪽 while문을 빠져나가서 아예 끝남
				} else {
					System.out.println("다시 입력하세요."); // 숫자를 받는데 문자넣으면 오류
					continue; // 안쪽 while문으로 이동해서 다시 진행
				}

			}
		}
		double j = (jsu / (count * 1.0)) * 100;
		// double j = (jsu / (count*1.0))*100; //여기다 형변환 해도됨
		System.out.println("전체 개수 : " + count);
		System.out.println("짝수 개수 : " + jsu);
		System.out.println("퍼센트 : " + (int) (j * 10) / 10.0 + "%");
		// System.out.println("퍼센트 : " + j + "%");

	}

}
