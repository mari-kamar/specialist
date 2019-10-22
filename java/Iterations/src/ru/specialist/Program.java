package ru.specialist;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			if (i == 4) continue;
			if (i == 8) break;
			System.out.println(i);
		}
		
		for(int i=100; i >= 1; i-=3)
			System.out.println(i);
		
		// 1 2 3 4 ... 10
		// 2 4 6 8 ... 20
		metka:
		for(int i=1; i <=10; i++) {
			for(int j=1; j <= 10; j++) {
				if (j == 5) break metka;
				System.out.printf("%4d", i*j);
			}
			
			System.out.println();
		}
		
		System.out.println("\nпродолжение");
		
		//for(;;)
		
		int a = 2000;
		while(a < 1000) {
			System.out.println(a);
			a *= 2; // a = a*2;
		}
		
		a = 2;
		do {
			System.out.println(a);
			//a *= 2; // a = a*2;
		}while( (a *= 2) < 1000);
		
		// for(;;);
		//while(true) {}
		// 1 1 2 3 5 8 13 21 ...
		
		int k1 = 1;
		int k2 = 1;
		int k;
		System.out.println(k1);
		System.out.println(k2);
		
		while ( (k = k1+k2) < 1000 ) {
			System.out.println(k);
			k1 = k2;
			k2 = k;
		}
		
		Random r = new Random();
		int x = r.nextInt(100)+1; // 1..100
		System.out.println(x);
		
		
		
		
		

	}

}
