package day03.com.ict.edu;

public class Ex05_oper {

	public static void main(String[] args) {
		//OR = || = 논리합 = 합집합
		//주어진 조건들이 하나라도 true이면 결과는 true
		//주어진 조건들중 참을 만나면 결과는 true
		//true 만난 이후 연산은 하지 않음
		
		int su1 = 10;
		int su2 = 7;
		boolean result;
		result = (su1 >= 7) || (su2 >= 5);
		System.out.println("결과 : " + result);
		
		result = (su1 <= 7) || (su2 >= 5);
		System.out.println("결과 : " + result);
		
		result = (su1 >= 7) || (su2 <= 5);
		System.out.println("결과 : " + result);
		
		result = (su1 <= 7) || (su2 <= 5);
		System.out.println("결과 : " + result);
		
		System.out.println("===========================");
		
		result = ((su1 = su1 + 2) >= su2) || su1 == (su2 = su2 + 5);
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		System.out.println("===========================");
		// NOT = ! = 논리부정
		// 주어진 논리답을 반대로 출력한다.
		// true -> false, false -> true
		boolean res = true;
		System.out.println(res);
		System.out.println(!res);
		
		
		
	}

}
