package day09.com.ict.edu;

import java.util.Iterator;

public class Ex01_Array {

	public static void main(String[] args) {
		//배열 : 같은 자료형의 데이터들을 한 곳에 모아 둔 묶음
		//전재조견 -> 같은 자료형이어야한다.(프로모션 디모션 가능)
		//생성할 때 반드시 크기를 지정해야 된다.(단점, => 크기를 모르면 사용불가)
		//한번 지정된 크기근 변경되지 않는다.
		//데이터를 추출할 때, 일반적으로 for 포문
		//배열의 종류 : 1차원 배열과 다른 다연 배열(배열안 안에 배열이 존재
		//선언 데이터 크기가
		int[] su;
		
		//2.생성 : 이름 new 자료형(배열의 크기 = [방의 수]; = length = 길이
		//new 예약어 : 메모리에 데이터를 저장할 공간을 만들어라 => 인스턴스 => 객체생성
		su = new int[4];
		
		//3. 데이터 저장 : 이름[index = 방 번호 = 위치 값 = 0부터 시작]
		//같은 자료형이어야 만 저장 가능(프로모션, 디모션 가능)
		su[0] = 100;
		su[1] = 'a'; //int가 char보다 크기 때문에 마음대로 들어갈 수 있음
		su[2] = (int) 2.4; //실수라서 int 형변환 필요 (원래 = su[2] = 2.4;)
		su[3] = 124;
		//su[4] = 14 ; //방을 4개로 0~3까지 지정 4라는 방은 없으므로 실행시 오류(런타임오류)
		//(배열 크기보다 크면 실행오류)
		su[0] = 12; // 변수는 하나만 저장(마지막꺼만 저장 하므로 100데이터 삭제후 12데이터 출력)
		
		//배열을 호출 하면 주소(생성ID)가 출력
		System.out.println(su); //[I@18bf3d14 출력되는 데 이게 생성 ID
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println("==========================");
		
		//배열의 출력은 일반적으로 for문 사용
		for (int i = 0; i < su.length; i++) { //index와 length는 1차이남
			System.out.println(su[i]);
		}
		System.out.println("==========================");
		//개선된 for문 : 배열이나 컬렉션에 주로 사용
		//배열 전체에 대해서 정보 출력 및 가공 가능
		//그러나 특정 하나를 별도로 출력하거나 가공할 수 없다.(단점)
		// index값을 이용한 조건문은 사용할 수 없다.
		
		// : => 오른쪽 배열 데이터를 하나씩 순서대로 왼족에 넘긴다.
		for (int k : su) { //su배열의 저장된 것을 하나씩 순서대로 꺼내서 k한테 넘김(출력)
			//System.out.println(k);
			System.out.println(k*10);
			
		}
		System.out.println("==========================");
		
		
		
		
	}
}
