package day07.com.ict.edu;

public class Ex01_String {

	public static void main(String[] args) {
		//String 클래스는 문자열을 처리하는 클래스
		//기본자료형은 아니지만 기본자료형 처럼 사용
		
		//메소드(인자) : 실행결과의 자료형
		// 인자 = 메소드가 실행하기 위한 재료를 받는 것(source)
		
		//String에서 자주사용되는 메서드들
		
		//1.charAt(int index) : char
		//위치정보 = index를 받아서 해당 위치에 존재하는 글자를 char형으로 반환
		
		String str = "한국 Ict 인재개발원 1강의장";
		//띄어쓰기도 글자수에 포함
		char k1 =str.charAt(7);
		System.out.println("결과 : " + k1);
		System.out.println("========================");
		
		
		str = "Hello world";
		//모두 대문자로 만들기 ,(대문자는 그대로,소문자는 -32 대문잘 변경)
		//str.length()	=> str의 문자열의 길이를 구해줌
		for(int i = 0; i<str.length(); i++) {
			char k2= str.charAt(i);
			if(k2  >= 'a' && k2<= 'z') {
			System.out.print((char)(k2-32));
				
			}else {
				System.out.print(k2);
				}
		}
		System.out.println();
		System.out.println("========================");
		
		//2. concat(String str) : String
		//입력된 문자열을 혀내 문자열과 합친다.("문자열" + "문자열")
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 + s2);
		System.out.println("========================");
		
		//3.contains(CharSequence s) : boolean
		//CharSequence = String 비슷하면서 약간 틀림(나중에 배우기 전까지)
		// = char 값을 읽을 수 있는 시퀀스, 인터페이스
		//현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true,
		//없으면 false
		//결론은 boolean형으로 나옴
				
		String s4 = "Korea @ 대한민국";
		System.out.println(s4.contains("@")); //@가 있냐?
		System.out.println(s4.contains("rea")); //rea가 있냐?, 일부만 써도 판단해줌
		System.out.println(s4.contains("REA")); 
		System.out.println("========================");
		
		
		//4. equals(Object anObject) : boolean
		//	입력된 문자열과 현재 문자열이 같으면 true, 다르면 false(대소문자를 구별)
		//5. equalsIgnoreCase(String anotherString) : boolean
		//	입력된 문자열과 현재 문자열이 같으면 true, 다르면 false(대소문자를 구별하지 x)
		
		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println("========================");
		
		//6. format(String format, Object... args) : static String
		//형식에 지정하고 형식에 맞춰 생성한다.
		String s7 = "ICT 인재 개발원";
		
		//문자열 => %s
		String s8 = String.format("%s", s7);
		System.out.println(s8);
		
		//%30s : 30자리 차지하는 문자열 (남은 자리는 비워둔다).오른쪽정렬
		s8 = String.format("%30s", s7);
		System.out.println(s8);
		
		//%30s : 30자리 차지하는 문자열 (남은 자리는 비워둔다).왼쪽정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);
	
		//자리가 모자르면 알아서 다 나옴
		s8 = String.format("%4s", s7);
		System.out.println(s8);
	
		//자기가 모자르면 짤린다.
		s8 = String.format("%.4s", s7);
		System.out.println(s8);
		System.out.println("========================");
		
		//%d 정수 형식 시점
		int s9 = 2314;
		s8 = String.format("%d**", s9); //s8이 String이라 String으로 바뀜
		System.out.println(s8); 
		
		//오른쪽 정렬
		s8 = String.format("%5d", s9); //자동으로 오른쪽 정렬함
		System.out.println(s8); 
		
		//왼쪽 정렬
		s8 = String.format("%-5d", s9); 
		System.out.println(s8); 
		
		//오른쪽 정렬 (빈공간 0으로 채운다.)
		s8 = String.format("%05d", s9);
		System.out.println(s8);
		
		//오른쪽 정렬 (,는 3자리마다 찍힘)
		s8 = String.format("%,5d", s9);
		System.out.println(s8);
		System.out.println("========================");
		
		
		//%f => 실수형식
		double s10 = 1245.44547954;
		System.out.println(String.format("%f" , s10));
		System.out.println(String.format("%20f" , s10));
		System.out.println(String.format("%.3f" , s10)); //소수점 3째자리로 반올림
		System.out.println(String.format("%.1f" , s10)); //소수점 첫자리로 반올림
		System.out.println(String.format("%,.1f" , s10));		
		System.out.println("========================");
		
		
	
		
		/*
		 System.out.print("계속할까요?(1.yes,  2.no) >> "); 
			했을 떄 
			1 이면  반복문 실행 ,   2이면  반복문 탈출 ,
			이외의 숫자가 나오면  잘못 입력했습니다.
			계속할까요?(1.yes,  2.no) >>
			가 다시 물어보는 로직 구현 하기
			*/
		
		
	}
	
}
