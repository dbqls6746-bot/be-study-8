package be_study.coll;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		
		//List, Set, Map
		
		String s1 = "A";
		String s2 = "B";
		
		String[] sArr = new String[3];
		sArr[0] = "A";
		sArr[1] = "B";
		sArr[2] = "C";
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}
		System.out.println();
		
		for(String s : sArr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> list1 = new ArrayList<>();
		list1.add("D");
		list1.add("E");
		list1.add("F");

		for(int i=0;  i<list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		List<String> list2 = null;	//초기화 선언
		//list2.add("G");
		
		list1.add("G");
		
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		list1.add(2, "H"); //해당 인덱스 위치에 들어가고, 나머지는 뒤로 밀림
		list1.add(2, "I"); //해당 인덱스 값에 덮어씌기 저장(변경)
		
		
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		list1.remove(0);
		list1.remove("H");
		
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//---------------------------------------------------
		
		int n1 = 10;
		int n2 = 20;
		int[] nArr = new int[5];
		
		//List 는 객체타입 (참조)
		//List<int> list3 = new ArrayList<int>();  XXX불가능
		
		//포장객체 포장클래스	 Wrapper Class
		
		// int Integer		Integer.parseInt()
		// double Double
		// boolean Boolean
		
		List<Integer> list3 =  new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		
		System.out.println(list3.size());
		System.out.println(list3.isEmpty());
		
		// return null, 비어있는 리스트를 return
		
		System.out.println(list3.contains(40));
		System.out.println(list3.contains(50));
		
		
		for(Integer n : list3) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
