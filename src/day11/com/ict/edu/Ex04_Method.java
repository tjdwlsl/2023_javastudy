package day11.com.ict.edu;

public class Ex04_Method {
	//인자
	int su1 = 10;
	int su2 = 20;
	int result = 0;
	
	//메서드 이름 다음에 ([인자],....)
	//인자 : 메서드가 실행 할 때 외부에서 필요한 정보를 받기 위한 통로 이다.
	//인자의 수나 자료형에 따라 같은이름의 메서드를 여러개 만들 수 있다. (=오버로딩, 오버로드)
	//더하기
	public void add() {
		result = su1 + su2;
		
	}
	
	public void add(int k1) {
		result = k1 + su2;
		
	}
	
	public void add(int k1, int k2) {
		result = k1 + k2;
		
	}
	
	public int sub() {
		result = su1 - su2;
		return result;
	}
	
	public int sub(int k1) {
		int res = k1 - su2;
		return res;
	}
	
	public int sub(int k1, int k2) {
		return k1-k2;
	}
	
	
}
