package common.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBClass {
	public static Connection conn;
	
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
}
