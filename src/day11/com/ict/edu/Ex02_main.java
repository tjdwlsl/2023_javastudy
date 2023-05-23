package day11.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Method t1 = new Ex02_Method(); //객체생성
		
		System.out.println("===메서드 실행하기 전 ===");
		System.out.println("총점 : " + t1.sum);
		System.out.println("평균 : " + t1.avg);
		System.out.println("학점 : " + t1.hak);
		
		System.out.println("===메서드 실행 후 ===");
		t1.getSum(); //메서드 호출
		t1.getAVG(); //메서드 호출 //Ex02_Method로 일하러감(=쓰레드)
		t1.getHak(); //메서드 호출
		System.out.println("총점 : " + t1.sum);
		System.out.println("평균 : " + t1.avg);
		System.out.println("학점 : " + t1.hak);
		System.out.println("========================");
	
	
	
	}
}
