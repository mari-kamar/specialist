import static java.lang.System.out;

import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
		String s = new String("abc");
		System.out.println(s);
		String hello = "Привет";
		String name = "Сергей";
		String result = hello + " "  + name + "!";
		out.println(result);
		out.println( result.length() );
		out.println( result.charAt(0) );
		out.println( result.charAt(result.length()-1) );
		out.println(result.contains("Сергей"));
		out.println(result.indexOf("Сергей"));
		out.println(result.substring(7));
		out.println(result.substring(7, 13));
		
		result = result.replace("Сергей", "Андрей");
		out.println(result);
		
		out.println(result.toLowerCase());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <=100; i++)
			sb.append(i).append(" ");
		
		String r = sb.toString();
		
		/*
		// bad
		String r = "";
		for(int i=1; i <=100; i++)
			r += String.valueOf(i)+" ";*/
		
		System.out.println(r);
		
		Scanner sc = new Scanner(System.in);
		
		String r1 = "Сергей!";
		String q = "!";
		final String ex = q;
		String r2 = "Сергей"+ex;
				//sc.nextLine();
		
		
		//boolean rb = r1 == r2; 
				//r1.equals(r2);
		boolean rb = r1.equals(r2);
		
		System.out.println(rb);
		
		
		
		
	}

}
