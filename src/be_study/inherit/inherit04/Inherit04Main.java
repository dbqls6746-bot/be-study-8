package be_study.inherit.inherit04;

import java.util.ArrayList;
import java.util.List;

import be_study.inherit.inherit03.BluetoohMike;
import be_study.inherit.inherit03.Mike;
import be_study.inherit.inherit03.WirelessMike;

public class Inherit04Main {

	public static void main(String[] args) {
		
		//타입변환
		//메소드재정의
		//다형성
		
		int n = 10;
		double d = 10.5;
		double d2 = 50;
		
		Mike m1 = new Mike(); //마이크 타입 = 마이크 객체
		BluetoohMike bm1 = new BluetoohMike();	 //블투마이크 타입 = 블투마이크 객체
		WirelessMike wm1 = new WirelessMike();	//무선마이크 타입 = 무선마이크 객체
		
		m1.volumeUp();
		bm1.volumeUp();
		wm1.volumeUp();
		
		//부모타입 변수 = 자식타입 객체
		Mike m2 = bm1;
		Mike m3 = wm1;
		
		Mike m4 = new BluetoohMike();
		Mike m5 = new WirelessMike();
		
		//BluetoohMike bm2 = new Mike();		//자식타입 변수 = 부모타입 객체  불가능
		//BluetoohMike bm2 = new WirelessMike();  //다른타입 변수 = 다른타입 객체 불가능
		
		m4.volumeUp();
		m5.volumeUp();
		m5.check();
		
		
		//다형성
		int a = 10;
		int b = 20;
		int c = 30;
		int[] intArr = {10,20,30}; //한번에 관리 배열	같은 타입
				//int t = 10;	int t = 20; int t = 30;
		
		BluetoohMike[] bArr = {bm1, new BluetoohMike(), new BluetoohMike()};
		
		Mike[] arr = {m1, bm1, wm1};
		Mike[] arr2 = { new Mike(), new BluetoohMike(), new WirelessMike() };
			//Mike m = new Mike()
			//Mike m = new BluetoohMike()
			//Mike m = new WirelessMike()
		Mike[] arr3 = new Mike[3];	//공간만 선언
		arr3[0] = new Mike();
		arr3[1] = new BluetoohMike();
		arr3[2] = new WirelessMike();
		
		ArrayList<Mike> mList = new ArrayList<Mike>();
		mList.add(new Mike());
		mList.add(new BluetoohMike());
		mList.add(new WirelessMike());
		
		for(Mike m : mList) {
			m.volumeUp();
		}
		
		List<Mike> mList2 = new ArrayList<Mike>();
	}

}
