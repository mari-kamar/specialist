
public class Program {
	
	public static <T extends Comparable<? super T>>  
		boolean isGreater( T a, T b )
	{
		return a.compareTo(b) > 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println( isGreater( 5, 2) );
		System.out.println( isGreater( "abc", "cde") );
		//System.out.println( isGreater( new Program(), new Program()) );
		
		// since java 11
		var r1 = 
				new ReadonlyStorage<Integer>(5);
		
		ReadonlyStorage<Double> r2 = 
				new ReadonlyStorage<>(2.5);
		
		ReadonlyStorage<String> r3 = 
				new ReadonlyStorage<String>("abc");
		
		//ReadonlyStorage<Program> r4 = 
		//		new ReadonlyStorage<Program>(new Program());
		
		System.out.println( r1.getData()*2 );
		System.out.println( r2.getData() );
		System.out.println( r3.getData() );

	}

}
