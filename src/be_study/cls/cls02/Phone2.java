package be_study.cls.cls02;

public class Phone2 {
	//this() 생성자 호출
	
	//필드
	String model; //모델명
	int price; //가격
	int battery; //배터리용량 3100 3800 4000
	
	//생성자
	//기본생성자 Phone(){}
	//Phone(){}
	
	Phone2(String model){ //String 1개
//		this.model = model;
//		this.price = 0;
//		this.battery = 2500;
		
		//같은 클래스 파일 내부에서 내 다른 생성자 호출 this();
		//this();	//외부 입장 : new Phone2();
		this(model, 0, 2500);		// 외부입장 : new Phone2("갤럭시 폴드4", 2100000, 4200);
		
		//변수 초기화
		//기타 다른 생성시 할일...
		//알코소독
		//필름부착
		//불량검사
		//재부팅
		//기능검사
	}
	
	Phone2(int battery){ //int 1개
		
	}
	
	// 모델명, 가격
	// String int 순서로 2개
	Phone2(String model, int price){
//		this.model = model;
//		this.price = price;
//		this.battery = 2500;
		this(model, price, 2500);
	}
	
	
	// int String 순서로 2개
	Phone2(int battery, String model){
//		this.battery = battery;
//		this.model = model;
//		this.price = 0;
		this(model, 0, battery);
	}
	
	Phone2(String model, int price, int battery){
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	
	Phone2(int batteryl, String model, int price){
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	//메소드
}
