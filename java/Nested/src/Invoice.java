
import java.util.*;

public class Invoice 
{
	private String contragent;
	private double total = 0.0;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Накладная\n").
			append("Контрагент: ").
			append(contragent).append("\n").
			append("Сумма: ").append(total).
			append("\n");
		for(Line l : lines)
			sb.append(l);
		
		return sb.toString();
		
		
	}
	
	private List<Line> lines = 
			new ArrayList<Line>();
	
	
	public String getContragent() {
		return contragent;
	}
	
	public void removeLine(Line l)
	{
		if (lines.contains(l))
			lines.remove(l);
		
	}
	
	public double getTotal() {
		return total;
	}

	public Invoice(String contragent) {
		this.contragent = contragent;
	}
	
	public Line addLine(String good, int quantity, double price) {
		Line newLine = new Line(good, quantity, price);
		lines.add(newLine);
		return newLine;
	}
	
	public class Line
	{
		private String good;
		private int quantity;
		private double price;
		private double summa;
		
		private void updateSumma(boolean first)
		{
			if (!first)	total -= summa;
			
			summa = price*quantity;
			total += summa;
			
		
		}
		
		
		public String getGood() {
			return good;
		}
		public void setGood(String good) {
			this.good = good;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
			updateSumma(false);
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
			updateSumma(false);
		}
		public double getSumma() {
			return summa;
		}
		private Line(String good, int quantity, double price) {
			super();
			this.good = good;
			this.quantity = quantity;
			this.price = price;
			updateSumma(true);
			//lines.add(this);
			// Invoice.this.
			
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(good).append("\t").
				append(quantity).append("\t").
				append(price).append("\t").
				append(summa).
				append("\n");
			return sb.toString();
		}
		
		
		
		
	}
	
	
	

}
