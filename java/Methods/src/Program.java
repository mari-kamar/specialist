
import java.util.Date;
//import static java.lang.Math.sin;
//import static java.lang.Math.PI;
import static java.lang.Math.*;
import static java.lang.System.out;

public class Program {

	public static double average(int... m) {
		int summa = 0;
		for(int k : m)
			summa += k;
		
		return (double)summa / m.length;
	}
	
	public static double average(int a, int b) {
		double avg = (a+b) / 2d;
		
		return avg;
	}
	
	public static void sayHello(int age) {
		System.out.printf("Привет, твой возраст %d!\n", age);
	}
	public static void sayHello() {
		//System.out.printf("Привет!\n");
		sayHello("Незнакомец");
	}
	public static void sayHello(String name) {
		System.out.printf("Привет, %s!\n", name);
	}
	public static void sayHello(String name, int age) {
		System.out.printf("Привет, %s - %d!\n", name, age);
		//return;
	}
	
	public static void test1(int a) {
		a++;
		out.printf("test1 a = %d\n", a); // 11
	}
	public static void test2(int[] a) {
		a[0]++;
		out.printf("test2 a = %d\n", a[0]); // 11
	}
	public static void test4(String a) {
		a = a + "!";
		out.printf("test4 a = %s\n", a); // Sergey!
	}
	public static void test5(StringBuilder a) {
		a.append("!");
		out.printf("test5 a = %s\n", a); // Sergey!
	}
	
	
	public static void main(String[] args) {
		{
			StringBuilder a = new StringBuilder("Sergey");
			test5(a);
			out.printf("main5 a = %s\n", a);  // Sergey!
		}
		{
			String a = "Sergey";
			test4(a);
			out.printf("main4 a = %s\n", a);  // Sergey
		}
		{
			int a = 10;
			test1(a);
			out.printf("main1 a = %d\n", a); // 10
		}
		{
			int[] a = {10};
			test2(a);
			out.printf("main2 a = %d\n", a[0]); // 11
		}
		
		{
			int[] a = {10};
			test2(a.clone());
			out.printf("main3 a = %d\n", a[0]); // 11
		}
		
		
		
		//Program p = new Program();
		//p.sayHello();
		Program.sayHello("Саша", 9);
		sayHello("Костя", 12);
		sayHello("Наталия");
		sayHello(38);
		sayHello();
		
		double x = 2; // y = f(x) y = sin(pi*log(x))
		double y = sin(Math.PI *Math.log(x));
		out.println(y);
		
		y = average(10, 11);
		out.println(y);
		
		
		
		out.println(average(10, 11));
		out.println(average( new int[] {10, 11, 12, 13}));
		out.println(average( 10, 11, 13 ));
		

	}

}
