package one;

public class day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// you cannot create the object of abstract class
		//WorldBankA a = new WorldBankA();
		
		SBIA pune = new SBIA();
		
		pune.loan();
		pune.save();
		pune.displayCountry();
		pune.branchName();

	}
	
	

}

abstract class WorldBankA {
	
	// abstract method
	abstract void loan();
	abstract void save();
	public void displayCountry() {
		System.out.println("I am from india");
	}
	
}

// you cannot create object of abstract class

class SBIA extends WorldBankA {
	
	public void loan() {
		System.out.println("I am loan from sbi");
	}
	public void save() {
		System.out.println("I am save sbi");
	}
	
	public void branchName() {
		System.out.println("I am  pune branch");
	}

}

class PNBA extends  WorldBankA {
	
	public void loan() {
		System.out.println("I am loan from pnbA");
	}
	public void save() {
		System.out.println("I am save from pnbA");
	}
	
	public void branchName() {
		System.out.println("I am  pune branch -pnba");
	}
	
}
















