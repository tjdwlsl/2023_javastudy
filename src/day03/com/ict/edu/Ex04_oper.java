package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
		// 논리연산자의 연산 대상은 boolean 형(참, 거짓으로 계산)
		// 숫자 x
		// 결과는 boolean 형, 조건식에 사용
		
		// AND = && = 논리곱 = 교집합
		// 주어진 조건들이 모두 true 일때만 결과는 true
		// false가 있으면 결과는 false
		// false 이후는 연산 안함
		// ##AND조건을 이용하면 범위를 지정할 수 있다.(같은 변수 일 때만 가능)
		// ex) a>=10 && a<=20 -> a는 10부터 20까지의 범위를 지정한 것
		
		int su1 = 10;
		int su2 = 7;
		boolean result;
		result = (su1 >=7) && (su2 >=5);
		System.out.println(result);
		
		result = (su1 <=7) && (su2 >=5);
		System.out.println(result);
		
		result = (su1 >=7) && (su2 <=5);
		System.out.println(result);
		
		result = (su1 <=7) && (su2 <=5);
		System.out.println(result);
		
		System.out.println("==================================");
		
		result = ((su1 = su1 + 2) > su2 ) && (su1 == (su2 = su2 + 5));
		//조건식이 모두 참이기에 계산하고 진행
		System.out.println("결과:" + result);
		System.out.println("su1:" + su1);
		System.out.println("su2:" + su2);
		
		System.out.println("==================================");
		su1 = 10;
		su2 = 7;
		
		result = ((su1 = su1 + 2) < su2 ) && (su1 == (su2 = su2 + 5));
		//앞조건 ((su1 = su1 + 2) < su2 ) 의 거짓으로 인해 뒷조건 계산안하고 진행
		System.out.println("결과:" + result);
		System.out.println("su1:" + su1);
		System.out.println("su2:" + su2);
		
		System.out.println("==================================");
		//범위지정
		int su3 = 34;
		//su3은 20에서 30사이에 존재하는 값
		result = su3 >= 20 && su3 <= 30;
		System.out.println(result);
		
		System.out.println("==================================");
		//char c1이 소문자?
		char c1 = 'g';
		result = c1 >='a' && c1 <= 'z';
		System.out.println(result);
	}

}
