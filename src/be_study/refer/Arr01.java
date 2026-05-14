package be_study.refer;

public class Arr01 {

	public static void main(String[] args) {
		
		// Array 배열
		
		//시험 5번
		
		int score1 = 100;
		int score2 = 50;
		int score3 = 75;
		int score4 = 80;
		int score5 = 40;
		
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		
		double avg = sum / 5.0;
		
		System.out.println("총점 : " + sum + " 평균 : " + avg);
		
		sum = sum + score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		
		//점수1
		//점수2
		
		//시험본 점수들~
		//score
		// scores scoreArray scoreArr
		int[] scoreArr = { 100, 50, 75, 80, 40 }; //배열 값 초기화;
		// index			  0	  1	 2   3   4 
		
		sum = 0;
		sum = scoreArr[0] + scoreArr[1] + scoreArr[2] + scoreArr[3] + scoreArr[4];
		avg = sum / 5.0;
		System.out.println("총점 : " + sum + " 평균 : " + avg);
		
		sum = sum + scoreArr[0];
		sum = sum + scoreArr[1];
		sum = sum + scoreArr[2];
		sum = sum + scoreArr[3];
		sum = sum + scoreArr[4];
		
		//배열의 길이 5
		//index: 0 1 2 3 4
		sum = 0;
		for(int i=0; i<5; i++) {	//i : 0 1 2 3 4		| 5
			sum = sum + scoreArr[i];
		}
		avg = sum / 5.0;
		System.out.println("총점 : " + sum + " 평균 : " + avg);
		
		
		//배열 생성
		
		int n;
		int[] menuArr;	//단순 선언;
		
		int n2 = 0;
		int [] pointArr = null;	// null값 초기화
		// pointArr = { 30, 20, 10, 5, 1,}; 불가능
		// 애초에 생성하는 시점에 써야 사용가능 int [] pointArr = { 30, 20, 10, 5, 1,};
		
		pointArr = new int[]{ 30, 20, 10, 5, 1,};
		pointArr = new int[5];	//사이즈 명시로 생성 -> 5개 공간
		
		n = 30;
		n = n + 5;
		
		pointArr[2] = 10;	//point[2] : pointArr 배열의 2인덱스 위치에 있는 int 변수
		//pointArr = 20;	//pointArr : 5개 공간의 주소를 참조하고 있는 참조타입변수 !! -> 불가능
		
		//index 0~ 0 1 2 3 4 5칸
		pointArr[0] = 30;
		pointArr[1] = 20;
		pointArr[2] = 10;
		pointArr[3] = 5;
		pointArr[4] = 1;
		// pointArr[5] = 500;	인덱스 범위 벗어남
		
		
		//저장하고 싶은 값 : 1 2 3 4 5	+1 차이
		//배열의 인덱스 값 : 0 1 2 3 4
		
		for(int i=0; i<5; i++) {	//인덱스 기준 : 0 1 2 3 4
			pointArr[i] = i+1;
		//	pointArr[0] = 0+1; 1
		//	pointArr[0] = 0+1; 2
		}
		
		for(int i=1; i<=5; i++) { 	//값 기준 : 1 2 3 4 5
//			pointArr[i-1] = i;
//			pointArr[1-1] = 1;
//			pointArr[2-1] = 2;
//			...
//			pointArr[5-1] = 5;
		}
		
		//배열에 접근해서 출력	배열 인덱스 0~
		
		for(int i=0; i<5; i++) {
			System.out.print(pointArr[i] + " ");
		}
		System.out.println();
		
		System.out.println(pointArr);   //참조변수 주소값
		
		
		// 초기값 확인
		
		int[] intArr = new int[6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[14];
		
		//for(int i=0; i<6; i++) {
		for(int i=0; i< intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		//for(int i=0; i<12; i++) {				//배열인덱스 : 배열길이 - 1
		for(int i=0; i<doubleArr.length; i++) { //배열길이 12 인덱스 0~11
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println();
		
		//for(int i=0; i<30; i++) {
		for(int i=0; i<stringArr.length; i++) {
			System.out.print(stringArr[i] + " ");
		}
		System.out.println();
		
		//for(int i=0; i<14; i++) {
		for(int i=0; i<booleanArr.length; i++) {
			System.out.print(booleanArr[i] + " ");
		}
		System.out.println();
		
		
	}

}
