package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//전체 횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기(소숫점 첫째자리 까지 구하기)
		int count = 0;
		int jsu = 0;
		
		
		
		
		while(true) {
			count++; //?
		System.out.print("숫자입력 : ");
		int su = scan.nextInt();
		String str ="";
		if(su%2 == 0) {
			str = "짝수";
			jsu ++; //?
		}else {
			str = "홀수";
		}
		System.out.println(su + "는 " + str + "입니다.");
		
		System.out.print("계속할까요..??(1.yes,   2.No) >>");
		int s1 = scan.nextInt();
		if(s1 ==2) break;
		
		//지금한거의 단점은 2번만 멈추고 1번말고 다른 숫자를 눌러도 진행됨
		//1이외에 숫자를 눌렀을 때 다시 입력할까요가 뜨게 하기
		//else??
		}
		double j = (jsu / (count*1.0))*100;
		//double j = (jsu / (count*1.0))*100; //여기다 형변환 해도됨
		System.out.println("전체 개수 : " + count);
		System.out.println("짝수 개수 : " + jsu);
		System.out.println("퍼센트 : " + (int)(j*10)/10.0 + "%");
		//System.out.println("퍼센트 : " + j + "%");
		
		
		
	}
}
