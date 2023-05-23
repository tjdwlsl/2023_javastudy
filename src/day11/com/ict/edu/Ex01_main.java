package day11.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		//static은 객체 생성과 상관없이 호출 가능
		//static 호출 : 클래스이름.변수 or 클래스이름.메서드
		System.out.println(Ex01_Method.ki);
		
		Ex01_Method.getAVG();
		System.out.println(Ex01_Method.ki);
		
		
		Ex01_Method t1 = new Ex01_Method();
		
		//instance호출 방법 : 참조변수.변수 or 참조변수.메서드
		String name = t1.name ; //변수를 호출시 해당하는 변수값이 옴
							 //온 변수를 String name에다 저장
		
		//void는 호출한 곳으로 아무것도 가져오지 않는다.
		//저장할게 없다. 변수 선언 x
		t1.getTotal();
		
		//실행해보면 total값이 변경 된 것을 확인
		int k1 = t1.total; //k1의 색은 지역변수
		
		System.out.println(name);
		System.out.println(k1);
		System.out.println("========================");
		
		
		double k2 = Ex01_Method.getAVG2();
		System.out.println(k2);
		
	}

}
