package ru.specialist.graph;

import java.io.Serializable;

public class Circle extends GraphObject 
implements Scaleable,SuperScaleable,Serializable {
	
	public int x;
	public int y;
	
	private int r;
	
	public int getR() {
		return r;
	}
	
	/**
	 * @param r new radius
	 * @throws 
	 */
	public void setR(int r) {
		
		if (r <= 0) throw new RuntimeException("r <= 0");
		//if (r > 0)
			this.r = r; 
	}
	
	public static Circle create(int x, int y, int r, String color) {
		Circle c = new Circle(x,y,r,color);
		scene.add(c);
		return c;
	}
	public Circle(int x, int y, int r) {
		this(x,y,r,DEFAULT_COLOR);
	}
	
	public Circle(int x, int y, int r, String color) {
		super(color);
		this.x = x;
		this.y = y;
		//this.r = r;
		setR(r);
	}
	
	
	// int draw;
	
	@Override
	public void draw() {
		System.out.printf("Circle (%d, %d) R: %d. %s\n",x,y,getR(),color);
	}
	
	public void scale(double factor) {
		//r = (int)(r*factor);
		setR((int)(getR()*factor));
	}

	@Override
	public void scale() {
		Scaleable.super.scale();
	}

	
	
	

}
