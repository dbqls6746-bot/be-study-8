package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		System.out.print("정수를 입력하세요 : ");
		int i = scanner.nextInt();
		
		if (i%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		
		if (i%7 == 0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		
		int total = 0;
		
		for(int n = 1; n<=1000; n++) {
			if(n%5 == 0) {
			total = total+n;
			}
		}
		System.out.println(total);
		
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
		System.out.print("*를 생성할 수를 1부터 50중에 입력하세요 : ");
		int y = scanner.nextInt();
		
		if (y>=1 && y<= 50) {
			for(int z=1; z<=y; z++)
				System.out.print("*");
				System.out.println();
		}else {
			System.out.println("까탈스러운 요정 : 1부터 50중에 입력하시라니깐요!! 아 몰랑 이미 끝났어 다음!");
		}
		
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		
		total = 0;
		
		for(int n = 1; n<=10; n++) {
			if(n%2 == 0) {
			total = total-n;
			}else {
			total = total+n;
			}
		}
		System.out.println(total);
		
//		6. 정수를 1부터(1+2+3+4.....) 계속 누적으로 더한다. 이런 패턴으로 누적으로 더해진 누적 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		
		total = 0;
		for(int n=1; n<=1000; n++) {
			total= total+n;
			if(total>=1000) {
				break;
			}
		}
		System.out.println(total);
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
		System.out.println("1~9까지 중 보고싶은 구구단은? : ");
		System.out.print("1~9까지에서의 첫번째 수를 입력하세요 : ");
		
		int num = scanner.nextInt();
		for (int j=1; j<=9; j++) {
			System.out.printf("%3d * %3d =%3d\n", num, j, (num*j));
		}

	}

}
