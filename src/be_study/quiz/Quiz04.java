package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x=" + x + " y=" + y);
		System.out.println(x + y);
		System.out.println(x++ + y++);
		System.out.println("x=" + x + " y=" + y);

		z = ++x + ++y;
		System.out.println("x=" + x + " y=" + y);

		z--;
		x += --y;
		System.out.println("x=" + x + " y=" + y + " z=" + z);

		x = 10;
		z = x / y++;
		System.out.println("x=" + x + " y=" + y + " z=" + z);
		System.out.println("x=" + (x * 2) + " y=" + ++y + " z=" + z);
		System.out.println("x=" + x + " y=" + y + " z=" + z);

		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a < b) && (c >= a) );
		System.out.println( (a == b) || (a >= b) || (c > 10) );
		boolean result = !(c == 3);
		System.out.println( result );
		
//		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
//		6000원 이하 -> "훌륭"
//		6000원 초과 ~ 8000원 -> "선방"
//		8000원 초과 ~ 12000원 -> "눈물"
//		12000원 초과 -> "물로배채우기"

		int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result1 = menuPrice > 12000 ? "물로배채우기" : ( menuPrice > 8000 ? "눈물" : ( menuPrice > 6000 ? "선방" : "훌륭" ) );
		System.out.println( result1 );

	}

}
