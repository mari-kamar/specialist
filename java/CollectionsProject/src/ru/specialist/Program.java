package ru.specialist;

import java.util.*;
import java.io.*;

class Test
{
	private String data;

	public Test(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}
	
	
	@Override
	public int hashCode()
	{
		return getData().hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Test)
		{ 
			Test t1 = (Test)obj;
			return getData().equals(t1.getData());
		}
		else return false;
		
	}
}

public class Program
{

	public static void savePersons(Map<String, Integer> p) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("person.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
	}
	
	
	
	
	public static Map<String, Integer> loadPersons()  throws IOException, 
		ClassNotFoundException
	{
		
		FileInputStream fis = new FileInputStream("person.bin");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Map<String, Integer> p = (Map<String, Integer>)ois.readObject();
		
		ois.close();
		fis.close();
		
		return p;
	}
	
	public static boolean testString(String s)
	{
		System.out.printf("%s : ",s);
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch == '(' || ch=='[')
				st.push(ch);
			if (ch == ')' || ch==']')
			{
				if (st.size() == 0) return false;
				char p = st.pop();
				if ( !((p=='(' && ch==')') || (p=='[' && ch==']')) )
					return false;
			}
		}
		
		return st.size() == 0;
		
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		//System.out.println(
		//		testString("([sdaf])adsfjk(s)d[()as()](sdf)"));
		
		Map<String, Integer> persons = 
				new Hashtable<String, Integer>();
		
		persons.put("Сергей", 40);
		persons.put("Наталия", 35);
		persons.put("Костя", 11);
		persons.put("Саша", 7);
		
		persons.put("Костя", 12);
		
		System.out.println(persons.size());
		
		String name = "Костя";
		if (persons.containsKey(name))
		{
			int age = persons.get(name);
			System.out.printf("%s - %d\n", name, age);
		}
		
		/*{
		
		Set<String> set = new HashSet<String>();
		
		set.add("one");
		set.add(new String("two"));
		set.add(new String("two"));
		
		System.out.println(set.size());
		for(String t : set)
			System.out.println(t);
			
		}*/
		{
		Set<Test> set = new HashSet<Test>();
		
		set.add(new Test("one"));
		set.add(new Test("two"));
		set.add(new Test("two"));
		
		System.out.println(set.size());
		for(Test t : set)
			System.out.printf("%s : %d\n",t.getData(), t.hashCode());
		}
			//System.out.println(t);
		
		
		//Map<Test, String> test = new Hashtable<>();
		//Test t1 = new Test("one");
		//Test t2 = new Test("two");
		
		//test.put(t1, "один");
		//test.put(t2, "два");
		
		//System.out.println(test.get(t2));*/
		/*
		savePersons(persons);
		persons = null;
		
		persons = loadPersons();
		
		for(Map.Entry<String, Integer> p : persons.entrySet())
			System.out.printf("%s - %d\n", p.getKey(), p.getValue());
		*/

	}

}
