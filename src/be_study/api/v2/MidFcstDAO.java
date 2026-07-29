package be_study.api.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import be_study.db.v4.DBConnectionManager;

public class MidFcstDAO {

	/*
	CREATE TABLE MID_TA
	(
	    --no
	    tm_fc VARCHAR2(12),		202607280600
	    reg_id VARCHAR2(8),		11B20201
	    ta_min4 NUMBER,
	    ta_max4 NUMBER,
	    ta_min5 NUMBER,
	    ta_max5 NUMBER,
	    CONSTRAINT MID_TA_PK PRIMARY KEY (tm_fc, reg_id)
	);

	CREATE TABLE MID_TA_REG_ID
	(
	    reg_id VARCHAR2(8),
	    reg_name VARCHAR2(32)
	);
	 */

	public int saveMidTa(MidTaDTO midTaDTO) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " insert into MID_TA "
				+ " values ( ?, ?, ?, ?, ?, ? ) ";
		//			? 
		int result = 0;

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setString(1, midTaDTO.getTmFc());
			psmt.setString(2, midTaDTO.getRegId());
			psmt.setInt(3, midTaDTO.getTaMin4());
			psmt.setInt(4, midTaDTO.getTaMax4());
			psmt.setInt(5, midTaDTO.getTaMin5());
			psmt.setInt(6, midTaDTO.getTaMax5());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;


	}
}
