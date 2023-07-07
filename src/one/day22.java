package one;

public class day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI pune = new SBI("India", "pune");
		pune.loan();
		pune.save();
		pune.displayMessage();
	}
	
	
	

}

class WorldBank {
	String country;
	// constructor
	public WorldBank(String cnt) {
		this.country = cnt;
	}
	
	public void save() {
		System.out.println(" i am save method from the worldbank");
	}
	
	public void loan() {
		System.out.println(" i am loan method from the worldbank");
	}
	
	public void displayMessage() {
		System.out.println("welcome to WorldBank");
	}
	
	
}

class PNB extends WorldBank {
	String branchName;

	public PNB(String cnt,String bn) {
		super(cnt);
		this.branchName = bn;	
	}
	// Overriding the parent methods loan and save
	@Override
	public void save() {
		System.out.println("I am save from PNB pune");
		
	}
	
	@Override
	public void loan() {
		System.out.println("I am loan from PNB pune");
	}
		
}

class SBI extends WorldBank {
	
	String branchName;

	public SBI(String cnt,String bn) {
		super(cnt);
		this.branchName = bn;
		
	}
	
	// Overriding the parent methods loan and save
	
	@Override
	public void save() {
		System.out.println("I am save from SBI pune");
		
	}
	
	
	@Override
	public void loan() {
		System.out.println("I am loan from SBI pune");
	}
		
}


