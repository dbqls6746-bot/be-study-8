package be_study.inherit.inherit03;

public class BluetoohMike extends Mike {
	//블루투스 마이크는 마이크다
	boolean isConnected; //연결여부 상태
	int battery; //배터리 잔량
	
	//별도의 각자 필요한 메소드 확장
	public void connect() {
		//블루투스 연결합니다~
	}
	
	//기존에 있던 메소드 활용 -> check();
	
	//기존 메소드 업그레이드 (재정의)
//	private void volumeUp() {	메소드 재정의는 접근제한자 범위를 줄이면서 재정의 불가능		
//	}
	
	//재정의 메소드 오버라이딩
	public void volumeUp() {
		System.out.println("BluetoohMike volumeUp() 재정의");
	}
	
	//개별적으로 추가 선언 확장
	//메소드 오버로딩
	public void volumeUp(int v) {
		System.out.println(v + "만큼 불륨 증가 BluetoohMike volumeUp(int v) 재정의");
	}
	
	//부모클래스 final 메소드 재정의 불가능
//	public void noMethod() {
//	}
}
