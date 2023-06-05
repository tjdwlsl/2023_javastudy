package jdbc.com.ict.eduhw3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
//							비즈니스로직을 분리하기 위해서 사용

//DB에 접속해서 각종 SQL을 처리하는 클래스
//싱글턴 패턴 : 소프트웨어 디자인 패턴에서 사용하는 패턴 중 하나
//			 생성자가 여러차레 호출 되더라도 실제 생성되는 객체는 하나이며,
//  		 최초 생성 이후에는 호출된 생성자는 최소 생성자가 생성한 객체를 리턴
// 			 가장 대표적인 것이 spring이 기존적으로 싱글턴 패턴을 사용

public class DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;

	private static DAO dao = new DAO();

	public static DAO getInstance() {
		return dao;
	}

	// DB 접속 메서드
	public Connection getConnection() {
		try {
			// 오라클에 접속하는 것 까지만 함
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sungjin";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn; // 접속할수 있는

		} catch (Exception e) {
		}
		return null;
	}

	// DB에 접근하고 원하는 메서드를 만들어서 사용

	// 전체보기 메서드
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("custid\tname\taddress\tphone");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");

			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	// 아이디를 받아서 해당 아이디를 가지고 있는 사람의 정보 검색
	public void getSelectOne(String c_custid) {
		try {
			conn = getConnection();
			String sql = "select * from customer where custid = ?";// 고객아이디가 ?로 들어가야함
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_custid);
			rs = pstm.executeQuery();
			System.out.println("custid\tname\taddress\tphone");
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");

			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//삽입
	public void getInsert(String c_custid2, String c_name, String c_address, String c_phone) {
		try {
			conn = getConnection();
			String sql = "insert into 고객테이블(custid, name, address, phone) " + "values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_custid2);
			pstm.setString(2, c_name);
			pstm.setString(3, c_address);
			pstm.setString(4, c_phone);

			result = pstm.executeUpdate();// insert
			if (result > 0) {
				getSelectAll();
			}

		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//삭제
	public void getDelete(String c_custid3) { // c_id와 c_id3 굳이 같게할 필요 x
		try {
			conn = getConnection();
			String sql = "delete from customer where custid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_custid3);
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			} else {
				System.out.println("없는 custid 입니다. 정신차리세요");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	// 수정
	public void getUpdate(String c_custid4, String c_name4, String c_address4, String c_phone4) {
		try {
			conn = getConnection();
			String sql = "Update customer set name=?, address=?, phone=? where custid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_custid4);
			pstm.setString(2, c_name4);
			pstm.setString(3, c_address4);
			pstm.setString(4, c_phone4);

			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
