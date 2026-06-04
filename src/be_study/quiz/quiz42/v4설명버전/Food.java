package be_study.quiz.quiz42.v4설명버전;

public class Food {
	String name; //음식이름
	int price;	//가격
	int stock; //재고
	
	//public Food() {}	// new Food()
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 0;
		
		//this.stock = 5; //임의로 5개인거로 가정
	}
	
	public Food(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;	//재고가 정해진 상태로 시작
	}
	
	//재고 세팅(설정)	//기본 Setter 역할
	
	//1. 정해진 값으로 세팅
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//2. 재고조정/변경
	// 주문 -> 재고 -1
	// 재료준비 -> 재고 UP -> 재고 +5
	
	// upStock downStock
	public void modifyStock(int count) { 
		//modifyStock(+5)	modifyStock(-3)
		
		if( stock + count < 0) {
			stock = 0;
		}else {
			this.stock += count;
		}
	}
	
	//Food 자체 정보를 정리해서 String 변환
	//public String toString() {
	public String getFoodInfo() {
		return String.format("%6s %5d원 (잔여재고:%d)", name, price, stock);
	}
	
}
