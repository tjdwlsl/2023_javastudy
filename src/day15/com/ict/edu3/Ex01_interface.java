package day15.com.ict.edu3;

//인터페이스 : 서비스를 제공하는 목록(Ex 메뉴판)
//			상수와 추상메서드만 가지고 있다.
//			일반적인 변수와 일반적인 메서드는 존재하지 않는다.
//			객체 생성 안됨 (생성자도 없다.)
//			다중 상속은 가능(인터페이스는 여러개의 인터페이스를 부모로 만들 수 있다.)
//			클래스를 부모로 만들 수 없다.(인터페이스 부모는 인터페이스)
//			'인터페이스가 같다' 라는 말은 '대체가 가능하다', '호환 가능'라는 뜻

//인터페이스 상속 : 인터페이스 extends 인터페이스
//클래스 extends 클래스
//클래스 implemets 인터페이스

public interface Ex01_interface {
	//모두 다 static final임
	//인터페이스 안에있는 멤버필드는 모두 static final
	final int Su1 = 10;
	static final int Su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	
	//추상메서드
	public abstract void sound();
	//abstarct 생략가능
	public void play(); 
	//추상클래스에서는 abstract안붙으면 오류
	//이건 인터페이스 안에있으므로 static final임
	
	//일반메서드 사용불가
	//public void hobby()	{};
	public static void like() {
		System.out.println("놀기좋아");
	}
	
}
