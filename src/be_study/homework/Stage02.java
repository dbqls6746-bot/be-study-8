package be_study.homework;

public class Stage02 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "최원빈";
		p1.age = 18;
		System.out.println(p1.name + ", " + p1.age + "세");

		p1.hello();
		
		Person p2 = new Person();
		p2.name = "서정인";
		p2.age = 21;
		System.out.println(p1.age>p2.age ? p1.name : p2.name);
		
		Person p3 = new Person();
        Person p4 = p3;
        p3.name = "김준서";
        System.out.println(p4.name);
        
        Person[] group = new Person[3];
        group[0] = p1; 
        group[1] = p2; 
        group[2] = p4;
        for(Person p : group) 
        	System.out.println(p.name);
        
        for(Person p : group) {
        	System.out.println(p.name);
        }
	}
	public static void printName(Person p) {
		System.out.println(p.name);
	}
	
	public static Person returnPerson(String name, int age) {
		Person p = new Person();
		p.name = name;
		p.age = age;
		return p;
	}
	
	public static void addAge(Person p) {
		p.age++;
	}
	
	public static void callAllHellos(Person[] people) {
        for (Person p : people) {
            if(p != null) p.hello();
        }
    }
	
	public static Person Oldest(Person[] people) {
        Person oldest = people[0];
        for (Person p : people) {
            if (p != null && p.age > oldest.age) oldest = p;
        }
        return oldest;
    }
}
