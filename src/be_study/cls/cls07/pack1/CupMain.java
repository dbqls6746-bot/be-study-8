package be_study.cls.cls07.pack1;

import java.util.Scanner; //다른 패키지 경로에 있는 클래스를 사용하기 위해서 import

public class CupMain {

	public static void main(String[] args) {
		
		Cup c1 = new Cup();
		c1.method();
		
		be_study.cls.cls07.pack1.Cup c2 = new be_study.cls.cls07.pack1.Cup();
		c2.method();
		
		Cup c3 = new Cup();
		be_study.cls.cls07.pack1.Cup c4 = new be_study.cls.cls07.pack1.Cup();
		c4.type="유리컵";
		
		//클래스명의 풀네임은 페키지경로+클래스명
		
		//Scanner scanner = new Scanner(System.in);
		//패키지 포함 풀네임
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		be_study.cls.cls07.pack2.Cup c5 = new be_study.cls.cls07.pack2.Cup();
		//c5.type = "플라스틱"; default 접근 다른 패키지 접근 불가
		c5.method();
		c5.type = "플라스틱"; //public 접근제한자로 변경되면 접근 가능
	}

}
