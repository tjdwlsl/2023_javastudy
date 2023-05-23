package day11.com.ict.edu;

public class Ex01_Method {
	//클래스 : 멤버필드,멤버메서드, 생성자
	//멤버필드 : 인스턴스변수, 인스턴스상수, static변수, static상수
	//객체생성안되면 인스턴스 변수 생성안됨
	String name = "홍길동"; //인스턴스 변수(아무말없으면 인스턴스 변수임) //name의 색은 전역변수
	int kor = 80; 		  //인스턴스 변수
	int eng = 95; 		  //인스턴스 변수
	int math = 85; 		  //인스턴스 변수
	int total = 0; 		  //인스턴스 변수
	double avg = 0.0; 	  //인스턴스 변수
	
	static double ki = 178.5; //static변수(값 변할수 있음)
	
	//멤버메서드() : 동작, 기능, 실행하는 것
	//  **메서드 : 호출해야만 실행 할 수 있으며, 실행 후 반드시 호출한 곳으로 되돌아감
	//형식) [접근제한자][메서드종류] 반환 메서드이름([인지],...){ 실행할 문장 }
	//	**반환형 : 반드시 호출한 곳으로 되돌아 가는데 실행 결과를 가지고 갈 때
	//			 실행결과의 자료형을 반환형이라 부른다(= Return type)
	//			 BUT! 실행결과를 가지고 가지 않으면 void라는 예약어를 사용한다.

	//instance 메서드
	public void getTotal() {
		total = kor + eng + math;
		
		//return ;  //void에서는 생략가능
					//void는 자료형이 없어서..?
					//반환값이 없어서 그냥 리턴?
	}
	//instance 메서드
	public int getTotal2()	{
		int sum = kor + eng + math;
		
		//반환형이 void가 아니면 맨 마지막 줄에 return 데이터나
		//데이터를 가지고 있는 변수
		//return 0; //이 메소드를 호출한 곳으로 되돌아감
		return sum;
	}
	//instance 메서드
	public int getTotal3()	{
		//static 변수 사용가능
		//return kor + eng + math; //실행한 결과값이 날라감
		return kor + eng + math + (int)(ki);
	}
	//static
	public static void getAVG(){
		//static일 경우 instance변수 사용 불가
		//avg = total/3.0; //미리 만들어지지않아서 호출불가, static변수가 없음
		
		//ki가 static이므로 사용가능
		ki = ki + 5; 
	}
	public static double getAVG2() {
		
		return ki = ki + 0.7;
	}
}
