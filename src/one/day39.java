package one;

public class day39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog1 d1 = new Dog1();
		
		System.out.println(d1 instanceof Dog1);
		System.out.println(d1 instanceof Animal1);
		
		Invoice inv = new Invoice("123","chinmay","deshpande","7709192441","Nagpur");
		System.out.println(inv instanceof Invoice);
	}

}

class Animal1 {
	
}

class Dog1 extends Animal1 {
	
	
	
}
class Invoice {
	
	String billNO ;
	String firstName;
	String lastName;
	String phoneNo ;
	String address;
	
	
	public Invoice(String bn , String fn ,String ln ,String phoneNo,String adress) {
		this.billNO = "123";
		this.firstName = "chinmay";
		this.lastName = "deshpande";
		this.phoneNo = "123456";
		this.address = "123";
			
	}
	
	
	
	
	
}





