package one;

public class revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// comparison operator
		// < , > , <= , >= , == , !=
		
		System.out.println(7 >6);  // true
		System.out.println(5 <3);  // false
		System.out.println(7 == 7);  // true
		System.out.println(7 != 8); // true
		System.out.println(7 >= 6); // true
		System.out.println(7 <= 6); // false
		System.out.println(7 <= 7); // true
		System.out.println(7 >= 7); //true
		
		
		// Logical operator
		

		//AND - &&
		
		// true  &&   true  ======> true
		// false &&   true  ======> false
		// true  &&   false ======> false
		// false &&   false  =====>  false
		
		
		System.out.println(12 == 12 && 11 == 11); // true
		System.out.println(12 != 12 && 11 == 11); // false
		System.out.println(12 == 12 && 11 != 11); // false
		System.out.println(12 != 12 && 11 != 11); // false
		
		
		//OR  - ||
		
		// true  ||   true  ======> true
		// false ||   true  ======> true
		// true  ||   false ======> true
		// false ||   false ======> false
				
		
		System.out.println(12 == 12 || 11 == 11); // true
		System.out.println(12 != 12 || 11 == 11); // true
		System.out.println(12 == 12 || 11 != 11); // true
		System.out.println(12 != 12 || 11 != 11); // false
		
		//NOT - !
		
		//true  ---- false
		//false ---- true
		
		System.out.println(! (2 == 2));
		System.out.println(! (2 != 2));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	
	
	
}
