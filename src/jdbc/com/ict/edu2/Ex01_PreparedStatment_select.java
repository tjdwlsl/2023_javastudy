package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_PreparedStatment_select {
	public static void main(String[] args) {
		//오라클에 접속해서 처리하는 클래스 3개
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//오라클에 접속할 정보저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sungjin";
			String password = "1111";
			//오라클에 접속
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from 고객테이블";
			pstm = conn.prepareStatement(sql);
			//바인딩 변수(?)가있으면 처리 없으면 말고
			
			//결과 받기
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getString(1) +"\t");
				System.out.print(rs.getString(2) +"\t");
				System.out.print(rs.getString(3) +"\t");
				System.out.print(rs.getString(4) +"\t");
				System.out.print(rs.getString(5) +"\t");
				System.out.print(rs.getString(6) +"\n");
				
			}
		} catch (Exception e) {
			
		}finally {
			try {
				rs.close();
				//stms.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}

}
