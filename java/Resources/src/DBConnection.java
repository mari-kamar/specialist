import java.io.Closeable;
import java.io.IOException;

public class DBConnection implements Closeable{
	
	public DBConnection() {
		System.out.println("open connection");
	}
	
	public void execute() {
		System.out.println("execute commands");
	}
	
	

	boolean isClosed = false;
	public void close() {
		if (!isClosed) {
			System.out.println("close connection");
			isClosed = true;
		}
	}

	/*@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("close connection");
	}*/


}
