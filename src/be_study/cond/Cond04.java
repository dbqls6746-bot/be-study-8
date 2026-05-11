package be_study.cond;

public class Cond04 {

	public static void main(String[] args) {
		
		// 조건문
		// 조건문 (조건문 && 조건식)
		// 조건문 (조건식 || 조건식)
		
		// 조건문 중첩
		
		// 조건식 ? 참: 거짓
		// 조건식 ? 참 : (조건식 ? 참 : 거짓)
		
		/*
		 
		 	if() {
		 		
		 		if(){
		 		}
		 		
		 	} else {
		 	
		 		if() {
		 		}
		 		
		 	}
		 */

		
		/*
		 	수면시간
		 	
		 	21시 기준
		 		전에 -> 일찍
		 		늦게 ->
		 		
		 	실제 수면시간
		 	
		 	8시간 기준
		 		적게
		 		많이
		 		
		 	
		 	일찍 적게
		 	일찍 많이
		 	늦게 적게
		 	늦게 많이
		 */
		
		
		int goBedTime = 23; //23시에 자러가고
		int sleepTime = 5;  //5시간 수면
		
		
		if( goBedTime <= 21) {  //일찍
			
			//일찍 자러 간건 확정
			
			//많이 적게
			if( sleepTime >= 8 ) {//많이
				System.out.println("일찍 많이");
			} else {
				System.out.println("일찍 적게");
			}
		} else { //늦게
			
			//일찍 늦게
			if( sleepTime >= 8 ) {//많이
				System.out.println("늦게 많이");
			} else {
				System.out.println("늦게 적게");
			}
		}
		
		
//		if( sleepTime >= 8) {}
//		if( sleepTime < 8) {}
		
		if (goBedTime <= 21 && sleepTime >=8) {
			System.out.println("일찍 많이");
		} else if (goBedTime <= 21 && sleepTime < 8) {
			System.out.println("일찍 적게");
		} else if (goBedTime > 21 && !(sleepTime <8)) {
//		} else if (goBedTime > 21 && sleepTime >=8) {
			System.out.println("늦개 많이");
		} else {
			System.out.println("늦게 적게");
		}
		
		int point = 50;
		
		// 0 ~ 100
		
		if(point >= 0 && point <= 100) {
		
			if(point >= 50) {
			System.out.println("잘줬네");
			} else {
			System.out.println("아쉽네");
			} else {
			System.out.println("잘못된 점수가 들어왔습니다. 점수는 0~100점만 가능");
			}
		}
	}

}
