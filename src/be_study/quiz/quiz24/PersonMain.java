package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = null;
		
		p1 = new Person();
		
		p1.name = "최유빈";
		p1.gender = "남자";
		p1.age = 21;
		p1.height = 174;
		p1.weight = 66.5;
		p1.job = "사이버대학생 및 학원생";
		p1.bloodType = "O";
		p1.phyCond = "양호함";
		p1.sleep = "없음";
		
		System.out.println("이름 : " + p1.name);
		System.out.println("성별 : " + p1.gender);
		System.out.println("나이 : " + p1.age + "살");
		System.out.println("키 : " + p1.height + "cm");
		System.out.println("몸무게 : " + p1.weight + "kg");
		System.out.println("직업 : " + p1.job);
		System.out.println("혈액형 : " + p1.bloodType + "형");
		System.out.println("건강상태 : " + p1.phyCond);
		System.out.println("수면증여부 : " + p1.sleep);
	}

}
