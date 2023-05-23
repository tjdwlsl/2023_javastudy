package day03.com.ict.edu;

public class Ex03_oper {
	public static void main(String[] args) {
		//비교연산자 : >,< <=, >=, ==(같다) !=(같지않다)
		//비교연산자를 사용하는 자료형은 문자, 정수, 실수
		//boolean은 자료형은 포함되지 않지만
		//연산 결과는 무조건 참, 거짓이기 때문에 boolean으로 저장
		int su1 = 90;//변수 선언
		int su2 = 80;
		
		boolean res = su1 >= su2 ; //su1 >= su2값을 res에 저장
		System.out.println(res);
		
		double su3 = 89.999;
		double su4 = 80.0;
		
		res = su1 >= su3; // 정수와 실수 비교
		System.out.println(res);
		
		res = su2 == su4;
		System.out.println(res);
		
		char c1 = 'a'; //char도 숫자이기 때문에 비교가능 함
		char c2 = 'A';
		
		res = su1 >= c1;
		System.out.println(res);
		
		res = c1 >= c2;
		System.out.println(res);
		
		
	}

}
