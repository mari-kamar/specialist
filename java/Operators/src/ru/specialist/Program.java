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
			System.out.println("a ������ ����");
			System.out.println("a > 0");
		}
		else 
			if (a > -100)
				System.out.println("a ������ -100");
			else
				System.out.println("a �� ������ ����");
				
		int n = 0;
		/*String s;
		if (n == 0)
			s = "����";
		else
			s = "�� ����";*/
				
		final String s = (n == 0) ? "����" : "�� ����";
		//s = "!";
		final int B = 10;
		
		final int x = B+5;
		
		switch (x) {
			case -1:
			case 1:
				System.out.println("����");
				break; // return
			case 1+1:
				System.out.println("���");
				break;
			case 3:
				System.out.println("���");
				break;
			default:
				System.out.println("�����");
		}
		
		//  �� ����� 5 �����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
