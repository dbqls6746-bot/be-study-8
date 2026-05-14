package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("첫번째 정수를 입력하세요 : "); 
//		int num1 = scanner.nextInt();
//		
//		System.out.print("두번째 정수를 입력하세요 : "); 
//		int num2 = scanner.nextInt();
//		
//		System.out.print("세번째 정수를 입력하세요 : "); 
//		int num3 = scanner.nextInt();
//		
//		System.out.print("네번째 정수를 입력하세요 : "); 
//		int num4 = scanner.nextInt();
//		
//		System.out.print("다섯번째 정수를 입력하세요 : "); 
//		int num5 = scanner.nextInt();
//		
//		int[] numArr1 = {num1, num2, num3, num4, num5};
		
		int[] numArr1 = new int[5];
		System.out.print("5개의 정수를 입력하세요 : "); 
//		numArr1[0] = scanner.nextInt();
//		numArr1[1] = scanner.nextInt();
//		numArr1[2] = scanner.nextInt();
//		numArr1[3] = scanner.nextInt();
//		numArr1[4] = scanner.nextInt();
		
		for(int i=0; i<5; i++) {
			numArr1[i] = scanner.nextInt();
		}
		for (int i=0; i<5; i++) {
			System.out.print(numArr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("몇번째 수인가요? : "); 
		
		int pn1 = scanner.nextInt() - 1;
		
		System.out.println("결과 : " + numArr1[pn1]);
		
		System.out.println("----------------------");
		
//		System.out.print("첫번째 정수를 입력하세요 : "); 
//		int num11 = scanner.nextInt();
//		
//		System.out.print("두번째 정수를 입력하세요 : "); 
//		int num22 = scanner.nextInt();
//		
//		System.out.print("세번째 정수를 입력하세요 : "); 
//		int num33 = scanner.nextInt();
//		
//		System.out.print("네번째 정수를 입력하세요 : "); 
//		int num44 = scanner.nextInt();
//		
//		System.out.print("다섯번째 정수를 입력하세요 : "); 
//		int num55 = scanner.nextInt();
//		
//		int[] numArr2 = {num11, num22, num33, num44, num55};
		
		int[] numArr2 = new int[5];
		
		System.out.print("5개의 정수를 입력하세요 : "); 
		
		for(int i=0; i<5; i++) {
			numArr2[i] = scanner.nextInt();
		}
		
		for (int j=4; j>=0; j--) {
			System.out.print(numArr2[j] + " ");
		}
		System.out.println();
		
		System.out.println("--------------------");
		
		int[][] numArr3 = new int[4][4];
		
		int t = 1;
		
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numArr3[i][j] = t++;
            }
        }
		
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=3; j++) {
				System.out.print(numArr3 [i][j] + " ");
			}System.out.println();
		}
	}

}
