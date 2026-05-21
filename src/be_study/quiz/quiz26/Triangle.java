package be_study.quiz.quiz26;

public class Triangle {
//	Triangle tri = new Triangle();
//	tri.setSize(6, 8);
//	System.out.println("넓이 : " + tri.getArea());
	//삼각형 : 밑변 * 높이 / 2
	
	int width;
	int height;
	
	Triangle(){}
	
	void setSize(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	double getArea() {
        return (this.width * this.height) / 2.0;
    }
}
