package be_study.quiz.quiz48;

import java.util.List;

public class Quiz48Main {

	public static void main(String[] args) {
		StScHDAO stschDAO = new StScHDAO();
		
		List<StudentScoreHakjumDTO> list = stschDAO.findStudentScoreHakjum(102);
		System.out.println(list);

		for(StudentScoreHakjumDTO s : list) {
			System.out.println(s);
		}
	}

}
