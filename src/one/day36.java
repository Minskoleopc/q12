package one;

import java.util.Arrays;
import java.util.List;

public class day36 {

	public static void main(String[] args) {

		Employee[] employees = {

				new Employee(1, "chinmay deshpande", 100), new Employee(1, "amolrao", 10000),
				new Employee(1, "sarika pansare", 100000)

		};

//		for(int i = 0 ; i < employees.length;i++) {
//			employees[i].displayFullName();
//		}

		List<Employee> emplist = Arrays.asList(employees);

		// forEach()

		emplist.stream().forEach(emp -> emp.incrementSalary(10));

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);
		}

		// filter()

		// map()

	}

}

class Employee {

	int id;
	String fullName;
	int salary;

	public Employee(int id, String fn, int sy) {

		this.id = id;
		this.fullName = fn;
		this.salary = sy;

	}

	public void displayFullName() {
		System.out.println(this.fullName);
	}

	public void incrementSalary(int x) {
		this.salary = this.salary + x;
		// this.salary += x;
	}

}