package one;
enum Sizee {

	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public int getSize() {
		switch (this) {
		case SMALL:
			return 3 ;
		case MEDIUM:
			return  4;
		case LARGE:
			return 5;
		case EXTRALARGE:
			return 5;
		default:
			return 0;
		
	}

}
	
}
public class day28C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int order = Sizee.SMALL.getSize();
		System.out.println(order);
	
	}

}
	


// SIZE.small    =====> object of small size   ----- this
// SIZE.medium   =====> object of medium size  ----- this



