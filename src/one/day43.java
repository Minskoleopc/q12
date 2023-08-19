package one;

import java.io.FileWriter;
import java.io.IOException;

public class day43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "example.txt";
		
		try {
			FileWriter writer =  new FileWriter(fileName);
			// Write into the file 
			writer.write("Hello world");	
			writer.write("\n");
			writer.write("I am learning  javascript");
			writer.write("\n");
			writer.write("I am learning python");
			writer.write("\n");
			writer.write("I am learning sql");
			writer.write("\n");
			writer.write("I am learning  git");
			writer.write("\n");
			writer.write("I am learning  ruby");
			writer.write("\n");
			writer.close();
			System.out.println("Data successully written and file is closed");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		

	}

}
