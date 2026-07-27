package be_study.quiz.quiz48;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StScHDAO {
	
	public List<StudentScoreHakjumDTO> findStudentScoreHakjum(int deptno1) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		//String sqlQuery = " select * from student ";
		String sqlQuery = " SELECT st.studno, st.name, sc.total, h.grade  "
                + " FROM student st, score sc, hakjum h "
                + " WHERE st.deptno1 = ? "
                + "AND st.studno = sc.studno "
                + "   AND sc.total BETWEEN h.min_point AND h.max_point ";

		List<StudentScoreHakjumDTO> list = new ArrayList<>();

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno1 );
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				StudentScoreHakjumDTO stschDTO = new StudentScoreHakjumDTO();
				
				stschDTO.setStudno( rs.getInt("studno") );
				stschDTO.setName(rs.getString("name"));	
				stschDTO.setTotal(rs.getInt("total"));
				stschDTO.setGrade(rs.getString("grade"));
				
				list.add(stschDTO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return list;
	}
}
