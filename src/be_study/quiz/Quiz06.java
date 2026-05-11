package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요 : ");
		int width1 = scanner.nextInt(); 
		System.out.println("입력한 밑변="+ width1);
		System.out.print("윗변을 입력하세요 : ");
		int width2 = scanner.nextInt(); 
		System.out.println("입력한 윗변="+ width2);
		System.out.print("높이를 입력하세요 : ");
		int height = scanner.nextInt(); 
		System.out.println("입력한 높이="+ height);
		
		double s1 = (double)(width1*height)/2;
		
		System.out.println("삼각형의 넓이 : " + s1);
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
		double s2 = (double)(width1+width2)*height/ 2;
		System.out.println("사다리꼴의 넓이 : " + s2);

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.

		int p = 24;
		int snack = 100;
		int result1 = snack/p;
		System.out.println("한명당 받는 과자의 수 : " + result1);
		
		int result2 = snack%p;
		System.out.println("남은 과자의 수 : " + result2);
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		scanner.nextLine();
		
		System.out.print("세 자리의 정수를 입력하세요: ");
        int number = scanner.nextInt();

        int hundred = number/100;

        int ten = number%100/10;

        int one = number%10;

        System.out.println("입력한 세자리 정수 : " + number);
        System.out.println("백의자리 : " + hundred);
        System.out.println("십의자리 : " + ten);
        System.out.println("일의자리 : " + one);
		
		
	

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		int z = x;
		x = y;
		y = z;
//		//x와 y를 바꾼 작업
//		//
//		//
		System.out.println("x="+x+ " y="+y);

	}

}
