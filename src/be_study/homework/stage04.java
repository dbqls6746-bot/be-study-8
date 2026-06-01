package be_study.homework;

public class stage04 {
	public static void printIntArray(int[] arr) {
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
	public static void printPersonArray(Person[] arr) {
        for (Person p : arr) {
            if (p != null) System.out.print(p.name + " ");
        }
        System.out.println();
    }

	public static void printCombined(Person[] pArr, int[] iArr) {
        int len = Math.min(pArr.length, iArr.length);
        for (int i = 0; i < len; i++) {
            if(pArr[i] != null) {
                System.out.println(pArr[i].name + " -> " + iArr[i]);
            }
        }
    }

	public static int[] extractAges(Person[] people) {
        int[] ages = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) ages[i] = people[i].age;
        }
        return ages;
    }

    
	public static Person[] convertPersons(int[] ages) {
        Person[] people = new Person[ages.length];
        for (int i = 0; i < ages.length; i++) {
            people[i] = new Person();
            people[i].age = ages[i];
        }
        return people;
    }


	public static Person clonePerson(Person p) {
        Person clone = new Person();
        clone.name = p.name;
        clone.age = p.age;
        return clone;
    }


	public static Person[] deepCopy(Person[] original) {
        Person[] copy = new Person[original.length];
        for (int i = 0; i < original.length; i++) {
            if (original[i] != null) {
                copy[i] = clonePerson(original[i]);
            }
        }
        return copy;
    }

	public static void printNullNames(Person[] people) {
        for (Person p : people) {
            if (p != null && p.name == null) {
                System.out.println("Age: " + p.age + " (Name is null)");
            }
        }
    }

	public static Person[] copyWithNewLength(Person[] original, int newLength) {
        Person[] copy = new Person[newLength];
        int len = Math.min(original.length, newLength);
        for (int i = 0; i < len; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

	public static void resetPerson(Person p) {
        if(p != null) {
            p.name = null;
            p.age = 0;
        }
    }
	
	public static void compareAge(int targetAge, Person p) {
        if(p != null) {
            System.out.println("Target: " + targetAge + ", Person Age: " + p.age);
            System.out.println("Difference: " + Math.abs(targetAge - p.age));
        }
    }
}
