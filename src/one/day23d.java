package one;

public class day23d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor f =  new Professor("Maths");
		f.displaySubjects();
		f.abc();
	}
}

class TeacherE {
	
	protected String subject;
	
	public TeacherE(String sub){
		this.subject = sub;
	}
	
	public void abc() {
		System.out.println("teacher abc");
	}
	
}

class Professor  extends TeacherE{

	String subject = "chemistry";
	public Professor(String sub) {
		super(sub);
		// TODO Auto-generated constructor stub
	}
	
	public void displaySubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}
	public void abc() {
		System.out.println("professor abc");
		super.abc();
	}
	
	
	
}


// 23 ----> 

// private field and private method
// super keyword for method and super keyword for field
// protected key for inherited class






