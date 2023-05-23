package day14.com.ict.edu;

import java.util.Random;
//is -a관계
public class Ex05_extends extends Random {
	int su = nextInt();
	
	public void play() {
		System.out.println("Ex05 : " + su);
	}
	
	// static 메서드는 static 변수만 사용 가능
	public static void main(String[] args) {
		//System.out.println(su); //su는 static가 아니여서 오류뜸
		//play();
		
		//자기자신이라도 객체를 만들자
		Ex05_extends test = new Ex05_extends();
		test.play();
			
	}
	

}
