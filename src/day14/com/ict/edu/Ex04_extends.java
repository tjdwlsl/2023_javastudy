package day14.com.ict.edu;

import java.util.Random;
//has -a 관계
public class Ex04_extends {
	public static void main(String[] args) {
		//Random 클래스 사용하기
		Random ran = new Random();
		int su = ran.nextInt(10) + 1; //(원래)0~9 //(더하기1) 1~10까지
		System.out.println(su);
		
	}

}
