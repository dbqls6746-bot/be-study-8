package be_study.quiz.quiz38;

public abstract class Unit {
	int x, y;

	public void stop() {
		System.out.println("제자리에 정지합니다");
	}

	public abstract void move(int x, int y);
}

class Marine extends Unit { // 보병
	public void move(int x, int y) {
		System.out.println("보병이 지정된 위치까지 걸어서 이동합니다.");
		this.x = x;
		this.y = y;
	}

	public void stimPack() { /* . */
		System.out.println("마린이 스팀팩을 사용합니다.");
	} // 스팀팩을 사용한다
}

class Tank extends Unit { // 탱크
	public void move(int x, int y) {
		System.out.println("탱크가 지정된 위치까지 바퀴를 구릅니다.");
		this.x = x;
		this.y = y;
	}

	public void changeMode() { /* . */
		System.out.println("탱크가 공격모드로 변환합니다.");
	} // 공격모드를 변환한다
}

class Dropship extends Unit { // 수송선

	public void move(int x, int y) {
		System.out.println("수송선이 지정된 위치까지 날아갑니다.");
		this.x = x;
		this.y = y;
	}

	public void load() { /* . */
		System.out.println("수송선이 선택된 대상을 태웁니다");
	} // 선택된 대상을 태운다

	public void unload() { /* . */
		System.out.println("수송선이 선택된 대상을 내립니다.");
	}// 선택된 대상을 내린다
}