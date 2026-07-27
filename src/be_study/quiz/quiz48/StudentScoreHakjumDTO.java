package be_study.quiz.quiz48;

public class StudentScoreHakjumDTO {
	int studno;
	String name;
	int deptno1;
	int total;
	String grade;
	int maxPoint;
	int minPoint;
	public StudentScoreHakjumDTO(int studno, String name, int deptno1, int total, String grade, int maxPoint,
			int minPoint) {
		super();
		this.studno = studno;
		this.name = name;
		this.deptno1 = deptno1;
		this.total = total;
		this.grade = grade;
		this.maxPoint = maxPoint;
		this.minPoint = minPoint;
	}
	public StudentScoreHakjumDTO() {
		super();
	}
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno) {
		this.deptno1 = deptno1;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMaxPoint() {
		return maxPoint;
	}
	public void setMaxPoint(int maxPoint) {
		this.maxPoint = maxPoint;
	}
	public int getMinPoint() {
		return minPoint;
	}
	public void setMinPoint(int minPoint) {
		this.minPoint = minPoint;
	}
	@Override
	public String toString() {
		return "StudentScoreHakjumDTO [studno=" + studno + ", name=" + name + ", deptno1=" + deptno1 + ", total="
				+ total + ", grade=" + grade + ", maxPoint=" + maxPoint + ", minPoint=" + minPoint + "]";
	}
	
}
