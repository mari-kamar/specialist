
public class MyException extends RuntimeException {
	private int invalidData;

	public int getInvalidData() {
		return invalidData;
	}
	
	public MyException(String message, int invalidData) {
		super(message);
		this.invalidData = invalidData;
		
	}
	public MyException(String message, int invalidData, Throwable cause) {
		super(message, cause);
		this.invalidData = invalidData;
	}
	

}
