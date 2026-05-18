package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		String[] menuArr = {"아메리카노", "카페라떼 ", "바닐라라떼"};
		int[] priceArr = { 3500, 4100, 4300};
		int[] countArr= new int[3];
		int menu = 0;
		
		while(true) {
			System.out.println("=======매뉴========" );
			for(int i=0; i<menuArr.length; i++) {
				System.out.println( (i+1) + "." + menuArr[i] + "   " + priceArr[i] + "원");
			}
			System.out.println("==================");
			
			System.out.print("메뉴선택 : ");
			int chs1 = scanner.nextInt();
			
			if(chs1<1 && chs1 > 3) {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}
			System.out.print("수량선택 : ");
			int chs2 = scanner.nextInt();
			
			countArr[chs1-1] += chs2;
			
			while (true) {
				System.out.print("추가주문하시겠습니까?[y/n] : ");
				String yn = scanner.nextLine();
				if(yn.equals("y")) {
					break;
				}else if(yn.equals("n")) {
					System.out.println("========================");
			        int total = 0;

			        for (int i = 0; i < menuArr.length; i++) {
			            if (countArr[i] > 0) {
			                int total2 = priceArr[i] * countArr[i];
			                System.out.println( menuArr[i] + countArr[i] + "잔 : " + total2 + "원");
			                total += total2;
			            }
			        }

			        System.out.println("========================");
			        System.out.printf("총액 : " + total+"원");
			        return;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
			
			
			}
		
	}
}

