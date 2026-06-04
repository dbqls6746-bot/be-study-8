package be_study.quiz.quiz42.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	List<Food> menuList = new ArrayList<>();
	int sales = 0;
	
	public void addMenu(Food food) {
		menuList.add(food);
	}
	
	public void addStock(int menuNum, int amount) {
		int index = menuNum - 1;
		if (index >= 0 && index < menuList.size()) {
			Food f = menuList.get(index);
			f.addStock(amount);
			System.out.println("[재고 조정 적용]");
			System.out.println(f.name + " : " + f.price + "원 (잔여재고:" + f.stock + ")");
		} else {
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public void showMenu() {
		System.out.println("------[Menu]-------");
		for (int i = 0; i < menuList.size(); i++) {
			Food f = menuList.get(i);
			System.out.println("[" + (i + 1) + "] " + f.name + " : " + f.price + "원 (잔여재고:" + f.stock + ")");
		}
	}
	
	public void order(int menuNum, int amount) {
		int index = menuNum - 1;
		if (index >= 0 && index < menuList.size()) {
			Food f = menuList.get(index);
			
			if (f.stock >= amount) {
				this.sales += (f.price * amount);
				f.reduceStock(amount);
				return;
			} else {
				System.out.println("주문하신 상품의 재고가 없어 주문할 수 없습니다! (현재재고:" + f.stock + "개)");
			}
		} else {
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	public void closeTruck() {
		System.out.println("========[영업 마감]=========");
		int closeSales = this.sales;
		int totalLoss = 0;
		for(Food f : menuList) {
			if (f.stock > 0) {
				int loss = (int)(f.stock*f.price*0.3);
				sales -= loss;
				totalLoss += loss;
				System.out.println(">>> " + f.name + " 폐기 손해 : -" + loss + "원");
			}
		}
		System.out.println("------[마감 정보]--------");
		System.out.println(">>> 총매출액 : " + closeSales + "원");
		System.out.println(">>> 원가차감 : " + totalLoss + "원");
		System.out.println(">>> 최종수익 : " + sales + "원");
	}
	
}
