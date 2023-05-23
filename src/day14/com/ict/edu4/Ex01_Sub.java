package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super {
	String naem = "홍반장";
	int age = 13;
	double weight = 78.4;
	
	//this() : 자기자신 생성자를 뜻함
	//생성자의 첫번째 줄에 있어야 다른 생성자 호출
	//public Ex01_Sub() {
	//	this("홍두깨", 14);
	//밑에 이름, 나이를 뜻함
	//}
	
	//super() : 부모클래스 생성자를 뜻한다.
	//자식클래스 생성자 첫줄에 부모클래스 생성자가 숨어있다.

	public Ex01_Sub() {
		//super(); -> 숨어있다.
		//super("서울 마포구");
		this("kkk", 14); 
		//밑으로 넘어가면서 super가있어서 둘다가능
	}
	
	public Ex01_Sub(String name, int age) {
		//super(); -> 숨어있다.
		super("서울 마포구");
		this.name = name;
		this.age = age;
		
		}


}
