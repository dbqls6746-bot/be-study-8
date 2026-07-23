package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Repository
//DAO : Data Access Object
public class DeptDAO {

	// Dept 데이터 관련된 DB 접근 객체
	
	
	public Dept findDeptByDeptno(int deptno) {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB(); //DB 연결 후 연결된 Connection 객체를 return
		
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
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return dept;
	}
	
	
	public Dept findDeptByDname(String dname) {
		
		
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB();
		
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
		}finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		
		
		return dept;
	}
	
	
	public List<Dept> findDeptList() {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		conn=DBConnectionManager.connectDB();
		
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
		}finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return deptList;
		
	}
}
