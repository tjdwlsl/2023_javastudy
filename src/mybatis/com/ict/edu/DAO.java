package mybatis.com.ict.edu;

import org.apache.ibatis.session.SqlSession;


//DB처리하는 메서드들을 가지고 있는 클래스

public class DAO {
	//실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	//싱글턴 패턴(동기화 처리) : 프로그램이 종료될 때 까지 한번 만들어진 객체를 재 사용함
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = DBservice.getFactory().openSession();
		}
		return ss;
	}
	//DB처리하는 메서드들
}
