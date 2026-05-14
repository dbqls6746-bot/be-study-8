package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 while(true){
			 System.out.println("1. 입력");
				System.out.println("2. 수정");
				System.out.println("3. 조회");
				System.out.println("4. 삭제");
				System.out.println("5. 종료");
				System.out.print("   메뉴 번호를 입력하세요 : ");
				int select = scanner.nextInt();
		 	if (select == 1) {
		 		System.out.println("입력 메뉴입니다");
		 	} else if (select == 2 ) { 
		 		System.out.println("수정 메뉴입니다");
		 	}else if (select == 3 ) { 
		 		System.out.println("조회 메뉴입니다");
		 	}else if (select == 4 ) { 
		 		System.out.println("삭제 메뉴입니다");
		 	}else if (select == 5 ) { 
		 		System.out.println("프로그램이 종료됩니다");
		 		break;
		 	}else {
		 		System.out.println("잘못 입력하셨습니다");
		 	}
		 	
		 }
		 /*
		  String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};
		  
		  int menu = 0;
		  
		  while( menu != 5 ) {
		  
		  	for(int i=0; i<menuArr.length; i++) {
		  	System.out.println( (i+1) + ". " + menuArr[i] );
		  	
		  	System.out.print("   메뉴 번호를 입력하세요 : ");
				int menu = scanner.nextInt();
				
			if (select >= 1 && menu <= 4) {
		 		System.out.println( menuArr[menu-1] + " 메뉴입니다.");
		 	} else if (select == 5 ) { 
		 		System.out.println("프로그램이 종료됩니다");
		 	}else {
		 		System.out.println("잘못 입력하셨습니다");
		 	}
		  */
	}

}
