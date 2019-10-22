
public class Program {
	public static void main(String[] args) {
		Outer.Nested n = new Outer.Nested();
		
		Outer o = new Outer(5);
		
		n.increment(o);
		
		
		Outer.Inner i1 = o.new Inner() ;
		Outer.Inner i2 = o.new Inner() ;
		i1.increment();
		i2.increment();
		
		Invoice inv = new Invoice("Рога&Копыта");
		inv.addLine("Флэшка", 2, 500);
		Invoice.Line l1 = inv.addLine("Книга", 1, 300);
		l1.setPrice(600);
		
		System.out.println(inv);
		
		System.out.println(o.getData());
	}

}
