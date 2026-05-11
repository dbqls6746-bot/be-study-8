package be_study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// 조건문 if 문
		
		// if(조건식) -> 조건식이 참이면 실행
		
		int num = 15;
		int x = 3;
		
		if(num > 5) {								//메소드 블록
			System.out.println("num이 5보다 크다");
			System.out.println("if문 안 {} 실행");
			
			// {} 하나의 인식되는 지역 구분
//			int x = 30; //x 변수명 중복 사용 불가
			x = 50; // 위에 이미 int x 선언되어 있음.
			
			int y = 20;
			y = y + 50;
			y = 100;
			System.out.println(y);
		}
		
		x = 20;
		
		 // y= 500; if 문 내부 지역(로컬 local) 만 인식되는 변수
		//if문(메소드 블록)에 이미 선언 되어 있는 변수명 활용 불가 // 메소드 블록 안에 있는 변수 : 로컬 변수

		int y = 5;
		
		if ( num < 10) {//참이면 실행
			System.out.println(" num이 10보다 작구나");
			System.out.println("num이 작다");
		}else { //위쪽 조건문 거짓이면 실행 else문은 혼자 사용될 수 없기에 if문 바로 뒤에 달라 붙어야 한다
			System.out.println("num이 10보다 작지 않다");
		}
		
		// if(조건식)		조건식 ->  결과가 논리형 (true / false)
		
		num = 14;
		boolean bool1 = (num != 15);
		// bool1 = num 15가 아니면 true
		
		// true / false
		//if(bool1) { // 조건식 결과가 논리형 <-- boolean 논리형
		
		//if( bool1 == true ) {
		//if (bool1 == false) (
		if( !bool1 ) { // bool1 true -> !true -> false	bool1 false -> !false -> true
			System.out.println("num이 15랑 같은 수");
		} else {
			System.out.println("num이 15랑 다른 수");
		}
		
		boolean bool2 = (num == 15);
		
		if( bool2 )	{
			System.out.println("num이 15랑 같은 수");
		} else {
			System.out.println("num이 15랑 다른 수");
		}
		
		System.out.println("end");
	}

}
