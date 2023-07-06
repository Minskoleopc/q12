package one;

public class day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student chinmay = new Student();
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.age);
		
		chinmay.age = 10;
		chinmay.firstName = "chinmay";
		chinmay.lastName = "deshpande";
		
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.age);
		chinmay.displayName();
	
		
		// Creating object of TeacherA
		
		
		TeacherA a = new TeacherA();
		System.out.println(a.salary);
		
		a.firstName = "chinmay a";
		a.lastName = "deshpande d";
		a.age = 34;
		a.salary = 1000;
			
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.age);
		
	
		a.displaySalary();
		a.displayName();
		
		
	}

}


class Student {
	
	
	String firstName;
	String lastName ;
	int age ;
	
	public  void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
	
	
}

class TeacherA extends Student {	
	
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
}




