package be_study.db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSampleMain {

	public static void main(String[] args) {
	findDept();
	
	findDeptWhere();
	
	findDeptByDeptnoPrint(20);
	
	findDeptByDeptnoPrint(40);
	
	//40번 부서의 이름 확인! ???? 정보가 어디에???
	Dept dept1 = findDeptByDeptno(30);
	System.out.println(dept1.getDname());
	System.out.println(dept1.getDeptno());
	
	System.out.println(dept1.toString());
	
	Dept dept2 = findDeptByDeptno(90);
	if(dept2 == null) {
	System.out.println("90번에 해당하는 데이터가 없구나~");
	} else {
	System.out.println(dept2.toString());
	}
	
	Dept dept3 = findDeptByDname("ACCOUNTING");
	System.out.println(dept3.toString());
	
	Dept dept4 = findDeptByDname("REST");
	if(dept4 == null) {
		System.out.println("해당 부서는 없습니다.");
		} else {
		System.out.println(dept4.toString());
		}
	}
	
	// query select * from dept
	public static void findDept() {
	
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
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
		
		psmt = conn.prepareStatement(sqlQuery);
		rs = psmt.executeQuery();
		
		while(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
		// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
		
		// column Index 기준 조회
		//System.out.print( rs.getInt(1) + " ");
		//System.out.print( rs.getString(2) + " ");
		//System.out.println( rs.getString(3) );
		
		// column 이름(별칭) 기준 조회
		System.out.print( rs.getInt("deptno") + " ");
		System.out.print( rs.getString("dname") + " ");
		System.out.println( rs.getString("loc") );
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
		
	}
	
	
	public static void findDeptWhere() {
	
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
		String sqlQuery = " select * from dept where deptno = 10 ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
		psmt = conn.prepareStatement(sqlQuery);
		rs = psmt.executeQuery();
		
		//조회한 데이터가 1개인 경우
		if(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
		// column 이름(별칭) 기준 조회
		System.out.print( rs.getInt("deptno") + " ");
		System.out.print( rs.getString("dname") + " ");
		System.out.println( rs.getString("loc") );
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
	}
	
	public static void findDeptByDeptnoPrint(int deptno) { // f..(10) f..(30)
	
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		
		//DB 연결 정보
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
		//String sqlQuery = " select * from dept where deptno = " + deptno;
		// select * from dept where deptno = 30
		String sqlQuery = " select * from dept where deptno = ? ";
		//System.out.printf("select * from dept where deptno = %d", deptno);
		
		//select * from dept where deptno = ? AND dname = ? AND ...
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
		psmt = conn.prepareStatement(sqlQuery);
		
		//파라미터 세팅 (쿼리에 있는 ? 위치에 값 채우기)
		psmt.setInt(1, deptno);
		
		rs = psmt.executeQuery(); //쿼리 실행
		
		//조회한 데이터가 1개인 경우
		if(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
		// column 이름(별칭) 기준 조회
		System.out.print( rs.getInt("deptno") + " ");
		System.out.print( rs.getString("dname") + " ");
		System.out.println( rs.getString("loc") );
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
	}
	
	public static Dept findDeptByDeptno(int deptno) {
	
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		
		//DB 연결 정보
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
		
		Dept dept = null;
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from dept where deptno = ? ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
		psmt = conn.prepareStatement(sqlQuery);
		
		//파라미터 세팅 (쿼리에 있는 ? 위치에 값 채우기)
		psmt.setInt(1, deptno);
		
		rs = psmt.executeQuery(); //쿼리 실행
		
		//조회한 데이터가 1개인 경우
		if(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
		
		//데이터가 있다
		dept = new Dept();
		
		dept.setDeptno( rs.getInt("deptno") );
		dept.setDname( rs.getString("dname") );
		dept.setLoc( rs.getString("loc") );
		
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
		
		return dept;
		}
	
	public static Dept findDeptByDname(String dname) {
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		
		//DB 연결 정보
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
		
		Dept dept = null;
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from dept where dname = ? ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
		psmt = conn.prepareStatement(sqlQuery);
		
		//파라미터 세팅 (쿼리에 있는 ? 위치에 값 채우기)
		psmt.setString(1, dname);
		
		rs = psmt.executeQuery(); //쿼리 실행
		
		//조회한 데이터가 1개인 경우
		if(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
		
		//데이터가 있다
		dept = new Dept();
		
		dept.setDeptno( rs.getInt("deptno") );
		dept.setDname( rs.getString("dname") );
		dept.setLoc( rs.getString("loc") );
		
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
		
		return dept;
		}
	
	}