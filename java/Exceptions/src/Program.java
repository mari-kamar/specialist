
public class Program {

	static void test(String s1, String s2) //throws MyException
	{
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if (n1 < 0 || n1 > 100)
				//throw new IllegalArgumentException("n1 out of [0, 100]");
				throw new MyException("n1 out of [0, 100]", n1);
			
			int n = n1 / n2;
			System.out.println(n);
		}
		catch(NumberFormatException ex) {
			System.out.println("не число");
		}
		/*catch(NumberFormatException | ArithmeticException ex) {
			System.out.println("не число");
		}*/
		/*catch(Exception ex) {
			System.out.println(ex.getMessage());
		}*/
		/*catch(NumberFormatException ex) {
			System.out.println("не число");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}*/
		finally {
			System.out.println("finally");
			// return;
		}
		
		System.out.println("продолжение test");
		
	} 
	
	
	public static void main(String[] args) {
		try {
			test("123", "4");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		catch(MyException ex) {
			System.out.printf("%s invalid value: %d\n", 
					ex.getMessage(), ex.getInvalidData());
		}
		
		System.out.println("продолжение main");
		
		new Thread( ()-> {
			System.out.println("another thread");
		}).start();
	}

}
