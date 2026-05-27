package be_study.quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
		//1.
//		다음을 만족하는 Student 클래스를 작성하시오.
//		· String 형의 학과와 정수형의 학번을 필드로 선언
//		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//		학과와 학번 필드에 적당한 값을 입력 후 출력
//		기능 추가.
//		· 필드를 모두 private 로 하고, getter 와 setter 를 구현하고
//		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//		setter 를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
		
		Student a = new Student("전기전자학과",2026105047);
		
		//Getter Setter 쓰기전
		//System.out.println("학과 : " + a.department;
		//System.out.println("학번 : " + a.classNumber);
		
		a.setDepartment("전기시스템제어학과");
		a.setClassNumber(2024030616);
		
		System.out.println("학과 : " + a.getDepartment());
		System.out.println("학번 : " + a.getClassNumber());
	}
}
		

	class Student{
		private String department;
		private int classNumber;
		
		public Student(String department, int classNumber) {
	        this.department = department;
	        this.classNumber = classNumber;
		}
		public String getDepartment(){
			return department;
		}
		
		public int getClassNumber(){
			return classNumber;
		}
		
		public void setDepartment(String department){
			this.department = department;
		}
		
		
		public void setClassNumber(int classNumber){
			this.classNumber = classNumber;
		}
	}	
	
	
		
		
	

	
