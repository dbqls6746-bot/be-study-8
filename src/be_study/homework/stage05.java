package be_study.homework;

import java.util.Arrays;

public class stage05 {
	public static Person[] manyPeople() {
		Person[] arr = new Person[3];
		for(int i=0; i<3; i++) {
			arr[i] = new Person();
            arr[i].name = "최유빈" + i;
            arr[i].age = 20 + i;
		}
		return arr;
	}
	
	public static void sayHelloAll(Person[] people) {
        for (Person p : people) {
            if (p != null) p.hello();
        }
    }

   public static void insertPerson(Person p, Person[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = p;
        }
    }

 
   public   static Person[] sortAge(Person[] people) {
        Person[] sorted = Arrays.copyOf(people, people.length);
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j] != null && sorted[j+1] != null) {
                    if (sorted[j].age > sorted[j+1].age) {
                        Person temp = sorted[j];
                        sorted[j] = sorted[j+1];
                        sorted[j+1] = temp;
                    }
                }
            }
        }
        return sorted;
    }

   
    public static void mutatePerson(Person p) {
        if (p != null) {
            p.name = "MutatedName";
            p.age = 99;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Original";
        p.age = 10;
        
        System.out.println("Before: " + p.name + ", " + p.age);
        mutatePerson(p);
        System.out.println("After: " + p.name + ", " + p.age);
    }
	
}
