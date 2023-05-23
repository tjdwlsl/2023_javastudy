package day15.com.ict.edu2;


//추상 클래스
public abstract class Ex01_abstract {
	//추상 클래스와 추상 메서드
	//추상메서드 : 메서드에서 body를 가지고 있지 않은 메서드
	//body = (몸통=블록={}=실재 실행 내용을 기록하는 부분)
	//			반드시 abstract 에약어를 사용해야함
	
	//추상 클래스 : 일반클래스가 가지는 멤버필드, 멤버메서드, 생성자를 가질 수 있음
	//			 하나이산의 추상메서드를 가지고 있는 클래스를 말함
	//			 반드시 abstract 에약어를 사용해야함
	//일반 메서드
	public void play() {
		System.out.println("놀자");
	}
	public String sound() {
		return "6시간 이상 잠자기";
	}
	
	//추상메서드
	public abstract void hobby(); //body가 없음
	
}
