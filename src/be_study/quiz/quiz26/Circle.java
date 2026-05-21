package be_study.quiz.quiz26;

public class Circle {
//	Circle circle = new Circle();
//	circle.setRadius(5);
//	System.out.println("넓이 : " + circle.getArea());
//	//원 넓이 : 반지름 * 반지름 * 3.14

    int radius;

    void setRadius(int radius) {
        this.radius = radius;
    }

    
    double getArea() {
        return (double)this.radius * this.radius * 3.14;
    }
}
