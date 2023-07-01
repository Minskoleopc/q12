package one;

public class revision8 {

	public static void main(String[] args) {

		// program 1
		String states[][] = {

				{ "Pune", "Nagpur" }, 
				{ "jaipur", "udaipur" }, 
				{ "varasani", "lucknow" }

		};

//		System.out.println(states[0]);
//		System.out.println(states[1]);
//		System.out.println(states[2]);
		
		for (int i = 0; i < states.length; i++) {
			String city[] = states[i];
			for (int j = 0; j < city.length; j++) {
				System.out.println(city[j]);
			}

		}

		// program 2
		int h1 = 0;
		while (h1 < states.length) {
			String ci[] = states[h1];
			int h2 = 0;
			while (h2 < ci.length) {
				System.out.println(ci[h2]);
				h2++;
			}
			h1++;

		}


		// program 3
		
		
		String state[][] = {

				{ "Pune", "Nagpur" }, 
				{ "jaipur", "udaipur" }, 
				{ "varasani", "lucknow" }

		};
		
		//int marks [] = {11,22,33};
		
		for(String[] a : state ) {	
			for(String b:a) {
				System.out.println(b);
			}
			
		}
		
		
		String country [][][] = 
				
			{
					{
						{"pune","mumbai"},
						{"bhopal","indore"}
					}	
					,
					{
						{"Arvin","Dallas"},
						{"Newyork","Buffalo"}
					}	
					
					
					
					
			};
		
		
		
		
		
		

		
		
		
		
		
		
		
		

	}

}
