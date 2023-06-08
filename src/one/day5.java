package one;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub();
		Sub();
		Sub();
		Sub();
		Sub();

		SubB(10, 6);
		SubB(10, 4);
		SubB(10, 3);

		int chinmay = SubC(10, 7);
		System.out.println(chinmay);
		
		addD(chinmay,8);
	}

	// function without parameter and without return

	public static void Sub() {
		System.out.println(10 - 5);
	}

	// function with parameter and without return type

	public static void SubB(int x, int y) {
		System.out.println(x - y);
	}

	// function with parameter and with return

	public static int SubC(int x, int y) {
		return x - y;
	}
	
	public static void addD(int x,int y) {
		System.out.println(x+y);
	}
	
	

}

//  product - 100  -------------------------------> payment(100)
//  product - 100 ---------- Discount ------------> payment(90)




