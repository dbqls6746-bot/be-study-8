package be_study.homework;

public class stage03 {
	public static Person[] personArray(int length) {
		return new Person[length];
	}
	
	public static int sumAge(Person[] people) {
        int sum = 0;
        for (Person p : people) {
            if (p != null) sum += p.age;
        }
        return sum;
    }
	
	public static void resetAge(Person[] people) {
        for (Person p : people) {
            if (p != null) p.age = 10;
        }
    }
	
	public static String[] extractNames(Person[] people) {
        String[] names = new String[people.length];
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) names[i] = people[i].name;
        }
        return names;
    }
	
	public static void main(String[] args) {
        Person[] arr = new Person[5];
        arr[0] = new Person();
        
        for (Person p : arr) {
            if (p != null) System.out.println(p.name);
        }
    }
	
	public static Person findByName(Person[] people, String targetName) {
        for (Person p : people) {
            if (p != null && targetName.equals(p.name)) 
            	return p;
        }
        return null;
    }
	
	public static Person[] createEvenIndexPersons(int length) {
        Person[] arr = new Person[length];
        for (int i = 0; i < length; i += 2) {
            arr[i] = new Person();
        }
        return arr;
    }
	
	public static Person copyName(Person original) {
        Person copy = new Person();
        copy.name = original.name;
        return copy;
    }
	
	public static Person[] filterAge(Person[] people) {
        int count = 0;
        for (Person p : people) {
            if (p != null && p.age >= 30) count++;
        }
        Person[] result = new Person[count];
        int idx = 0;
        for (Person p : people) {
            if (p != null && p.age >= 30) result[idx++] = p;
        }
        return result;
    }
}

