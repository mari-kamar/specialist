
public class Program {

	public static void main(String[] args) {
		//System.gc();
		
		/*DBConnection db = new DBConnection();
		try {
			db.execute();
		}
		finally {
			db.close();
		}*/
		
		// since java 7
		try(DBConnection db = new DBConnection();
				DBConnection db2 = new DBConnection()) {
			db.execute();
			db2.execute();
		} // db.close()
		
		// since java 9
		DBConnection db3 = new DBConnection();
		try(db3) {
			db3.execute();
		} // db.close()
	}

}
