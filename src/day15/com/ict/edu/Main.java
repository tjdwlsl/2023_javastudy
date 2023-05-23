package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		
		cat.sound();
		cat.hobby();
		cat.sleep();
		cat.hobby();
		
		
	}

}
//메서드에 상속붙이면 오버라이드 못함
//클래스에 상속붙이면 상속 못함