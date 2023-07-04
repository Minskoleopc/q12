package one;

public class day20R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentB ninad = new StudentB();
		System.out.println(ninad.firstName);
		System.out.println(ninad.lastName);
		System.out.println(ninad.ssn);
		ninad.displayName();
		
		
		
		TeacherB ninadb = new TeacherB();
		System.out.println(ninadb.salary);
		System.out.println(ninadb.firstName);
		System.out.println(ninadb.lastName);
		System.out.println(ninadb.ssn);
		
		ninadb.displaySalary();
		ninadb.displayName();
		
	}
	
	
	

}

class StudentB {
	String firstName = "chinmay";
	String lastName = "deshpande";
	int ssn = 123;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherB  extends StudentB{
	int salary = 1000;
	public void displaySalary() {
		System.out.println(this.salary);
	}
}




