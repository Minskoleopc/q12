package one;

public class day21d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DaughterC gauri = new DaughterC("shirish","deshpande","gauri");
		SonC chinmay = new SonC("shirish","deshpande","chinmay");
		
		chinmay.displaySName();
		chinmay.displayFName();
		
		gauri.displayFName();
		gauri.displayDName();
		
		
	}

}

class FatherC {
	
	String firstName;
	String lastName ;
	
	public FatherC(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayFName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}

class SonC extends FatherC {

	String Sname;
	public SonC(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
		
	}
	
	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}
	
}

class DaughterC extends  FatherC{
	String Dname;
	public DaughterC(String fn, String ln , String dn) {
		super(fn, ln);
		this.Dname = dn;
		// TODO Auto-generated constructor stub
	}
	
	public void displayDName() {
		System.out.println(this.Dname + this.lastName);
	}
	
}

