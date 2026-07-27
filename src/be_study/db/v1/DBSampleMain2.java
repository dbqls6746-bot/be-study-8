package be_study.db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain2 {

	public static void main(String[] args) {
		
		List<Dept> deptList1 = findDeptList();
		
		if(deptList1 == null) {
			System.out.println("조회 데이터가 없구나...");
		} else { //데이터 있음
			for(Dept d : deptList1) {
				System.out.println(d.toString());
			}
		}
		
		List<Dept> deptList2 = findDeptList2();
		
		if( deptList2.size() == 0 ) { //초기화는 O , 추가된 데이터가 X
									// --> 조회된 데이터가 없다
			System.out.println("데이터가 없다...");
		} else {
			
			for(Dept d : deptList2) {
				System.out.println(d.toString());
			}
		}
		
		if( deptList2 != null && deptList2.size() > 0 ) {
			//데이터가 있다
		}
	}

	
	
	public static List<Dept> findDeptList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		
		//String db_url = "jdbc:oracle:thin:@150.25.33.191:12364:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		// DB 연결
		try {
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from dept ";
		//String sqlQuery = " select * from dept where 1=2 ";
		
		List<Dept> deptList = null;
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
		
		psmt = conn.prepareStatement(sqlQuery);
		rs = psmt.executeQuery();
		
		while(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
			// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
			
			//데이터가 있다.
				
			//한줄 조회	한 행 데이터
			//	한 행 데이터 -> Dept 객체 저장
			//	List<Dept>	.add(Dept)
			
			// column 이름(별칭) 기준 조회
			Dept dept = new Dept();
				
			dept.setDeptno( rs.getInt("deptno") );
			dept.setDname( rs.getString("dname") );
			dept.setLoc( rs.getString("loc") );
			
			if(deptList == null) {
				deptList = new ArrayList<>();
			}
			deptList.add(dept);
		}
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		
		//DB 연결 정료
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
		
		return deptList;
		
	}
	
	public static List<Dept> findDeptList2() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		
		//String db_url = "jdbc:oracle:thin:@150.25.33.191:12364:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		// DB 연결
		try {
		conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from dept ";
		//String sqlQuery = " select * from dept where 1=2 ";
		
		List<Dept> deptList = new ArrayList<>();
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
		
		psmt = conn.prepareStatement(sqlQuery);
		rs = psmt.executeQuery();
		
		while(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
			// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
			
			//데이터가 있다.
				
			//한줄 조회	한 행 데이터
			//	한 행 데이터 -> Dept 객체 저장
			//	List<Dept>	.add(Dept)
			
			// column 이름(별칭) 기준 조회
			Dept dept = new Dept();
				
			dept.setDeptno( rs.getInt("deptno") );
			dept.setDname( rs.getString("dname") );
			dept.setLoc( rs.getString("loc") );
			
			deptList.add(dept);
		}
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		
		//DB 연결 정료
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
		
		return deptList;
		
	}
}
