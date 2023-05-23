package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항(조건)연산자 : 조건식 => 조건이 참 일때와 거짓일 때를 구분해서 실행(조건은 두개 뿐)
		// 형식) 자료형 변수이름 = (조건식) ? 조건식이 참일 때 실행할 문장 : 조건식이 거짓일 때 실행할 문장
		// 주의사항**) 변수, 참일 때 실행 결과, 거짓일 때 실행 결과 모두 같은 자료형 이어야 함
		// 조건식에는 boolean(true, false), 비교연산자, 논리연산자(and, or, not)
		
		String str = true ? " 강아지 " : " 고양이 "; //같은 자료형 사용
		System.out.println("결과 : " + str);
		
		String str2 = false ? " 강아지 " : " 고양이 ";
		System.out.println("결과 : " + str2);
		
		//평균
		//실수와 정수는 비교할 수 있다.(따로 저장해 놓는 것이 아니라 단순히 비교하기 때문)
		//int avg = 80;
		double avg = 85.3;
		str = (avg >= 60) ? " 합격 " : " 불합격 "; //str선언 했기때문에 사용가능
		System.out.println("결과 : " + str);
		
		
		//논리연산자 and
		char c1 = 'g';
		str = (c1 >= 'a' && c1 <= 'z') ? " 소문자" : "소문자 아님" ; //a보다 크고 z보다 작아야하는 조건이 필요하기 때문에 and 조건 사용
		System.out.println("결과 : " + str);
		
		//or
		//1 또는 3 이면 남자, 아니면 여자
		int gender = 1;
		str = (gender == 1 || gender == 3) ? " 남자 " : " 여자 ";
		System.out.println("결과 : " + str); 
		
		// 다시해보기
		// 홀수면 남자, 짝수면 여자
		// gender가 2로 나눈 나머지가 0과 같으면 짝, 1과같으면 홀
		gender = 4;
		str = (gender % 2 == 1) ? " 남자 " : " 여자 ";
		System.out.println("결과 : " + str);
		
		//3의 배수인지 아닌지 알아보기
		int su1 = 157;
		str = (su1 % 3 == 0) ? " 3의 배수 " : " 3의 배수 아님 ";
		System.out.println("결과 : " + str);
		
		
		
		
		
		
	}

}
