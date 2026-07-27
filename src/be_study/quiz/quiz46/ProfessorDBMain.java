package be_study.quiz.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v1.Dept;


public class ProfessorDBMain {

	public static void main(String[] args) {
		List<Professor> p1 = findProfessorByDeptnoList(103);
		
		if(p1.size() > 0) {
			for(Professor p : p1) {
				System.out.println(p1.toString());
			}
		}

	}


	public static List<Professor> findProfessorByDeptnoList(int deptno ) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; 
		PreparedStatement psmt = null; 
		ResultSet rs = null;
		
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlQuery = " select profno, name, id, position, pay, deptno from professor where deptno = ? ";
		
		List<Professor> professorList = new ArrayList<>();
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				Professor professor = new Professor();
				
				professor.setProfno( rs.getInt("profno"));
				professor.setName( rs.getString("name"));
				professor.setId( rs.getString("id") );
				professor.setPosition( rs.getString("position"));
				professor.setPay( rs.getInt("pay") );
				professor.setDeptno( rs.getInt("deptno") );
			
				professorList.add(professor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			if(rs != null)
			rs.close(); 
				
			if(psmt != null)
			psmt.close();
				
			if(conn != null)
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return professorList;
	}
}
