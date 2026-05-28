package be_study.quiz.quiz34;

public class Refrigerator {
//	냉장고
//	- 어느 브랜드인지
//	- 몇리터 짜리인지
//	- 전원을 켤수 있다
//	- 온도조절을할수있다(온도 up 또는 온도 down)
//	- 문이 몇개인지
	
	String brand;
	double liter;
	boolean hasPowerOn;
	int temperature;
	int maxTemperature;
	int minTemperature;
	int doorCount;
	boolean hasControlFire;
	IceTray iceTray;
	
	boolean isPowerOn;
	
	public void turnOn() {
		isPowerOn = true;
	}
	
	public void turnOff() {
		isPowerOn = false;
	}
	public void temperatureUp() {
		if(temperature<maxTemperature) {
		temperature++;
		}
	}
	
	public void temperatureDown() {
		if(temperature>minTemperature) {
			temperature--;
			}

	}
}
