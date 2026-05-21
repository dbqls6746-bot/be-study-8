package be_study.quiz.quiz26;

public class Rectangle {
//	Rectangle rec = new Rectangle(10, 5);
//	System.out.println("넓이 : " + rec.getArea());
	//사각형 : 밑변 * 높이
	
	int width;
	int height;
	
	Rectangle(){}
	
	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
        return this.width * this.height;
    }
}
