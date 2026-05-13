package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
//		* 윤년이란?
//				지구가 태양을 한 번 공전하는 데 걸리는 시간을 일 년으로 두었는데,
//				사실은 그 시간이 365일이 아닌 365일 5시간 49분 가량이다.
//				일 년에 5시간 49분씩 4 년이 지나면 약 하루가 되는데,
//				이를 맞추기 위해 4 년마다 한 번씩 2월을 하루 늘리고 이를 윤년이라 한다.
//				단, 이렇게 계산하게 되면 매년 11분 가량이 초과되어 계산된다.
//				이는 131년이 지나면 하루(대략 400년에 3일)가 되기 때문에 대부분의 국가에서 반영하는
//				그레고리력에서는 400년에 3일을 제외시키기 위해 100년마다 한 번 윤년을 없애고
//				400년 마다 다시 하루를 추가해 윤년을 둔다. 정리하면 다음과 같은 방법으로 윤년을 계산할 수 있다.
//
//				☞ 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...
//				☞ 연도가 100으로 나누어 떨어지면 윤년이 아니다. ex) 2100년, 2200년, 2300년, ...
//				☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...
//
//				예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다.
//
//				년도를 입력받아서 윤년인지 아닌지의 여부를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		int sum = year % 4;
		
		int sum1 = year % 100;
		
		int sum2 = year % 400;
		
		if ( sum == 0 && sum1 != 0 ) {
			System.out.println(year + "년은 윤년입니다");
		} else if ( sum2 == 0) {
			System.out.println(year + "년은 윤년입니다");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다");
		}
	}

}

