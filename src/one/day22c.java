package one;

public class day22c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorB a = new CalculatorB();
		a.subtraction(12,10);
		a.subtraction(12,10,5);
		a.subtraction(12,10,5,4);
	}

}

class CalculatorB {

	public void subtraction(int x, int y) {
		System.out.println(x - y);
	}

	public void subtraction(int x, int y, int z) {
		System.out.println(x - y - z);
	}

	public void subtraction(int x, int y, int z, int a) {
		System.out.println(x - y - z - a);
	}

}
