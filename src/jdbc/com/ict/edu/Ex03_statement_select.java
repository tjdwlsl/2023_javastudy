package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//customer에서 박씨 성을 가진 사람을 검색하자
public class Ex03_statement_select {
public static void main(String[] args) {
	//1. java를 오라클에 접속할 수 있도로 도와주는 클래스
			Connection conn = null;
			//2.sql구문을 작성을 도와주는 클래스
			Statement stmt = null;
			//3-1. select문의 결과를 받는 클래스
			ResultSet rs = null;
			// 3-2.select문을 제외한 결과를 받는 변수
			// delete, update, insert의 결과는 숫자
			int result = 0;
			try {
				//4. jdbc 드라이버 로딩 : 오라클, mysql등 각 내용이다름
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//5. 접속하기위한 정보저장(오라클, mysql등 각 내용이다름)
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "c##sungjin";
				String password = "1111";
				
				//6. 접속하기
				conn = DriverManager.getConnection(url, user, password);
				//7.sql 작성하기
				String sql = "SELECT * FROM CUSTOMER WHERE NAME LIKE '박%'";
				//8.sql을 보낼 수 있는 구문을 만들기
				stmt = conn.createStatement();
				//9. SQL을 담아서 보내고 결과 받기
				//9-1. select
				rs = stmt.executeQuery(sql);
				//9-2. select 제외(insert, update, delete)
				//result = stmt.executeUpdate(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t" );
					System.out.print(rs.getString(2) + "\t" );
					System.out.print(rs.getString(3) + "\t" );
					System.out.print(rs.getString(4) + "\n" );
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch(Exception e2) {
					
				}
			}
		}
	}
