package ru.specialist;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Locale.setDefault( Locale.US );
		Locale.setDefault( new Locale("RU", "RU") );
		//Locale rus = new Locale("RU", "RU");
				
		
		System.out.print("T (C): ");
		Scanner sc = new Scanner( System.in );
		double tc = sc.nextDouble();
		
		double tf = tc * 9 / 5 + 32;
		
		//System.out.printf(rus, "T (F): %.3f\n", tf);
		System.out.printf("T (F): %.3f\n", tf);
		
		

	}

}
