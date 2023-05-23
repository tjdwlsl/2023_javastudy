package day15.com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {
		System.out.println(Ex01_interface.Su1);
		System.out.println(Ex01_interface.Su2);
		System.out.println(Ex01_interface.su3);
		System.out.println(Ex01_interface.su4);
		
		Ex01_interface.like();
		System.out.println();
		
		Ex01_extends t1 = new Ex01_extends();
		t1.sound();
		t1.play();
		
		
		//익명 내부클래스
		Ex01_extends2 t2 = new Ex01_extends2() {
			
			@Override
			public void sound() {
				System.out.println("뮤직듣기");
				
			}
			
			@Override
			public void play() {
				System.out.println("오락실게임하기");
				
			}
		};
		
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
		System.out.println();
		
		
		
		
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
		
		
	}

}
