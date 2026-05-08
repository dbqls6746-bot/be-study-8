package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
//		1. 아래 1), 2) 에 맞게 풀이.
	int x = 10;
	int y = 4;
	int result = x/y;
	double result1 = (double)x/y;
	System.out.println(result);
	System.out.println(result1);

//	1) 결과가 2가 나오도록 작성하세요
//	2) 결과가 2.5가 나오도록 작성하세요
//
//	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result3 = a + (int)b;
	System.out.println(result3);
//
//	3. 계산결과가 12가 나오도록 작성하세요
	String c = "3.4";
	String d = "4";
	double c1 = Double.parseDouble(c);
	int d1 = Integer.parseInt(d);
	int result4 = (int)c1 * d1;
	System.out.println(result4);
//
//	----------------------------------------------------
//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String e = "10";
	int f = 3;
	double g = 4.5;
	int result5 = (int) (f * g);
	System.out.println(e + result5);
//
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int h = 4;
	double i = 3.4;
	String j = "6.8";
	double j1 = Double.parseDouble(j);
	int i1 = (int)i; 
	String i2 = String.valueOf(i1);
	int result6 = h * (int)j1;
	System.out.println(result6+i2);
//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int s = 111;
	int t = 13;
	int result10 = s%t;
	System.out.println(result10);
	
	result10 = s/t;
	System.out.println(result10);

//
//	1) 출력결과 : 7
//	2) 출력결과 : 8 
	}

}
