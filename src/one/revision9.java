package one;

public class revision9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonC chinmay = new PersonC();
		System.out.println(chinmay.age);
		System.out.println(chinmay.fullName);
		chinmay.age = 12;
		chinmay.fullName = "chinmay deshpande";
		System.out.println(chinmay.age);
		System.out.println(chinmay.fullName);

		PersonC amol = new PersonC();
		amol.fullName = "amol rao";
		amol.age = 32;
		amol.displayName();
		
		PersonD chinmay2 = new PersonD("chinmay2 deshpande2", 33);
		chinmay2.displayName();

		
		PersonD chinmay3 = new PersonD("chinmay3 deshpande3", 32);
		chinmay3.displayName();

	}

}

class PersonC {
	// properties
	// class fields
	int age;
	String fullName;

	public void displayName() {
		System.out.println(this.fullName);
	}

}

class PersonD {

	String fullName;
	int age;

	public PersonD(String fn, int ag) {
		this.fullName = fn;
		this.age = ag;
	}

	public void displayName(){
		System.out.println(this.fullName);
	}
	
	
	
	
}
