package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
		
		//반복문 Iteration
		
		System.out.println("배고프다");
		//...
		//...
		//...
		//...
		//...
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		
		
		// for문 반복문
		
		/*
		 	
		for(초기화식; 조건식; 증감식){
			실행문;
		} 	
		 */
		
		// ㅑ: 1 2 3 4 5 6 7 8 9 10		11
		
		for(int i=1; i<=10; i++) {
			System.out.println("재밌다");
		}
	
		System.out.println("for문 끝남");
		
		//int i=5; //이미 똑같은 변수명을 메소드 블록안에 썼기에 못 쓴다
		
		/*
		
		int i =1;
		
		if( i<=10){
			System.out.println("재밌다");
		}
		i++;
		
		int i =1;
		
		if( i<=10){
			System.out.println("재밌다");
		}
		i++;
		 
		...........
		
		// i: 11
		if( i<=10){ //거짓!
			System.out.println("재밌다");
		}
		반복문 끝.
		그 반복문 끝난 다음 줄에 있는 순서대로 또 진행........
		
		 */
		
		int i=0;
		
		// i:1		|	3
		for(i=1; i<3; i++) {
			System.out.println("피곤하다");
		}
		
		// i: 35 36 37 38 39 40 41 42 43 44		|	45
		//			45<45
		for(i=35; i<45; i++) {	// i=i+1) {		//10번 반복
			System.out.println("for 실행문 : Lezenca Save Us");
		}
		
		System.out.println(i); //45
		
		//단순 몇회 반복용도
		//for(i=35; i<45; i++)
		
		//5회 반복
		for(i=10; i<15; i++) {
			System.out.println("다이어트 1일차");
		}
		
		//내부에 있는 실행문에서 활용할 목적으로 값을 조정 -> 반복문 사용
		
		for(i=1; i<6; i++) {
			System.out.println("다이어트 " + i +"일차");
		}
		
		System.out.println("------------------------------------");
		
		//숫자의 총합
		
		int number = 1 + 2 + 3 + 4 +5;// +6 7 8 ......
		
		number = number + 1;
		number = number + 2;
		number = number + 3;
		number = number + 4;
		number = number + 5;
	
		int sum = 0;
		
		// n : 1 2 3 4 5  | 6
		
		for(int n=1; n<=5; n++) {
			
			// sum : 0
			sum = sum + n;
		//		= 0	  + 1	-> 1
		//		= 1   + 2	-> 3
		//		= 3	  + 3	-> 6
		//		= 6	  + 4	-> 10
		//		= 10  + 5	-> 15
			
		}
		
		System.out.println("총 누적 합 : " + sum);
		
		
		// 누적합
		// 10 20 30 40 50 .... 100 의 합
		
		int total = 0;
		
		//반복문기준값 :  1  2  3  4  5  6  7  8  9  10
		//더해야하는값 :  10 20 30 40...             100
		// 기준갑 * 10 -> 더할 값
		for(int j=1; j<=10; j++) {
			total = total + (j*10);
			//				 1*10 = 10
			//				 2+20 =20
			//				...
			//				10*10 =100
		

		}
		System.out.println("total 누적합 : " + total);
		
		total = 0;
		//값의 변화 10 20 30 40 ... 100
		//			+10 +10...+10
		for(int j=10; j<=100; j=j+10) {
			total = total + j;
		}
		System.out.println("total 누적합 : " + total);
		
		for(int k=2; k<20; k=k*2) {}
		// k: 2 4 8 16 | 32
		
		for(int k=400; k>100; k=k-50) {}
		// k: 400 350 300 250 200 150 | 100
		
		for(int k=100; k>90; k--) {}
		// k: 100 99 98 97 96 95 94 93 92 91 90 | 89
		
		// 11번 반복만  for(int k=1; k<=11l; k++)
	}
	

	
}
