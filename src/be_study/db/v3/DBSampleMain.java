package be_study.db.v3;

import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {

		ProfessorDAO professorDAO = new ProfessorDAO();
		
		List<ProfessorDTO> professorList = professorDAO.findProfessorList();
		
		for(ProfessorDTO p : professorList) {
			//System.out.println(p.toString());
			//	yyyy-MM-dd
			//String hiredate = ConvertDateUtil.convertLocalDateTimeToString(p.getHiredate());
			
			System.out.println(p.toString());
			System.out.println(p.getHiredate());
			
			//ConvertDateUtil.covertDateStringToLocalDateTime(p.getHiredate());
		}
		
		//날짜 데이터 값 저장
		ProfessorDTO p1 = new ProfessorDTO();
		p1.setProfno(9002);
		p1.setName("namep2");
		p1.setId("idp2");
		p1.setHiredate("1999-09-30");
		
		int result1 = professorDAO.saveProfessor(p1);
		if(result1 > 0 ) {
			System.out.println("정상 저장 성공");
		}
		
		
		
	}

}
