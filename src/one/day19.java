package one;

public class day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentC sarika = new StudentC("sarika","pansare",134);
		System.out.println(sarika.firstName);
		System.out.println(sarika.lastName);
		System.out.println(sarika.ssn);
		sarika.displayName();
		
		
		TeacherC sarikat = new TeacherC("sarikat","pansaret",123,3242);
		System.out.println(sarikat.firstName);
		System.out.println(sarikat.lastName);
		System.out.println(sarikat.ssn);
		System.out.println(sarikat.salary);
		
		sarikat.displayName();
		sarikat.displaySalary();
		
		
		
		
	}

}


class StudentC {
	
	String firstName;
	String lastName;
	int ssn;
	
	public  StudentC(String fn , String ln , int ss) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.ssn = ss;
				
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
} 

class TeacherC extends  StudentC{
	
	int salary ;
	
	// Mandatory to have child constructor as parent is having 
	// constructor
	// FirstLine of child constructor should be called to parent 
	//.. constructor
	
	
	public TeacherC(String fn , String ln , int ss ,int sal){
			super(fn,ln,ss);
			this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
	
	
	
	
	
}






