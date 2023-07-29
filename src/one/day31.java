package one;

import java.util.ArrayList;

public class day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Person13 amol = new Person13("amol", "rao");
		Person13 amol1 = new Person13("amol1", "rao");
		Person13 amol2 = new Person13("amol2", "rao");
		Person13 amol3 = new Person13("amol3", "rao");
		Person13 amol4 = new Person13("amol4", "rao");

		ArrayList<Person13> students = new ArrayList<>();
		students.add(amol);
		students.add(amol1);
		students.add(amol2);
		students.add(amol3);
		students.add(amol4);

		students.get(0).display();

		// for

		for (int i = 0; i < students.size(); i++) {
			// System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();

		}

		// while loop
		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).display();
			t1++;
		}

		// forEach
		
		for(Person13 a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.display();
		}

	}

}

class Person13 {
	String firstName;
	String lastName;

	public Person13(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void display() {
		System.out.println(this.firstName + this.lastName);
	}

}
