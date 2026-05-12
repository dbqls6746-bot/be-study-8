package be_study.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복*/
		
		int i =0;
		for(i=0; i<=10; i++) {
			System.out.printf("%3d",i);
		}
		
		System.out.println();
		
		for (i=1; i<=9; i++) {
			System.out.printf("%3d",i);
		}
		
		System.out.println();
		
		for(i=10; i<=100; i=i+10) {
			System.out.printf("%4d",i);
		}
		
		System.out.println();
		
		for(i=25; i<=100; i=i+25) {
			System.out.printf("4%d",i);
		}
	
		System.out.println();
		
		/*while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		i = 50;
		
		while (i<=55) {
			System.out.printf("%4d",i);
			i++;
		}

		System.out.println();
		
		i= 10;
		
		while (i>=1) {
			System.out.printf("3%d",i);
			i--;
		}
		
		i= 30;
		
		System.out.println();
		
		while (i>=0) {
			System.out.printf("%4d",i);
			i=i-5;
		}
		
		System.out.println();
		
		i=30;
		
		while (i>=5) {
			System.out.printf("4%d",i);
			i=i-5;
		}
		
		System.out.println();
		
		i=25;
		while (i>=0) {
			System.out.printf("4%d",i);
			i=i-5;
		}
	}

}
