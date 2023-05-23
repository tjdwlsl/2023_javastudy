package day11.com.ict.edu;

public class Ex06_Method {

	//총점을 구하는 총점 리턴하는 메서드
	public int getSum(int kor, int eng, int math) { //인자안쓰면 sum에서 오류
		int sum = kor + eng + math;
		return sum;
	}
	//평균을 구하는 메서드
	public double getAvg(int sum) {
		double avg = (int)((sum/3.0)*10)/10.0;
		return avg;
	}
	//학점을 구하는 메서드
	public String getHak(double avg) {
		String hak ="";
		if(avg>=90) {
			hak = "A";
		}else if (avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak = "A";
		}else {
			hak = "F";
		}
		return hak;
	}
	//방법 2
	/*public String getHak(int kor, int eng, int math) {
		double avg = (int)((sum/3.0)*10)/10.0;
		String hak ="";
		if(avg>=90) {
			hak = "A";
		}else if (avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak = "A";
		}else {
			hak = "F";
		}
		return hak;
	}*/
	
	

}
