package be_study.quiz.quiz26;

public class Monitor {
//	1. Monitor 클래스 생성 -> 클래스 생성
//	2. 속성 ( 제조회사, 인치, 가격, 색상, 최대해상도x, 최대해상도y ) -> 필드변수 생성
//	3. 모니터는 만들때 필수 값이 필요합니다. -> 생성자 (매개변수)
//	(제조회사, 인치, 가격)
//	4. 색상과 해상도는 옵션으로 선택할 수 있어서, 이 후에 별도로 입력 받겠습니다. -> set메소드
//	setXY, setColor 값을 저장 할 수 있도록.
//	5. 모니터클래스에는 전원을 키는 기능이 있습니다. -> 전원켜기 메소드
//	전원이 켜진 후 "전원이 켜졌습니다"를 출력해줍니다.
//	6. 모니터 클래스에는 가격인상 기능이 있습니다. -> return금액 가격인상 메소드
//	입력된 만큼의 금액이 인상되고 인상된 후 최종 금액을 반환합니다.
//	7. 두 개의 모니터를 생성합니다. -> main 에서 객체 생성 new Monitor
//	1) 삼성 27인치 150,000 검은색
//	2) LG 32인치 330,000
//	8. 모니터의 색상과 해상도가 결정되었습니다. -> 해상도값 저장 4번 생성한 set메소드 활용
//	1) 1080 * 780
//	2) 흰색, 4096 * 2048
//	9. 모니터 클래스에는 자신의 정보를 정렬하여 출력해주는 기능이 있습니다. -> 출력기능 메소드
//	10. 1), 2) 모니터의 정보를 출력합니다. -> 9번활용 출력
//	11. 2) 의 가격이 7만원 인상시키고, 그 결과 총금액을 받아서 출력합니다.-> 6번,9번 메소드활용 (9번은...밑에 12번에서 출력을 다시 하니까...6번만해도..되겠군요)
//	12. 1), 2)에 해당하는 정보를 다시 출력합니다. -> 9번활용 출력
	
	String company;
	int inch;
	int price;
	String color;
	int maxX;
	int maxY;
	
	Monitor(){}
	
	Monitor(String company, int inch, int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
	void setXY(int maxX, int maxY) {
		this.maxX=maxX;
		this.maxY=maxY;
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	public int upPrice(int up) {
        this.price += up; 
        return this.price;
	}
	
	void show() {
		System.out.println(company + " " + inch +"인치 " + price);
	}
	
	void printInfo() {
		System.out.println("=======모니터1정보======");
		System.out.println("제조회사 : " + company);
		System.out.println("인치 : " + inch);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
		System.out.println("해상도 : " + maxX + "*" + maxY );
		System.out.println("=====================");
	}
	
	void print() {
		System.out.println("=======모니터2정보======");
		System.out.println("제조회사 : " + company);
		System.out.println("인치 : " + inch);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
		System.out.println("해상도 : " + maxX + "*" + maxY );
		System.out.println("=====================");
	}
}
