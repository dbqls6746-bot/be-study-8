package be_study.quiz.quiz42.v2;

public class Food {
	String name;	//이름
	int price;	//가격
	int stock; //재고
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 0;
	}
	
	
	public void addStock(int amount) {
		stock += amount;
	}
	
	public void reduceStock(int amount) {
		stock -= amount;
	}
}
