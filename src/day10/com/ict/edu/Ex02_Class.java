package day10.com.ict.edu;

public class Ex02_Class {
	//클래스는 멤버필드, 멤버메서드, 생성자
	//멤버필드 : 상태값, 속성, 데이터 ...
	//	멤버필드의 종류
	//	변수 : 언제든지 변경할 수 있는 데이터를 저장하는 공간
	//	상수 : 한번 저장되면 변경할 수 없는 데이터를 저장하는 공간, final 예약어 사용
	//	instance : 클래스가 객체로 생성될 때 같이 생성되는 필드
	//	static : 객체 생성과 상관없이 먼저 생성되는 필드, static 예약어 사용
	
	
	String name = "홍길동";        //인스턴스 변수(일반적인 변수)
	final String GENDER = "남성"; //인스턴스 상수
	//객체생성을 무조권해줘야함 위에아들은
	
	static int sum = 300;		//static 변수(instance와 final이 안붙어있음)
	static final int AVG = 80;	//static 상수
}
