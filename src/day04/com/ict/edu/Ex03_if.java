package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		//단순 if문의 제일 중요한 거
		// 단순 if문 : 조건식이 참일 때만 실행, 거짓이면 if문 무시
		// 형식) if(조건식) {
		//			조건식이 참일 때 실행할 문장;
		//			조건식이 참일 때 실행할 문장;
		//		}
		// 단, 실행문장이 한줄이면 {} 블록을 생략할 수 있다
		// 실행문장이 한줄 이상이면 {} 블록을 무조권 붙어야함
		// 형식) if(조건식) 조건식이 참일 때 실행할 문장;
		// 형식) if(조건식)
		//			조건식이 참일 때 실행할 문장;
		
		
		//결과가 정확히 두개로 나누어 질때 쓰는 방법
		//int k1이 60이상이면 합격
		int k1 = 70;
		//합격 불합격은 문자이기에 String에 저장
		String res = "초기값";
		if (k1 >= 60) {
			res = "합격";
		}
		
		if(k1 < 60) {
			res = "불합격";
		}
		System.out.println("결과 : " + res);
		
		//int k2가 홀수인지 짝수인지 판별
		int k2 = 13;
		//초기값에 어떤 수를 넣을지는 내의지
		res = "짝수";
		//if문을 안거치면 짝수를 유지
		//어떤수를 2로 나눴을 때 나머지 가 1 -> 홀수, 나누어 떨어지면 -> 짝수
		if (k2 % 2 == 1) {
			res = "홀수";
			
		}
		System.out.println("결과 : " + res);
		
		
		//char k3가 '대문자'인지 아닌지 판별
		char k3 = 'S';
		res = "대문자 아님";
		if (k3 >= 'A' && k3 <= 'Z') { //대문자 조건을 줘야함
			res = "대문자";
		}
		System.out.println("결과 : " + res);
		
		//@@근무시간이 8시간까지는 시간당 9620원 이고
		//8시간을 초과한 시간 만큼은 1.5배 지급
		//현재 근무한 시간이 10시간
		//얼마받음?
		int time = 10; 
		int limit = 8;
		int dan = 9620;
		int pay = time * dan; //초과x 일반적인 계산
		//초과하지 않으면 그냥 계산값을 줘라
		//초과했을 경우에 if문으로 처리
		
		if (time > limit) {
			pay = (limit * dan) +(int)((time - limit)*dan*1.5);
			
		}
		System.out.println("결과 : " + pay);
		
		
	
	}

}
