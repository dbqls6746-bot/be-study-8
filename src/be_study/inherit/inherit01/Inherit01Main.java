package be_study.inherit.inherit01;

public class Inherit01Main {

	public static void main(String[] args) {
		
		//개념적인 객체
		//Parent p1 = new Parent();
		Parent p1 = new Parent(5000);
		p1.money = 5000;
		p1.work();
		
		Child c1 = new Child();
		c1.school = "남부초등학교";
		c1.grade = 5;
		c1.play();
		
		c1.money = 1000;
		c1.work();
		
		Child c2 = new Child("서초등학교", 3);
		c2.money = 100;

		Child c3 = new Child("동초등학교", 2, 300);
		System.out.println(c3.school);
		System.out.println(c3.grade);
		System.out.println(c3.money);
		
		c3.printInfo();
	}
	

}
