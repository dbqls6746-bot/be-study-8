package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionManager {
	// DB 연결
	// 연결 종료
	
	/*
	  
	 DBConnectionManager.connectDB();
	 
	 public static Connection connectDB()
	 
	 
	 public static Connection connectDB()
	 DBConnectionManager db = new DBConnectionManager();
	 db.connectDB();
	 */
	public static Connection connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void disconnectDB(Connection conn, PreparedStatement psmt, ResultSet rs) {
		
		//DB 연결 종료
		try {
			if(rs != null)
				rs.close(); //null 객체 메소드 호출 -> NullPointerException
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
