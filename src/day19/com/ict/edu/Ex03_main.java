package day19.com.ict.edu;

public class Ex03_main{
	public static void main(String[] args) {
		//runnable은 run만 가지고 있음 start는 없음
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cat cat = new Ex03_Cat();
		
		//Runnable를 start 메서드를 가지고 있지 않아서 오류 발생
		//cat.start();
		
		Thread thread = new Thread(dog); //start하면 dog이 가지고 있는 run으로 이동
		thread.start();
		
//		Thread thread2 = new Thread(cat);
//		thread2.start();
		//익명(일시적 재활용 불가)
		new Thread(cat).start();
		
		//익명 : new 클래스(인터페이스)
		new Thread(new Runnable() { //내부 익명
			
			@Override
			public void run() {
				while(true) {
					System.out.println("AAAAAA" + Thread.currentThread().getName());
				}
			}
		}).start();
		
		System.out.println("main" + Thread.currentThread().getName());
	}
}
