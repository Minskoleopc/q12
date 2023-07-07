package one;

public class day22a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		additionA(12,3);
		additionA(12,3,44);
		additionA(12,3,44,55);
	}
	
	
	// overloading - same class , same methodName , different signature
	// method 1
	public static void additionA(int x, int y) {
		System.out.println(x+y);
	}
	// method 2
	public static void additionA(int x ,int y ,int z) {
		System.out.println(x+y+z);
	}
	// method 3
	public static void additionA(int x , int y , int z , int a ) {
		System.out.println(x+y+z+a);
	}
	
}
