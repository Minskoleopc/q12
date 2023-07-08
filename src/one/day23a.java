package one;

public class day23a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.displayMessage();
	}
	
}

// Use of super keyword in java
class Animal {
	
	public void display() {
		System.out.println("I am animal");
	}
}

class Dog extends Animal{
	
	public void display() {
		System.out.println("I am Dog");
	}
	
	public void displayMessage() {
		display();
		super.display();
	}
	
}


//