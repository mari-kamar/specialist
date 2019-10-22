import ru.specialist.stuff.Person;
// import static ru.specialist.stuff.Person.counter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ru.specialist.graph.*;


public class Program {

	public static void main(String[] args) {
		{
			//System.out.printf("Total persons: %d\n", Person.counter);
			Person.printTotalPersons();
			
			Person p1 = new Person("Сергей", 40);
			//p1.name = "Сергей";
			//p1.age = 40;
			
			Person p2 = new Person("Наталия", 35);
			//p2.name = "Наталия";
			//p2.age = 35;
			Person px = new Person("Костя", 12);
			Person px2 = new Person("Саша", 9);
			
			ArrayList<Person> persons = new ArrayList<Person>();
			persons.add(px);
			persons.add(p1);
			persons.add(px2);
			persons.add(p2);
			
			Collections.sort(persons);
			//Collections.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge() );
			Collections.sort(persons, Person.byAgeReverse );
			
			for(Person p : persons)
				p.show();
			
			
			
			//p1.show();
			//p2.show();
			//px.show();
			
			System.out.println(p1);
			
			//System.out.printf("Total persons: %d\n", Person.counter);
			Person.printTotalPersons();
		}
		{
			Point p1 = new Point(10, 20, "green"); 
					//Point.create(10, 20, "green");
					//new Point(10, 20, "green");
			//p1.color = "red";
			Point p2 = p1.clone();
			p1.color = "red";
			p1.draw(); // Point.draw
			
			GraphObject g1 = p1; 
					//new Point(x, y, color)
			g1.draw(); // Point.draw
			
			g1.color = "pink";
			
			Point p3 = (Point)g1;
			
			//p1.draw();
			
			Object o1 = p1;
			
			
			Circle c1 = Circle.create(10, 200, 50, "yellow"); 
					//new Circle(100, 200, 50, "yellow");
			c1.scale(1.5);
			//c1.r = 10;
			//c1.setR(10);
			System.out.println(c1.getR());
			g1 = c1;
			

			g1.draw(); // Circle.draw()
			//g1.r = 20;
			
			/*
			 * 	Class		Method		Address
			 * GraphObject	draw		XXX
			 * Point		draw		YYY
			 * Circle		draw		ZZZ
			 */
			
			if (g1 instanceof Point) {
				Point p4 = (Point)g1;
			}
			
			o1 = c1;
			
			o1 = "abc";
			o1 = new Program();
			double x = 2.5;
			
			o1 = x; // boxing
			
			if (o1 instanceof Double) {
				double y = (double)o1; // unboxing
				x = y*y;
			}
			
			Scaleable s1 = c1;
			//s1.scale(5);
			GraphObject.scaleScene(5);
			GraphObject.drawScene();
			
			//g1 = new GraphObject();
			
			
			//GraphObject.drawScene();
			//p1.draw();
			//p2.draw();
			//System.out.println(p1);
			
		}
		{
			Singleton1 s1 = Singleton1.getInstance();
					//Singleton1.instance; 
					//new Singleton1();
			Singleton1 s2 = Singleton1.getInstance();
			//Singleton1.instance;
			//new Singleton1();
			
			System.out.println(s1);
			System.out.println(s2);
			
		}
	}

}
