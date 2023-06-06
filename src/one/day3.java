package one;

public class day3 {

	public static void main(String[] args) {
		System.out.println(" Arimetic operations");
		
		// Arithmetic operation
		// Addition       -   +
		// Subtraction    -   -
		// Multiplication -   *
		// Division       -   /
		// Modulus        -   %
		
		int x = 10;
		int y = 5;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		int s = 8;
		int t = 4;
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		// 10 pair --- 50 lines
		// calling the calculator function
		
		Calculator(9,3);
		Calculator(8,4);
		
	}
	
	public static void Calculator(int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);	
	}
}
