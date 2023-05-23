package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		//카페모카가 6500원이다. (입력내용)
		//친구와 둘이서	15000원을 내고 주문
		//잔돈은 얼마?
		//단 부가세 10% 포합
		
		//입력정보
		String coff = "카페모카"; //종류
		int price = 6500; //커피 가격
		int su = 2; //잔수
		int in = 15000; //15000원 냄
		
		//부가세 구하기 위해서 총 금액을 구하기
		int total = price * su; // 가격*잔수
		//둘중 하나 사용하면됨
		int vat = total / 10;
		int vat2 = (int) (total * 0.1); 
		//더 큰 실수가 정수에 못들어가서 형변환
		//왼족 변수 정수로 저장되어야하기 때문에 정수로 형변환
		int out = in - (total + vat);
		System.out.println("잔돈은 : " + out);
		
		//위 정보를 한번에 처리
		int out2 = in - (int)(total * 1.1);
		System.out.println("잔돈은 : " + out2);
	}

}
