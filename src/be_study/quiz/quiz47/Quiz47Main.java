package be_study.quiz.quiz47;

import java.util.List;

public class Quiz47Main {

	public static void main(String[] args) {
		/*
		자바에서 DB를 연동하여
		DB에 있는 student 테이블에 있는 데이터 값을 조회 할 예정입니다.

		StudentDAO 객체를 생성한 후, 관련 데이터 처리 메소드를 생성하며 진행합니다.
		(*호출 부분 main 에서 DAO 객체 생성하여 활용)
		아래 메소드를 생성해서 데이터를 획득하고, 콘솔창에 출력해보세요.

		1. 기본 student 전체 조회 메소드

		2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드

		- 리턴은 둘다 모두 List<> 타입으로 반환
		- StudentDTO 객체 생성 필요
		- 출력시 날짜는 1975-10-23 형식으로 출력할 것
		*/
		//Student 조회
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> list1 = studentDAO.findStudentList();
		
		
		for(StudentDTO s : list1) {
			System.out.println(s.toString());
		}
		
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(4);
		
		System.out.println("-------4학년 조회--------------------------------");
		for(StudentDTO s : list2) {
			System.out.println(s.toString());
		}
		
		
		
		/*
		 * 
			3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
			- 데이터는 임의로 사이즈에 맞게 넣어주세요.
			- 단, 저장시 birthday 날짜는 2000-05-31 로 저장해주세요.
		 */
		
		StudentDTO st1 = new StudentDTO();
		
		st1.setStudno(9999);
		st1.setName("name");
		st1.setId("Id");
		st1.setGrade(5);
		st1.setJumin("0011111234567");
		st1.setBirthday("2000-05-31");
		st1.setTel("031)123-1234");
		st1.setHeight(190);
		st1.setWeight(90);
		st1.setDeptno1(401);
		st1.setDeptno2(501);
		st1.setProfno(9999);
		
		int result = studentDAO.saveStudent(st1);
		if(result > 0 )
			System.out.println("잘 만들어졌다");
		
		
		StudentDTO st2 = new StudentDTO();
		
		st2.setStudno(9989);
		st2.setName("name2");
		st2.setId("Id2");
		st2.setGrade(5);
		st2.setJumin("001121234567");
		st2.setBirthday("2000-05-31");
		//st2.setTel("031)123-1234");  //String s = null;
		st2.setTel(null); 
		st2.setHeight(190);
		st2.setWeight(90);
		st2.setDeptno1(401);
		//st2.setDeptno2(501);   //deptno2  int d = null;
		st2.setDeptno2(null);   //deptno2
		st2.setProfno(9999);
		
		int result2 = studentDAO.saveStudent(st2);
		if(result2 > 0 )
			System.out.println("잘 만들어졌다");
	}

}



















