package day03.com.ict.edu;

public class Ex02_oper {

	public static void main(String[] args) {
		//증감연산자 : 해당변수의 1씩 증가나 감소를 시킨다.
		//++변수 : 현재 변수값을 먼저 1증가하고 나머지르 실행(우선순위가 제일 높음)
		//변수++ : 현재 변수값으로 실행 후 나중에 변수값을 1증가
		
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1); //증가하고 실행
		System.out.println(su2++); //실행 후 증가
		
		System.out.println(su1);
		System.out.println(su2);
		
		char c1 = 'b';
		char c2 = 'B';
		
		System.out.println(++c1);
		System.out.println(c2++);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}

}
