package day05.com.ict.edu;

import java.util.Iterator;

public class Ex02_for {
	public static void main(String[] args) {
		//for : 정해진 규칙에 따라서 실행문을 반복처리 함
		//형식) for(초기식; 조건식; 증감식;){
		//		조건식이 참일때 실행할 문장;
		//		조건식이 참일때 실행할 문장;
		//		조건식이 참일때 실행할 문장;
		//		}
		//## for문을 만나면 무조건 초기식으로 이동
		//초기식은 조건식으로 이동
		//조건식은 참이면 for문 실행, 거짓이면 for문 실행x
		//for문의 끝을 만나면 무조권 증감식으로 감
		
		//{}애서 만들어진 변수는 블록 밖을 벗어나면 사라짐(사용불가)
		
		//안녕하세요를 10번 출력하기
		//for (int i = 1; i < 11; i++) {
			//System.out.println(i + " ");
			
		//0~10까지 출력
		//for (int i2 = 0; i < 11; i++) {
			//System.out.println(i2 );
		
		//시험나옴==============================================
		//0~10짝수만 출력(다른예제 찾기)
		//for (int i = 0; i< 11; i= i+2) {
		//System.out.println(i+"");
			
		//홀수
		//for (int i = 1; i< 10; i= i+2) {
		//System.out.println(i+"");
		
		//짝수?2배수?
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"");//2로나눠서 나머지가 0
			}
			//0/2 = 0,   2/0 = 오류 (0이 밑으로가면 오류)
		}
		
		//홀수
		//for (int i = 0; i < 11; i++) {
			//if(i % 2 == 1) {
				//System.out.println(i+"");
			//}
			
			
		//}
		
		//구구단 7단 출력
		for (int i = 1; i<10; i++) {
			System.out.println("7*" + i + "="+(7*i));
		}
		
		//시험
		//1~10까지의 누적합(합계 구하기)//앞에를 기억해서 현재 구하기
		//누적합 공식 sum = sum + i
		//이전저장변수 = 0
		//누적합 : 이전저장변수 = 이전저장변수 + 현재값
		
		
		//이전저장변수 =1
		//누적곱 : 이전저장변수 = 이전저장변수 * 현재값;
		//???
		/*int sum = 0;
		for (int i = 1; i<11; i++) {
			sum = sum + i ;
		}

		System.out.println("누적합 : " + sum);
		*/
		
		//0부터 10까지 짝수의 누적합
		/*int even = 0;
		for (int i = 0; i<11; i++) {
			if(1%2 == 0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 누적합 : " + even);
	*/
		
		//7!(누적 곱) (7*6*5*4*3*2*1) ?
		int mul = 1;
		for (int i = 7; i >0; i--) {
			mul = mul * i;
			
		} 	
		System.out.println("7 ! = " + null);
		
		//숙제  if, else
		//1 + (-2) + 3 +(-4) + 5 +(-6) +7 + (-8) + 9 (-10)
		//for문을 이용한 누적합
		int i = 1;
		int res = 1;
		int sum = res;
		for (i = 1; i<11; i++) {
			if(i%2==0) {
				res=i*(-1);
			} else {
				res=i;
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		
		
	
		
	}

}
