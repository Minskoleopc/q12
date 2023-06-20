package one;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		
		String firstName = "Chinmay";

		// 0 1 2 3 4 5 6
		// C h i n m a y
		String rev = "";

		for (int i = 0; i < firstName.length(); i++) {
			// System.out.println(i);
			// System.out.println(firstName.charAt(i));
			rev = firstName.charAt(i) + rev;
			// C + "" ========> C
			// h + C ========> hC
			// i + hC ========> ihC

		}

		System.out.println(rev);

		// Program 2
		String city = "Pune";
		String rev2 = "";

		// 0 1 2 3
		// P u n e

		for (int i = city.length() - 1; i >= 0; i--) {
			// System.out.println(i);
			// System.out.println(city.charAt(i));

			rev2 = rev2 + city.charAt(i);
			// "" + e =================> e
			// e + n =================> en
			// en + u =================> enu
			// enu + p =================> enup
		}

		System.out.println(rev2);

//   METHODS --------> 

		// Program 1
		String city1 = "Pune";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("Welcome ".toUpperCase() + uc);

		// Program 2

		String city2 = "NAGpur";
		String lc = city2.toLowerCase();
		System.out.println(lc);

		// Program 3

		String city3 = "Wardha";
		int toc = city3.length();
		System.out.println(toc);

		// Program 4

		String city4 = "Chandrapur";
		int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);

		// Program 5
		// 0 1 2 3 4 5
		// R a j k o t

		String city5 = "Rajkot";
		char c = city5.charAt(city5.length() - 1);
		System.out.println(c);

		// Program 6

		String city6 = "jaipur";
		// 0 1 2 3 4 5
		// J a i p u r

		// String s1 = city6.substring(3);
		// System.out.println(s1);
		// city6.substring(startIndex, endIndex(not included));

		String s2 = city6.substring(1, 3);
		System.out.println(s2);
		
		
		// StartsWith() 
		String city8 = "chandrapur";
		boolean s3 = city8.startsWith("c");
		System.out.println(s3);
		
		// EndsWith()
		String city9 = "bhopal";
		boolean s4 = city9.endsWith("pal");
		System.out.println(s4);
		
		// Split()
		// come back to this after array
		String city10 = "I am learning javascript";
		String [] s5 = city10.split(" "); //{"I","am","learning","javascript"}
		String [] s6 = city10.split("a"); //{"I ,"m" "le","rning j","v","script"}
		
		//replaceFirst()
		String city11 = "I am learning python and python is good language";
		String s7 = city11.replaceFirst("python", "java");
		System.out.println(s7);
		
		//replaceAll()
		String s8 = city11.replaceAll("python", "java");
		System.out.println(s8);
		
		//replace()
		String s9 = city11.replace("I", "W");
		System.out.println(s9);
		
		//concat()
		String city13 = "pune";
		String city14 = "Welcome to ";
		String s10 = city14.concat(city13);
		System.out.println(s10);
		
		// contains()
		
		String city15 = "I am learning js in bhopal";
		boolean s11 = city15.contains("learning");
		System.out.println(s11);
		
		
		// equal()

		String city16 = "pune";
		String city17 = "PUNE";
		
		boolean s12 = city16.equals(city17);
		System.out.println(s12);
		
		
		//equalIgnoreCase()
		boolean s13 = city16.equalsIgnoreCase(city17);
		System.out.println(s13);
		
		
		
		// trim()
		String city18 = " I am learning js ";
		System.out.println(city18.length());
		String s14 = city18.trim();
		System.out.println(s14.length());
		
		
		// contains 
		
		String city19 = "I am learning spanish";
		String city20 = "SPANISH";
		boolean s15 = city19.toUpperCase().contains(city20);
		System.out.println(s15);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 		
		
		
		
		
		
		
		
		
		
		

	}

}
