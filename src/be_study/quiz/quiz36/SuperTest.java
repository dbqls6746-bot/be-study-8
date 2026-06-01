package be_study.quiz.quiz36;

public class SuperTest {
public static void main(String[] args) {
/* 1. Orc 객체를 만들고 정보를 출력하시오. */
	Orc o1 = new Orc("오크,", 37);
	System.out.println(o1.toString());
/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
	OrcWarrior ow1 = new OrcWarrior("오크전사", 50, 30);
	System.out.println(ow1.toString());
}
}

class Orc {
protected String name;
protected int hp;

public Orc(String name, int hp) {
this.name = name;
this.hp = hp;
}

public String toString() {
return "이름 :" + name + " hp : " + hp ;
}
}

class OrcWarrior extends Orc {
protected int amor;

public OrcWarrior(String name, int hp, int amor) {
super(name, hp);
this.amor = amor;
}

// 메소드 오버라이딩!
public String toString() {
return "이름 :" + name + " hp : " + hp +" 방어력: " + amor;
}
}