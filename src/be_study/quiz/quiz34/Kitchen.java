package be_study.quiz.quiz34;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

//	주방공간
//	- 공간이 몇평인지
//	- 벽지색상이 어떤지
//	- 층고가 얼마나 되는지
	
	double area;
	String wallColor;
	double floorHeight;
	
//	주방을 꾸미려고 한다.
//	아래 개념에 맞춰서 클래스를 만들고 각각 필요에 따라 필드변수와 메소드가 필요하다면?
//	(각 메소드의 내부 기능 구현이 정확하게 안되어도, 선언만 있어도 인정합니다.)
//	어떤 식의 구성으로 만들수 있을지 작성해보시오.
//	(*구성부품 여부등 클래스들과의 관계 고려)

	Refrigerator refrigerator;
	GasRange gasRange;
	Sink sink;
	
	List<Wastebasket> wastebaskets;
	List<Cup> cups;
	
	public Kitchen(double area, String wallColor, double floorHeight) {
		this.area =area;
		this.wallColor = wallColor;
		this.floorHeight = floorHeight;
		
		this.wastebaskets= new ArrayList<>();
		this.cups= new ArrayList<>();
	}
	
	public void setRefrigerator(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}
	
	public void setGasRange(GasRange gasRange) {
		this.gasRange = gasRange;
	}
	
	public void setSink(Sink sink) {
		this.sink = sink;
	}
	
	public void addWastebasket(Wastebasket wastebasket) {
		this.wastebaskets.add(wastebasket);
	}
	
	public void addCup(Cup cup) {
		this.cups.add(cup);
	}
}
