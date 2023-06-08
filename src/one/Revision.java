package one;

public class Revision {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x);
		// Arithmetic operation
		int s = 8;
		int t = 4;
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		int a = 9;
		int b  = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// calling the function
		Calculator(4,2);
		Calculator(8,4);
		
		addA();
		addA();
		addA();
		addA();
		addA();
		
		
		addB(12,6);
		addB(2,6);
		addB(1,6);
		
		int z = addC(3,5);
		System.out.println(z);
		System.out.println(z+z);
		System.out.println(z*0.10);
		
		
	}
	
	
	// creating the function 
	public static void Calculator(int x,int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}
	
	// function without parameter and without return type 
	
	public static void addA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type 
	
	public static void addB(int x , int y) {
		System.out.println(x+y);
	}
	
	//function with parameter and with return type 
	
	// 100 -- show
	// 100 - given --- store ---- reuse
	
	
	public static int addC(int x, int y) {
		System.out.println(x+y);
		return x + y ;
	}
	
	
	
	
	
	
	
	
	
	
	

}
