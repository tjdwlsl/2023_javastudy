package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex02_Scanner2 {
	public static void main(String[] args) {
		// 키보드 입력정보를 받아서 처리하자
		Scanner scan = new Scanner(System.in);
		
		//키보드에서 받은 숫자가 홀수, 짝수 인지 판별
		System.out.println("숫자입력 : ");
		int su = scan.nextInt();
		String str = "";
		if(su%2==0) {
			str = "짝수";
		}else {
			str ="홀수";
		}
		System.out.println(su + "는" + str + "입니다");
		
		
		//총점 60점이상이면 합격, 60미만이면 불합격
		System.out.println("총점입력 : ");
		int total = scan.nextInt();
		str = "";
		if(total >= 60) {
			str = "합격";
		}else {
			str ="불합격";
		}
		System.out.println("당신의 점수는 " + total + "점으로 " + str + "입니다");
		
	}

}
