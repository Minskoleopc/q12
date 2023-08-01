package one;

import java.util.ArrayList;


public class day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		// add()
		boolean a = names.add("chinmay");
		System.out.println(a);
		names.add("ram");
		names.add("sarika");
		names.add("poorva");
		System.out.println(names);
		
		// add(position , element)
		names.add(2, "maya");
		System.out.println(names);
		
		// remove
		//    0      1   2       3         4
		//[chinmay, ram, maya, sarika, poorva]
		names.remove(1);
		System.out.println(names);
		names.remove("sarika");
		System.out.println(names);
		
		// clear()
		names.clear();
		System.out.println(names);
		names.add("sarika");
		names.add("mayuri");
		names.add("roshni");
		names.add("abhisha");
		names.add("poorva");
		System.out.println(names);
		
		// [sarika, mayuri, roshni, abhisha, poorva]
		// set()
		names.set(1,"komal");
		System.out.println(names);
		
		// contains()
		boolean q1 = names.contains("sarika");
		System.out.println(q1);
		// [sarika, komal, roshni, abhisha, poorva]
		// get()
		String eleAtIndex2 = names.get(2);
		System.out.println(eleAtIndex2);
	
		//indexOf()
		int nums = names.indexOf("poorva");
		System.out.println(nums);
		
		
		int numsB = names.indexOf("Poorva");
		System.out.println(numsB);
		
		
		ArrayList<String> fruits  = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("papaya");
		System.out.println(fruits);
		
		String userInput = "apple";
		if(fruits.contains(userInput)) {
			System.out.println("Element available");
		}
		else {
			System.out.println("Element not available");
		}
		
		// indexOf()
		
		if(fruits.indexOf("apple") >= 0) {
			System.out.println("Element available");
		}
		else {
			System.out.println("Element not available");
		}
		
		
		 ArrayList<String> cities = new ArrayList<>();
		 cities.add("pune");
		 cities.add("banglore");
		 cities.add("kolkata");
		 cities.add("chennai");
		 cities.add("pune");
		 
		 System.out.println(cities.size());
		 System.out.println(cities);
		 
		 // [pune, banglore, kolkata, chennai, pune]
		 
		 System.out.println(cities.indexOf("pune"));
		 System.out.println(cities.lastIndexOf("pune"));
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		

		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
