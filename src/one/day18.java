package one;

public class day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle toyota = new Vehicle();
		Vehicle audi = new Vehicle("Audi");
		Vehicle bmw = new Vehicle("Audi","Q4");

	}
	
	

}

class Vehicle {
	
	String name;
	String model;
	
	// Default constructor is always called;
	// Class can have multiple constructor (constructor overloaded)
	// Constructor don't have return type 
	// Constructor name should be similar to class name
	
	
	public Vehicle() {
		System.out.println("Default constructor is called");
	}
	
	public Vehicle(String nm) {
		this.name = nm;
		System.out.println("The name of vehicle "+ this.name);
	}
	
	public Vehicle(String nm , String mdl) {
		this.name = nm;
		System.out.println("The name of vehicle "+ this.name + this.model);
	}
	
	
}