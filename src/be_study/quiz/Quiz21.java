package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*1.
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		*/
		for (int i = 1; i <= 6; i++) {
            
            for (int j = 1; j <= 6; j++) {
               
                if (i + j == 6) {
                    System.out.println("두 눈의 합이 6이 되는 경우의 수 : " + i + ", " + j);
                }
            }
        }
   


		/*2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용

		*/
		int[] lotto = new int[6];
				
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] =((int)(Math.random()*45) + 1);
			
		for (int j=0; j<i; j++) {
			if(lotto[i] == lotto[j]) {
				i--;
				break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
		
		System.out.println();
		
		
		/*
		3.
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)

		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30

		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20
		*/
		
		
		int sum1 = 0 ;
		int[] numArr1 = new int[5];
		System.out.print("1반의 5명의 점수를 입력하세요 : ");
		for(int i=0; i<5; i++) {
			numArr1[i] = scanner.nextInt();
			 sum1 += numArr1[i];
		}
		
		double sum11 = (double)sum1/5;

		System.out.print("1반 : ");
		for (int i=0; i<5; i++) {
				System.out.print(numArr1[i] + " ");
			}
		System.out.println();
		
		int sum2 = 0;
		int[] numArr2 = new int[5];
		System.out.print("2반의 5명의 점수를 입력하세요 : ");
		for(int i=0; i<5; i++) {
			numArr2[i] = scanner.nextInt();
			sum2 += numArr2[i];
		}
		
		double sum22 = (double)sum2/5;
		
		System.out.print("2반 : ");
		for (int i=0; i<5; i++) {
				System.out.print(numArr2[i] + " ");
			}
		System.out.println();
		
		int[] numArr3 = new int[5];
		
		int sum3 = 0; 
		System.out.print("3반의 5명의 점수를 입력하세요 : ");
		for(int i=0; i<5; i++) {
			numArr3[i] = scanner.nextInt();
			sum3 += numArr3[i];
		}
		
		double sum33 = (double)sum3/5;
		
		System.out.print("3반 : ");
		for (int i=0; i<5; i++) {
				System.out.print(numArr3[i] + " ");
			}
		System.out.println();
		
		System.out.println("1반 평균 : " + sum11);
		System.out.println("2반 평균 : " + sum22);
		System.out.println("3반 평균 : " + sum33);
		System.out.println("전체평균 : " + (sum11 + sum22 + sum33)/3.0);
//		
		/*4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.

		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270*/
		
//		int[][] plusArr = new int[3][3];
//		
//		int k = 0;
//		
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				plusArr[i][j]= k= k+10;
//			}
//		}
//		
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				System.out.print(plusArr[i][j] + " ");
//			}System.out.println();
//		}
		
		int[][] arr =
			{ {10, 20, 30}, {20, 30, 40},{30, 40, 50} };
		
		int[][] plusArr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				plusArr[i][j] = arr[i][j];
				
				plusArr[i][3] += arr[i][j];
				plusArr[3][j] += arr[i][j];
				plusArr[3][3] += arr[i][j];
			}
		}
		
		for (int i = 0; i < plusArr.length; i++) {
            for (int j = 0; j < plusArr[i].length; j++) {
                System.out.print(plusArr[i][j] + " ");
            }
            System.out.println(); 
        }
	}

}
