package mybatis.com.ict.edu;

import java.util.Scanner;

//마이바티스 셋팅하기
//1. config.xml 만들기 -db접속
//2. mapper.xml 만들기 - 실제 sql작성하는 파일(실제 db에 갔다와서 결과를 내보내느 파일)
//3. VO.java - db에 들어갈 파라미터 및 결과를 저장을 담당하는 파일 (테이블의 컬럼명과 같이 만들어야함)
//4. DAO.java - mapper와 연결되서 자바에서 db실행 시키는 파일(DB처리한 클래스들을 모아놓은 파일)
//5. DBService - config.xml 파일을 읽고 Mybatis을 실행할 수 있도록 하는 파일
//1. 환경설정파일(config.xml)만들기
public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.print(" >>>>>>>>>>>> ");
		
		int menu = scan.nextInt();
		
		switch (menu) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			default: System.out.println("제대로 입력하세요"); break;
			
		}
		
		
	}
}
