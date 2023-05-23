package day11.com.ict.edu;

public class Ex02_Method {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 80;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//모두 void로 사용
	//총점 구하는 메소드
	public void getSum() {//getSum(지역변수)
		//안에다 변수생성해도 대괄호 끝을 지나면 없어짐
		sum = kor + eng + math;
		//System.out.println("총점 : " + sum);
		
	}
	
	
	//평균 구하는 메소드
	public void getAVG() {
		avg = sum /3;
		//System.out.println("평균 : " + avg);
		
	}
	
	//학점 구하는 메소드
	public void getHak() {
		 hak = "";
		if(avg>=90) {
			hak = "A";
		}else if (avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak = "A";
		}else {
			hak = "F";
		}
		//System.out.println("학점 : " + hak);
	}
	

}
