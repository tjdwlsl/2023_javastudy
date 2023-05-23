package day16.com.ict.edu;


public class Ex05_main {
	public static void main(String[] args) {
		//내부클래스를 별도로 객체 생성할 수 없음(static은 제외)
		//Inner01 test = new Inner01(); //오류남
		
		//외부클래스를 통해서 내부클래스 객체를 생성(Member 내부클래스)
		
		Ex05_MemberinnerClass test = new Ex05_MemberinnerClass();
		
		Ex05_MemberinnerClass.Inner01 exam = test.new Inner01();
		
		exam.prn();
		
		
		
		
	}
}
