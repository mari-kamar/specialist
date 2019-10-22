package ru.specialist;

public class Program {
	
	public final static double PI = 3.1415;
	final int q;
	
	public Program(int x) {
		this.q = x;
		
	}

	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a больше нуля");
			System.out.println("a > 0");
		}
		else 
			if (a > -100)
				System.out.println("a больше -100");
			else
				System.out.println("a НЕ больше нуля");
				
		int n = 0;
		/*String s;
		if (n == 0)
			s = "ноль";
		else
			s = "не ноль";*/
				
		final String s = (n == 0) ? "ноль" : "не ноль";
		//s = "!";
		final int B = 10;
		
		final int x = B+5;
		
		switch (x) {
			case -1:
			case 1:
				System.out.println("один");
				break; // return
			case 1+1:
				System.out.println("два");
				break;
			case 3:
				System.out.println("три");
				break;
			default:
				System.out.println("много");
		}
		
		//  На ветке 5 ворон
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
