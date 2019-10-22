
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Program {

	public static void main(String[] args) {
		// int[] nums = new int[3];
		// nums[0] = 100;
		// nums[1] = 90;
		
		// int[] nums = new int[] {100, 90, 0};
		int[] nums = {100, 90, 0};
		
		System.out.println(nums.length);
		
		for(int i=0; i < nums.length; i++)
			System.out.println(nums[i]);
		
		int min = nums[0];
		for(int i=0; i < nums.length; i++)
			if (nums[i] < min) min = nums[i];
		
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		
		String[] names = new String[] { "Сергей", "Наталия", "Костя", "Саша"  } ;
		
		Arrays.sort(names);
		
		//for(int i=0; i < names.length; i++)
		//	System.out.println(names[i]);
		for(String name : names)
			System.out.println(name);
		
		
		
		// 1 2 3
		// 4 5 6
		int[][] matrix = 
			{
				new int[] {1,2,3},
				new int[] {4,5}
			};
		
		System.out.println(matrix.length);
		for(int i=0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++)
				System.out.printf("%4d", matrix[i][j]);
			
			System.out.println();
		}
		
		{
			int a = 10;
			int b = a;
			a++;
			System.out.printf("a = %d\nb = %d\n", a, b); // 11 10
		}
			
		{
			int[] a = {10};
			int[] b = a.clone();
			a[0]++;
			System.out.printf("a = %d\nb = %d\n", a[0], b[0]); // 11 11
		}
		{
			//String[]
			//Collection<String> persons = new ArrayList<String>();
			List<String> persons = new LinkedList<String>();
			var x = List.<String>of("abc", "cde");
			
			System.out.println(x.size());
			x.add("xyz");
			for(String y : x)
				System.out.println(y);
			
			
			System.out.println(persons.size());
			persons.add("Сергей");
			persons.add("Анна");
			persons.add("Даша");
			persons.add("Глаша");
			System.out.println(persons.size());
			
			//persons.remove("Сергей");
			persons.set(1, "Константин");
			persons.remove(0);
			persons.remove("abc");
			persons.add( 1 , "Сергей");
			
			if (persons.contains("Даша"))
				System.out.println("Даша есть в списке");
			
			System.out.println(persons.indexOf("Даша"));
			
			Collections.sort(persons);
			
			
			/*Iterator<String> iter =	persons.iterator();
			while (iter.hasNext()) {
				String p = iter.next();
				System.out.println(p);
			}*/
			for(String p : persons)
				System.out.println(p);
			
			
			
			
			// bad
			//for(int i=0; i < persons.size(); i++)
			//	System.out.println( persons.get(i) );
		}
		{
			var x = 5;
			//x = "abc";
			String s = new String();
			//s.isEmpty()
			// var y; // нельзя
			var program = new Program(); // Program program = new Program();
			//Борщ борщ = new Борщ();
			
		}
		
		
		
		
		

	}

}
