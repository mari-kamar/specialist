import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("¬ведите им€: ");
			String name = sc.nextLine();
			if (name.isBlank())
				break;
			else
				names.add(name);
		}
		
		Collections.sort(names);
		
		for(var name : names)
			System.out.println(name);
		
		sc.close();

	}

}
