package one;

public class day23c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humanc c = new Humanc(123);
		System.out.println(c.SSN);
		
		StudentE e = new StudentE(1234);
		e.displaySSN();
	} 
	

}

class Humanc {
	protected  int SSN;
	public Humanc(int ssn) {
		this.SSN = ssn;
	}
}

class StudentE extends  Humanc{
	public StudentE(int ssn) {
		super(ssn);
	}
	
	public  void displaySSN() {
		System.out.println(this.SSN);
	}
		
}





