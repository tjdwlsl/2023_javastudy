package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		//Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하느 클래스
		//System.out => 표준 출력장치(모니터)
		//System.in => 표준 입력장치(키보드)
		//히사에서 제공하는 클래스를 사용하기 위해서 import를 해야함
		//java.lang 패키지 안에 존재하는 클래스는 아무런 제약없이 사용가능(import 필요없음)
		//java.lang 패키지 외에 존재하는 클래스는 무조건 import를 해야함
		//import 방법) 1.클래스이름 뒤에서 ctrl + space
		//			 2. ctrl + shift + o
		
		//해당클래스 뒤에 커서를 놓고 shift + F2누르면 해당클래스 API볼수있음
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 :");
		// .next() : 입력된 내용을 String으로 처리하는 메서드
		String name = scan.next();
		System.out.println("받은 내용 : " + name);
		
		System.out.println("나이 : ");
		// .next() : 입력된 내용을 String으로 처리하는 메서드
		String age = scan.next();
		System.out.println("받은 내용 : " + (age+1));
		
		System.out.println("나이 : ");
		// .nextInt() : 입력된 내용을 int로 처리하는 메서드
		int age2 = scan.nextInt();
		System.out.println("받은 내용 : " + (age2+1));
		
		System.out.println("키 : ");
		//.nextDouble() : 입력된 내용을 double로 처리하는 메서드
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : " + ke );
		
		System.out.print("당신은 남성입니까?(true/false)");
		//.nextBoolean() : 입력한 내용을 boolean욿 초라허눈 매소드(숫자 및 다른문자입력하면 오류)
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : " + gender );
		if(gender) {
			System.out.println("당신은 남성입니다.");
		}else {
			System.out.println("당신은 여성입니다.");
		}
		// nextChar()은 존재하지 않음
		
		//숙제
		//Scanner메소드에서 next메소드와 nextLine의 메소드 알아오기 
		// Next() : 결과가 String으로 나옴
		//이 스캐너에서 다음 완료 토큰을 찾아 반환합니다.
		// NextLine() : 결과가 String으로 나옴.
		//이 스캐너를 현재 줄을 지나 진행하고 입력을 반환합니다 그것은 건너 뛰었습니다.
	
	}

}
