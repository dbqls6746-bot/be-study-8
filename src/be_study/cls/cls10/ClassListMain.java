package be_study.cls.cls10;

import java.util.ArrayList;

import be_study.cls.cls09.Temp09;

public class ClassListMain {

	public static void main(String[] args) {
		// ArrayList<저장할타입>	클래스 객체 타입
		
		Temp09 t1 = new Temp09();
		
		Temp09[] tArr = new Temp09[3];
		tArr[0] = new Temp09();
		tArr[1] = new Temp09();
		tArr[2] = new Temp09();
		
		//tArr[3] = new Temp09();
		
		ArrayList<Temp09> tList = new ArrayList<Temp09>();
		
		tList.add(new Temp09());
		tList.add(new Temp09());
		tList.add(new Temp09());
		tList.add(new Temp09());
		
		for (int i=0; i<tList.size(); i++) {
			System.out.println(tList.get(i));
			//	tList : 리스트
			//  tList.get(i) : Temp09 객체
			// 	tList.get(i).num : Temp09 객체안에 들어있는 필드변수 num
			tList.get(i).method();
		}
		System.out.println();
		
		for(Temp09 t : tList) {
			System.out.print(t.num + " ");
			t.method();
		}
		System.out.println();
		
		printList(tList);
		
		ArrayList<Temp09> resultList = generateList();
		printList(resultList);
	}

	public static void printList(ArrayList<Temp09> tList) {
		System.out.println("---printList start---");
		for(Temp09 t : tList) {
			System.out.print(t.num + " ");
			t.method();
		}
		System.out.println();
		System.out.println("---printList end---");
	}
	
	// ArrayList<Temp09> var = null;
	public static ArrayList<Temp09> generateList() {
		
		ArrayList<Temp09> list = null;
		list = new ArrayList<Temp09>();
		
		list.add(new Temp09());
		
		Temp09 t= new Temp09();
		t.num = 10;
		
		list.add(t);
		
		return list;
		//return null;
	}
}
