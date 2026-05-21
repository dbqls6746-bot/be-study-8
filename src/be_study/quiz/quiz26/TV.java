package be_study.quiz.quiz26;

public class TV {
	String company;
	int year;
	int inch;
	
	TV(){}
	
	TV(String company, int year, int inch){
		this.company=company;
		this.year=year;
		this.inch=inch;
	}
	
	void show() {
		System.out.println(company + "제품 " + year + "년형 " + inch + "인치 TV");
	}
}
