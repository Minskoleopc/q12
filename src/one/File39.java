package one;

import java.io.FileWriter;
import java.io.IOException;

public class File39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileWriter write = new FileWriter("MyFile.txt",true);
			System.out.println(10/0);
			write.write("hello world");
			write.write("\n");
			write.write("hello chinmay");
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
