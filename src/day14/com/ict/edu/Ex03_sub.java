package day14.com.ict.edu;

//자식클래스에서 부모클래스를 선택해서 상속관계를 맺는다. (extends Ex03_super)
//상속관계 : 자식클래스가 부모클래스의 멤버필드와 멤버메서드를 마음대로 사용할 수 있는 관계
//형식 : class 자식클래스 exdends 부모클래스
//특징 : 모든 클래스는 하나의 부모클래스를 갖는다
//	 	부모클래스가 없으면 Object가 부모클래스이다.
//		다중상속을 지원하지 않은다.(즉, 부모클래스는 하나만 존재한다.)
//		다이얼그램에서는   지식클래스      부모클래
public class Ex03_sub extends Ex03_super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";
	
	static String computer = "9세대";
	
	public Ex03_sub() {
		System.out.println("자식클래스 생성사 : " + this);
	}
	public void play() {
		String name = "홍두깨";
		//변수 우선 순위
		//지역변수 > 전역변수(this) > super(부모클래스) 
		System.out.println(name); 			//홍두깨
		System.out.println(this.name); 	 	//홍반장
		System.out.println(super.name); 	//홍길동
		
		//지역변수가 없고, 전역변수, 부모클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);
		
		//this : 전역변수, super : 부모클래스 변수
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		// private 인 경우
		System.out.println(cat);
		//상속이어도 private는 접근할 수 없다.
		//System.out.println(dog);
		//System.out.println(super.dog);
		
		
		//static인 경우
		System.out.println(playstation);
		System.out.println(this.playstation);
		System.out.println(Ex03_super.playstation);
		System.out.println(Ex03_sub.playstation);
		
		
		
	}
	
}
