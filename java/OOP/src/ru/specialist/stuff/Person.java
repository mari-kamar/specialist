package ru.specialist.stuff;

import java.time.LocalDate;
import java.util.Comparator;

public class Person implements Comparable<Person> 
{
	public String name = "Незнакомец"+"!";
	//private int age;
	private int birthYear;
	
	public final static Comparator<Person> byAge = 
			(o1, o2) -> o1.getAge() - o2.getAge();
			
	public final static Comparator<Person> byAgeReverse = 
			(o1, o2) -> o2.getAge() - o1.getAge();
	
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}
	
	public void setAge(int age) {
		//this.age = age;
		this.birthYear = LocalDate.now().getYear() - age;
	}
	
	
	public static int counter = 0;
	
	{
		//age = 18;
	}
	
	static
	{
		counter = 0;
	}
	
	public static void printTotalPersons() {
		
		System.out.printf("Total persons: %d\n", Person.counter);
	} 
	
	// draw()
	
	// Point moveBy(dx, dy)
	
	// Circle scale(double factor)
	
	public Person() {
		this("Unknown");
		//this.name = "Unknown";
		//this.age = 20;
	}
	public Person(String name) {
		this(name, 20);
		//this.name = name;
		//this.age = 20;
	}
	
	public Person(String name, int age) {
		this.name = name;
		//this.age = age;
		setAge(age);
		//Person.counter++;
		counter++;
	}
	
	
	public void show() {
		//this
		//this.name
		//counter
		String name = "abc";
		System.out.printf("%s - %d\n", this.name, this.getAge());
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
		//return this.getAge() - p.getAge();
	}

}
