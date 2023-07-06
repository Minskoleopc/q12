package one;

public class day21b {
	
	// Single inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StudentN chinmayN = new StudentN("chinmay","deshpande",23);

		TeacherN chinmayBN = new TeacherN("chi","desh",12,1244);
		
		System.out.println(chinmayBN.firstName);
		System.out.println(chinmayBN.lastName);
		System.out.println(chinmayBN.age);
		System.out.println(chinmayBN.salary);
		
		chinmayBN.displayName();
		chinmayBN.displaySalary();
		
	}

}


class StudentN {
	
	String firstName;
	String lastName ;
	int age;
	
	public StudentN(String fn , String ln , int ag) {
			
		this.firstName  = fn;
		this.lastName  = ln;
		this.age  = ag;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
class TeacherN  extends StudentN{
	
	int salary;
	public TeacherN(String fn , String ln , int ag, int sal) {
		super(fn,ln,ag);
		this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	

}