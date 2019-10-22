
public class Singleton1 {
	
	//public static final Singleton1 instance = new Singleton1();
	
	private static volatile Singleton1 instance;
	
	private Singleton1() {}
	
	public synchronized static Singleton1 getInstance() {
		if (instance == null)
			instance = new Singleton1();
		
		return instance;
	}

}
