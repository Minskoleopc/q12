package one;

class MyException extends Exception {
	public MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

class InvalidMobileNumber extends Exception {
	public InvalidMobileNumber(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
public class Main {
	// Driver Program
	public static void main(String args[]) {
		try {
			String password = "cmdfdsfsdfsdfysss";
			if (password.length() <= 8) {
				throw new MyException("password length is small");
			}

			String mobile = "sdfdsfsdf";
			if (mobile.length() <= 10) {
				throw new InvalidMobileNumber("Please enter correct mobile");

			}

			System.out.println("user registred");

		} catch (Exception e) {
			System.out.println("function callded");
			System.out.println("Caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
	}
}
