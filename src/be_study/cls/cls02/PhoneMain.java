package be_study.cls.cls02;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone p1 = new Phone();
		//매개변수 없는 생성자가 선언되어 있지 않으면 생성불가
		
		Phone p2 = new Phone("갤럭시 S26");
		
		Phone p3 = new Phone("아이폰10", 990000);
		Phone p4 = new Phone("아이폰11", 3100); //잘못넣은 케이스
						//	  모델명	  배터리용량
		
		Phone p5 = new Phone(4000, "갤럭시Z플립");
		
		Phone p6 = new Phone("갤럭시 폴드4", 2100000, 4200);
	}

}
