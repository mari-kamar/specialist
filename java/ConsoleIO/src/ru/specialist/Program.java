package ru.specialist;

//import java.util.Date;
import java.time.LocalDate;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) 
		//throws IOException
	{
		//System.out.print("Hello");
		//System.out.println("Sergey");
		
		/*
		BufferedReader reader = 
			new BufferedReader( new InputStreamReader(System.in) );
		
		System.out.print("���: ");
		String name = reader.readLine();
		
		System.out.print("�������: ");
		int age = Integer.parseInt( reader.readLine() );
		// Double.parseDouble(s)*/
		
		//Scanner sc = new Scanner( System.in );
		var sc = new Scanner( System.in );
		System.out.print("���: ");
		String name = sc.nextLine();
		System.out.print("�������: ");
		int age = sc.nextInt(); // nextDouble
		
		// ������, ������ - 41!
		//System.out.printf("������, %s - %d!\n", name, age);
		String result = String.format("������, %2$-20s - 0x%1$x!\n",age, name);
		System.out.print(result);
		
		
		// pi = 3.1415
		System.out.printf("pi = %10.3f\n", Math.PI);
		//Date now = new Date();
		LocalDate now = LocalDate.now();
		
		//System.out.printf("%1$tY-%1$tm-%1$td", now);
		System.out.printf("%tY-%<tm-%<td\n", now);
		System.out.printf("%tF\n", now);
		
		

	}

}
