package jdbc.com.ict.eduhw3;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1.테이블 전체 데이터 보기");
		System.out.println("2.테이블 특정 데이터 보기");
		System.out.println("3.테이블 데이터 삽입");
		System.out.println("4.테이블 데이터 삭제");
		System.out.println("5.테이블 데이터 수정");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			DAO.getInstance().getSelectAll();
			break;
		case 2:
			System.out.println("c_cusid : ");
			String c_custid = scan.next();
			DAO.getInstance().getSelectOne(c_custid);
			break;

		case 3:
			System.out.println("삽입정보를 입력하세요 : ");
			System.out.println("custid : ");
			String c_custid2 = scan.next();
			System.out.println("name : ");
			String c_name = scan.next();
			System.out.println("address : ");
			String c_address = scan.next();
			System.out.println("phone : ");
			String c_phone = scan.next();


			DAO.getInstance().getInsert(c_custid2, c_name, c_address, c_phone);
			break;

		case 4:
			System.out.print("삭제할 custid를 입력하세요 : ");
			String c_custid3 = scan.next();
			DAO.getInstance().getDelete(c_custid3);
			break;

		case 5:
			System.out.println("수정할 정보를 입력하세요 : ");
			System.out.print("custid : ");
			String c_custid4 = scan.next();
			System.out.print("name : ");
			String c_name4 = scan.next();
			System.out.print("address : ");
			String c_address4 = scan.next();
			System.out.print("phone : ");
			String c_phone4 = scan.next();


			DAO.getInstance().getUpdate(c_custid4, c_name4, c_address4, c_phone4);
			break;
		default: System.out.println("잘못 입력하셨습니다. 정신차리세요"); break;

		}

	}
}
