package be_study.quiz;

public class Quiz11 {

	public static void main(String[] args) {
//		Hint
//		i, j 값 변화 추적 -> 규칙 찾기
//		print
//		println
//
//
//		※규칙을 찾아보고 작성
//		1) 반복문 1개로 결과 만들기
		
		int i=0;
		
		int j=0;
		
		for(i=1; i<=5; i++) {
			System.out.println("12345");
		}
		
		for(i=1; i<=5; i++) {
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.println();
		}
		
//		2)반복문 2개 중첩해서 결과만들기
		 for(i=1; i<=5; i++) {
			 for(j=1; j<=5; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 
		 for(i=1; i<=5; i++) {
			 for(j=1; j<=5; j++) {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
		
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
//		12345
//		12345
//		12345
//		12345
//		12345
//
//		//2.
//		11111
//		22222
//		33333
//		44444
//		55555

	}

}
