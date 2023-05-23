package day11.com.ict.edu;

public class Ex07_Method {
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//총점을 구하는 메서드
	public void getSum(int kor, int eng, int math) { //void니까 이안에서 해결하고 끝, 저장하려고 변수 만들어둠
		sum = kor + eng + math;
	}
	//평균을 구하는 메서드
	public void getAvg() {//굳이 넣을 필요가 없어서 안넣음
		avg = (int)(sum/3.0*10)/10.0;
	}
	//방법2
	public void getAvg(int k1) {//
		avg = (int)(k1/3.0*10)/10.0;
	}
	//학점을 구하는 메서드
	public void getHak() {
		if(avg >=90) {
			hak ="A";
		}else if (avg >= 80) {
			hak ="B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
	}
	//방법2
	public void getHak(double k1) {
		if(k1 >=90) {
			hak ="A";
		}else if (k1 >= 80) {
			hak ="B";
		}else if (k1 >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
	}
	

}
