package ru.specialist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ���: ");
		String userName = reader.readLine();
		
		if (userName.isEmpty())
			userName = "����������";
			
		System.out.printf("������, %s!", userName);

	}

}
