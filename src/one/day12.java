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

//   

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

	}

}
