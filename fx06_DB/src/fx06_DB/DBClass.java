package fx06_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBClass {
	public Connection conn;
	
	public DBClass() {
		try {
			// 자바에서 오라클에 연결하기 위한 기타 기능들을 쓸 수 있게 도와줌
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클과 연결된 객체를 가져옴
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "wujin", "wujin");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insert(MemberDTO dto) {
		String sql = "insert into fx_member(id, pwd, name) values(?, ?, ?)";
		int result = 0;
		try {
			// 연결된 객체(conn)를 이용해서 쿼리문을 전송할 수 있는 전송객체를 얻어옴
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			// 전송객체를 이용해서 명령어 실행(DB에 명령어 전송)
			// 결과값 : 성공->1, 실패->0
			// 보편적으로 select를 제외한 나머지 명령어는 Update를 사용
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
