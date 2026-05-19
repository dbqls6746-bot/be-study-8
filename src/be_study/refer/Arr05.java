package be_study.refer;

public class Arr05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<5; i++) {	//변수 i : index 역할
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		for(int v : arr) {	// {10, 20, 30, 40, 50};
			
			// 배열 전체 갯수만큽 처음부터 끝까지 다 반복
			// v: 값이 주어진다.  값을 바로 주입하고, 현재 인덱스는 모름
			
			// index++;
			// index ==		break;
			
			System.out.print(v + " ");
		}
		System.out.println();
		
		int index = 0;
		for(int v : arr) {	// {10, 20, 30, 40, 50};
			
			//if(index==3) break;
			
			System.out.println("index : " + index + " 값 : " + v + " ");
			index++;
		}
		System.out.println();
		
		
		int[] scores = {90, 95, 100, 85, 80};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		sum = 0;
		//index
		for(int s : scores) {
			sum = sum + s;
			//index++
			//if(index==숫자) break;
		}
		System.out.println(sum);
		
		//scores 에 있는 모든 점수 -5점 감점
		
		for(int i=0; i<5; i++) {
			scores[i] = scores[i] - 5;
		}
		
//		for(int s : scores) {
//			s = s - 5;
//		}
		
		// 출력용
		for(int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
