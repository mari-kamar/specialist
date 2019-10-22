package ru.specialist;

public class Program {
	
	public static int y;


	public static void main(String[] args) {
		
		{
			int q = 0x1F;
			System.out.println(q);
		}
		{
			String q = "abc";
			System.out.println(q);
		}
		{
			for(int i=1; i <=10; i++)
				System.out.println(i);
			
			int counter, b;
			
			String userName = new String("abc");
			
			int ìîÿÏåðåìåííàÿ;
			int Int; // bad
			
			counter = 100+2*5;
			
			
			System.out.println(counter);
			
			int x = counter*5;
			System.out.println(x);
			
			//counter = counter - 5;
			counter -= 5;
			
			System.out.println(counter);
			System.out.println(y); // 0
			// null
			
			int q = 10;
			long l = q; // implicit conv
			
			l = Integer.MAX_VALUE + 1L; // 2^31 - 1
			System.out.println(l);
			int p = (int)l; // explicit conv
			System.out.println(p);
			
			//null
			
			// value types
			// reference types
			
			String s = null;
			
			int j = 100;
			Integer jj = j; // boxing
			int jjj = jj; // unboxing
		}
		//byte
		//short
		//int
		//long
		
		// + - * / %
		{
			int a = 10;
			//int b = (a *= 2 );
			//a = a + 1;
			//a += 1;
			int b = ++a + a++;
			//       11 + 11
			
			System.out.println(a);
			System.out.println(b);
		}
		{
			double x = 2d;
			x = 3e7; // 3*10^7
			float f = 1.5F;
		}
		{
			
			int a = 5;
			int c = 2;
			double b = (double) a / c;
			System.out.println(b);
		}
		{
			char ch = 'A';
			char ch2 = '\u002F';
			System.out.println(ch);
			System.out.println(ch2);
		}
		{
			boolean a = true;
			boolean b = false;
			
			// ËÎÃÈ×ÅÑÊÎÅ È 
			boolean c = a && b;
			
			// ËÎÃÈ×ÅÑÊÎÅ ÈËÈ
			c = a || b;
			
			// ËÎÃÈ×ÅÑÊÎÅ ÍÅ
			c = !a;
			
			c = a && !b;
			c = !(a && b); // !a || !b
			c = a || !b;
			
			System.out.println(c);
		}
		{
			int a = -10;
			boolean r = (a - 5) == (a / 2);
			// !=
			// >
			// <
			// >=
			// <=
			
			r = (a >= 0) && (a <= 100);
			System.out.println(r);
		}
		{
			int a = 5; // 0101
			int b = 7; // 0111
			
			int c = a & b; // 0101
			c = a | b; // 0111
			c = a ^ b; // 0010
			c = ~a;
			
			c = a << 2; // 0101 << 2 = 010100
			a = -5;
			//c = a >> 2; // 0101 >> 2 = 0001
			c = a >>> 2;
			
			// 0010
			c = (a >> 1) & 1;
			System.out.println(c);
		}
		
		{
			System.out.println("---------------");
			int n = 14; // 00000 ... 1 ..0000
			for(n = 1; n < 1000; n++) {
				//boolean r = ((n - 1) & n) == 0;
				/// 00000 ... 1 ..0000
				//  00000 ... 0 ..1111
				
				//  000 .. 1 .0. 1 .000
				//  000 .. 1 .0. 0 .111
				boolean r = (n & -n) == n;
				
				
				if (r)
					System.out.println(n);
			}
			
			
		}
		
		
		
	}

}
