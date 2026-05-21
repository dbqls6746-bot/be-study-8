package be_study.quiz.quiz26;

public class MonitorMain {

	public static void main(String[] args) {
		Monitor main = new Monitor();
		
		main.powerOn();
		
		//7. 두 개의 모니터를 생성합니다. -> main 에서 객체 생성 new Monitor
//		1) 삼성 27인치 150,000 검은색
//		2) LG 32인치 330,000
		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.setColor("검은색");
		m1.show();
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		m2.show();
		
		m1.setXY(1080, 780);
		
		m2.setColor("힌색");
		m2.setXY(4096,2048);
		
		m1.printInfo();
		m2.print();
		
		m2.upPrice(70000);
		m2.show();
		
		m1.printInfo();
		m2.print();
	}

}
