package be_study.quiz.quiz53;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be_study.db.v2.DBConnectionManager;


public class MinuDustFrcstDspthDAO {
	public int saveMinuDustFrucst (MinuDustFrcstDspthDTO minuDTO) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " insert into MINU_DUST_FRCST "
				+ " values ( ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,? ,? ,?  ) ";
		
		int result = 0;

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setString(1, minuDTO.getImageUrl14());
			psmt.setString(2, minuDTO.getInformCode());
			psmt.setString(3, minuDTO.getImageUrl15());
			psmt.setString(4, minuDTO.getImageUrl16());
			psmt.setString(5, minuDTO.getActionKnack());
			psmt.setString(6, minuDTO.getInformCause());
			psmt.setString(7, minuDTO.getInformOverall());
			psmt.setString(8, minuDTO.getInformData());
			psmt.setString(9, minuDTO.getInformGrade());
			psmt.setString(10, minuDTO.getDataTime());
			psmt.setString(11, minuDTO.getImageUrl13());
			psmt.setString(12, minuDTO.getImageUrl12());
			psmt.setString(13, minuDTO.getImageUrl11());
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;


	}
}
