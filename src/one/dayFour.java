package one;

public class dayFour {

	public static void main(String[] args) {
		// calling the function
		Add();
		Add();
		Add();
		Add();
		Add();

		// calling the AddB() function
		AddB(12, 6);
		AddB(10, 5);
		AddB(10, 10);

		// calling the AddC() function

		int sum = AddC(12, 5);
		System.out.println(sum);
		System.out.println(sum + sum);
		System.out.println(sum - 7);
		System.out.println(sum * 0.10);
	}

	// writing a function without parameter and without return type

	public static void Add() {
		System.out.println(9 + 9);
	}

	// writing a function with parameter and without return type

	public static void AddB(int x, int y) {
		System.out.println(x + y);
	}

	// function with parameter and with return type
	// $100 dollar given
	// $100 dollar shown

	public static int AddC(int x, int y) {
		System.out.println(x + y);
		return x + y

		;
	}

}
