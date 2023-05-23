package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		//다중 if문
		//형식) if(조건식1){
		//		조건식1이 참일때 실행할 문장;
		//		조건식1이 참일때 실행할 문장;
		//	}else if(조건식2){
		//		조건식1은 거짓이면서 조건식2가 참일때 실행할 문장;
		//		조건식1이 거짓이면서 조건식2가 참일때 실행할 문장;
		//	}else if(조건식3){
		//		조건식1,2가 거짓이면서 조건식3이 참일때 실행할 문장;
		//		조건식1,2가 거짓이면서 조건식3이 참일때 실행할 문장;
		//	}else{
		//		조건식1,2,3, 모두 거짓인 경우
		//	}
		
		//int k1이 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int k1 = 100;
		String str = "";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		} else {
			str = "F학점";
		}
		System.out.println("결과 : " + str);
					
		//char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '1';
		str ="";
		if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			str = "숫자";
		} else {
			str = "기타문자";
		}
		System.out.println("결과 : " + str);
		
		//char k3 A, a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국
		char k3 = 'k';
		if (k3 == 'A' || k3 == 'a') {
			str = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			str = "캐나다";
		} else {
			str = "한국";
		}
		System.out.println("결과 : " + str);
		
		
		//menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		//4이면 과일주스 3500. 친구와 2잔을 10000원을 내고 먹었다.
		//잔돈은 얼마?(부가세 10% 포함), 친구와 같은 음료만 선택 가능
		
		
		//강사님
		int menu = 3;
		int in = 10000;
		int su = 2;
		int dan = 0; //(메뉴가 선택되는 순간 저장할 변수가 필요)(음료)
		int total = 0; //(총금액)
		String drink = "";
		int vat = 0;
		int out = 0; //
		
		if(menu == 1) { //1이 선택되는 순간 
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			drink = "과일주스";
			dan = 3500;
		}
		total = dan * su;
		vat = (int)(total * 0.1);
		out = in - (total+vat);
		
		System.out.println("메뉴 : " + drink);
		System.out.println("잔돈 : " + out);
		
	
		
		
		
		/* 나
		int menu = 1;
		int price1 = 3500;
		int price2 = 4000;
		int price3 = 3000;
		int price4 = 3500;
		int pay = 10000; //초기화 
		
		

		if (menu == 1)
			pay = pay - (int)((price1 * 2)*1.1);
		else if (menu == 2) {
			pay = pay -(int)((price2 * 2)*1.1);
		} else if (menu == 3) {
			pay = pay -(int)((price3 * 2)*1.1);
		} else if (menu == 4) {
			pay = pay -(int)((price4 * 2)*1.1);
		}
		System.out.println("잔돈은 " + pay +"원");
		*/
		
	}

}
