package one;


// Singleton pattern
public class day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Database a = new Database(); // constructor is private
		Database db1 = Database.getInstance();
		db1.getConnetion();
		
	}

}

class Database {
	
	private static Database dbObject = null;
	private Database() {
	}
	
	public static Database getInstance() {
		
		if(dbObject == null) {
			dbObject = new Database();
		}
		// returns you singleton object
		return dbObject;
	}
		
	public void getConnetion() {
		System.out.println("you are connected to database");
	}
	
	
	
	
}











//Person
// Person p = new Person()