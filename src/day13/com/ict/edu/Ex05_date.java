package day13.com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05_date {
	public static void main(String[] args) {
		//날짜 관련 클래스
		//1. Date클래스 2.Calendar클래스 3.LocalDate클래스
		
		//1. Date클래스 : 기본생성자로 생성하면 컴퓨터의 시간으로 설정된다.
		//	 Deprecated. = 언제든지 지원을 안할 수 있으니 다른 것 사용하세요.
		Date date = new Date();
		System.out.println(date);
		
		//2. 기본형태로 바꾸는 변환하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//MM과 mm이 글자가 겹처서 앞에를 대문자 뒤에를 소문자로 넣는다.
		System.out.println(sdf.format(date));
		
		System.out.print(date.getYear() + 1900 + "년"); 
		System.out.print(date.getMonth()+ 1 +"월");
		System.out.print(date.getDate()+ "일");
		System.out.print(date.getHours()+ "시");
		System.out.print(date.getMinutes()+ "분");
		System.out.println(date.getSeconds()+ "초");
		
		//0~6, 0=>일요일, 6=>토요일
		int k = date.getDay();
		switch (k) {
		case 0 : System.out.println("일요일"); break;
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		
		
		}
	}
		
}




 