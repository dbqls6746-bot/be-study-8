package be_study.inherit.Inherit07;

public class Bus extends Vehicle {
	public void run() {
		System.out.println("Bus 버스가 달립니다.");
	}
	
	//이미 부모 Object에 존재 메소드
	//	재정의
	// 메소드 접근제한자를 좁은 범위로 줄일 수 없다.
	//private String toString() { XXX
	public String toString() {
		return "BusBus";
	}
}
