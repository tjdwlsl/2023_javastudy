package jdbc.com.ict.edu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06_statement_update {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sungjin";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// insert (6. 이강인, 대한민국 서울, 000-9000-0001) 추가하기
			String sql = "UPDATE CUSTOMER SET ADDRESS ='대한민국 제주도',PHONE = '0000-9000-0001' WHERE NAME ='박세리'";
		
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			if(result > 0) { //result가 성공했을때
				//성공하면 select문을 이용해서 보기
				sql = "select * from customer order by custid asc";
				//stmt = conn.createstatment():
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString("custid") + "\n");
					System.out.print(rs.getString("name") + "\n");
					System.out.print(rs.getString("address") + "\n");
					System.out.print(rs.getString("phone") + "\n");
				}
			}else {
				System.out.println("삽입 실패1");
			}
			
		} catch (Exception e) {
			
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println("제대로된 데이터를 넣어주세요" + e2);
			}
		}
	}
}
