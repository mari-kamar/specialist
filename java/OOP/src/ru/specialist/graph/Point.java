package ru.specialist.graph;

public class Point extends GraphObject {
	
	public int x;
	public int y;
	
	//String color;
	
	public static Point create(int x, int y, String color) {
		Point p = new Point(x,y,color);
		scene.add(p);
		return p;
	}
	public static Point create(Point p) {
		return create(p.x, p.y, p.color);
	}
	
	protected Point(int x, int y) {
		this(x,y,DEFAULT_COLOR);
	}
	
	public Point(int x, int y, String color) {
		super(color);
		this.x = x;
		this.y = y;
		//this.color = color;
	}
	
	protected Point(Point p) {
		this(p.x, p.y, p.color);
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	
	@Override
	public void draw() {
		//super.draw();
		System.out.printf("Point (%d, %d). %s\n", x,y,super.color);
		//super.draw();
	}
	
	@Override
	public String toString() {
		return String.format("Точка (%d, %d). %s", x,y,color);
	}
	
	@Override
	public Point clone() {
		return  create(this);
				//new Point(this);
	}
	

}
