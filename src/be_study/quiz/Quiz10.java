package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : "); 
		int language = scanner.nextInt();
		
		System.out.print("수학점수를 입력하세요 : "); 
		int math = scanner.nextInt();
		
		System.out.print("영어점수를 입력하세요 : "); 
		int english = scanner.nextInt();
		System.out.println("국어점수 : " + language);
		System.out.println("수학점수 : " + math);
		System.out.println("영어점수 : " + english);
		
		int result = language + math + english;

		double sum = (double)result / 3;
		
		if (language >= 40 && math >= 40 && english >= 40 && sum >= 60) {
			System.out.println("국어 : " + language);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + result);
			System.out.println("평균 : " + sum);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

}
