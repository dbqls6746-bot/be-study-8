package be_study.quiz.quiz42.v3설명버전;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	String truckName; //트럭이름
	int totalSales; //총매출액
	boolean isOpened; //영업중 여부
	
	//푸드트럭이 판매하는 메뉴들
	List<Food> menuList;
	
	
	public FoodTruck() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		menuList = new ArrayList<Food>();
	}
	
	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		menuList = new ArrayList<Food>();
	}
	
	//판매 메뉴로 추가하고 싶은 food 객체 추가
	public void addFood(Food food) {
		menuList.add(food);
	}
	
	public void addFood(String name, int price, int stock) {
		Food food = new Food(name, price, stock);
		menuList.add(food);
	}
	
	//판매 관련 로직
	
	public void startSales() { //영업시작
		
		//처리 로직
		
		isOpened = true; //영업 상태로 전환
		System.out.println("=======["+ truckName + "영업 시작 ]======");
		
		Scanner scanner = new Scanner(System.in);
		while(isOpened) {
			// 메뉴 보여주고
			System.out.println("***[메뉴 선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>>입력 : ");
			
			// 메뉴 선택하고
			int menuInput = scanner.nextInt();
			
			//필터 ( 1 ~ 4)
			
			// 선택 메뉴에 따라서 기능 수행
			
//			if (menuInput == 1) {
//			} else if(menuInput ==2) {}
			
			switch (menuInput) {
			 case 1: //메뉴선택
				 
				 // 리스트 인덱스 : 0 1 2 3...
				 // 사용자 메뉴번호 : 1 2 3 4 ...
				 System.out.println();
				 System.out.println("------[Menu]-------");
				 for (int i = 0; i < menuList.size(); i++) {
//					    System.out.printf("[%d]. %s %d원 (잔여재고:%d)\n",(i+1), menuList.get(i).name,menuList.get(i).price, menuList.get(i).stock);
//					
//				 Food f = menuList.get(i);
//				 System.out.printf("[%d]. %s %d원 (잔여재고:%d)\n",(i+1), menuList.get(i).name,menuList.get(i).price, menuList.get(i).stock);
				 System.out.printf("[%d]. %s\n", (i+1), menuList.get(i).getFoodInfo());
				 
				 }
				 break;
				 
			 case 2://주문하기
				 
				 //메뉴를 보여주기
				 System.out.println();
				 System.out.println("------[Menu]-------");
				 for (int i = 0; i < menuList.size(); i++) {
					 System.out.printf("[%d]. %s\n", (i+1), menuList.get(i).getFoodInfo()); 
				 }
				 
				
				 //주문 메뉴 번호 받기
				 System.out.print(">>> 주문 메뉴 번호 입력 :");
				 int orderMenu = scanner.nextInt();
				 
				 //입력한 주문 메뉴 번호	보유한 메뉴 리스트 숫자 범위
				 // 메뉴 3개 1 2 3 	4입력? -> 잘못 입력~
				 
				 
				 //주문 수량 --->생략 ->1개 주문 가정
				 int orderMenuIndex = orderMenu - 1;
				 
				 //주문메뉴 재고슈량 - 수량
				 //주문메뉴 금액만큼 매출액 증가
				 //재고슈량 부족하면 품절..주문 불가
				 
				
				 
				 int orderCount = 1; //주문수량
				 
				// if(menuList.get(orderMenuIndex).stock > 0) {
				if(menuList.get(orderMenuIndex).stock >= orderCount) {
					 
					 menuList.get(orderMenuIndex).modifyStock(-1); //재고 1개 감소
					 totalSales += menuList.get(orderMenuIndex).price; //매출액 증가
					 System.out.printf("[주문정보] %s 메뉴 %d개 주문완료!\n", menuList.get(orderMenuIndex));
				 } else {
					 System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
				 }
				 break;
				
			 case 3: //재고관리
				 
				 //각 메뉴별로 재고 수량 조정
				 
				 // 메뉴 보여주기
				 System.out.println();
				 System.out.println("------[Menu]-------");
				 for (int i = 0; i < menuList.size(); i++) {
					 System.out.printf("[%d]. %s\n", (i+1), menuList.get(i).getFoodInfo()); 
				 }
				// 재고 조정할 메뉴 선택
				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				// 조정할 재고 개수 입력
				int input = scanner.nextInt();
				System.out.print(">>> 재고 조정할 개수를 입력 :");
				int inputStockCount = scanner.nextInt();
				
				//몇번인덱스 위치에 잇는 메뉴를 재고 조정해라
				menuList.get(input - 1).modifyStock(inputStockCount);
				System.out.println("[재고 조정 적용]");
				System.out.println(menuList.get(input - 1).getFoodInfo());
				System.out.println();
				break;
				
			 case 4 : //마감하기
				 
				 System.out.println();
				 System.out.println("=====[영업마감]======");
				 
				 isOpened = false;
				 
				 //매출
				 //남은재고 원가 차감 계산 (판매금액의 30%)
				 
				 //재고남은 메뉴 -> 메뉴의 가격 * 30% * 남은재고수량
				 int lossSales = 0;
				 for(Food food : menuList) {
					 lossSales += (food.price * 0.3 * food.stock);
				 }
				 
				 System.out.println("------[마감정보]------");
				 System.out.println(">>> 총매출액 : " + totalSales);
				 System.out.println(">>> 원가차감 : " + lossSales);
				 System.out.println(">>> 최종수익 : " + (totalSales - lossSales));
				
				 break;
				 
				//새로운 메뉴 입력받아서 추가 // 5. 메뉴관리
			}
			
		}
	}
}
