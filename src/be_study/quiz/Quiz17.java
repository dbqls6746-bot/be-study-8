package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
		
		int x = 0;
		int y = 0;
		
		for( x=1; x<=10; x++)
			for( y=1; y<=10; y++) {
				int sum = 2*x+4*y;
				if(sum == 10) {
					System.out.println("x : " + x + " y : " + y);
				}
		}
		
//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1<=num2) {
			System.out.println(num2-num1);
		}else{
			System.out.println(num1-num2);
		}
		
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		
		System.out.print("4개의 윷을 입력하세요 : ");
		int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += scanner.nextInt();
        }
	
        switch(sum) {
        case 1:
        	System.out.println("도");
        	break;
        case 2:
        	System.out.println("개");
        	break;
        case 3:
        	System.out.println("걸");
        	break;
        case 4:
        	System.out.println("윷");
        	break;
        case 0:
        	System.out.println("모");
        	break;
        default :
        	System.out.println("잘못된 입력입니다");
        	break;
        }
		
		
		
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
        
        System.out.print("*를 생성할 수를 입력하세요 : ");
		int eight = scanner.nextInt();
		
			for(int z=1; z<=eight; z++) {
				System.out.print("*");
			}


	}

}
