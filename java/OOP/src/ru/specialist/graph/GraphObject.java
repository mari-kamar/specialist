package ru.specialist.graph;

import java.util.ArrayList;
import java.util.Collections;


/*
	Modifier	Access Level	Visibility
	public		public			World
				package			this package only
	
*/
public /* final */ abstract class GraphObject implements Comparable<GraphObject>{
	
	public static final String DEFAULT_COLOR = "black";
	
	static ArrayList<GraphObject> scene = new ArrayList<GraphObject>(); 
	
	/*
	Modifier	Access Level	Visibility
	public		public			World
	private		private			this class
				package			this package
	protected	protected		this class+this package+subclass
	
	
*/
	public String color;
	
	private int zIndex;
	
	public int getzIndex() {
		return zIndex;
	}
	public void setzIndex(int zIndex) {
		this.zIndex = zIndex;
	}
	public GraphObject() {
		this(DEFAULT_COLOR);
	}
	public GraphObject(String color) {
		this.color = color;
		//scene.add(this); // bad
	}
	
	@Override
	public int compareTo(GraphObject g) {
		return this.getzIndex() - g.getzIndex();
	}
	
	public static void clearScene() {
		scene.clear();
	}
	
	public static void drawScene() {
		
		//Collections.sort(scene);
		Collections.sort(scene, (g1, g2) -> g1.getzIndex()-g2.getzIndex() );
		
		for(GraphObject g : scene)
			g.draw();
	} 
	
	public static void scaleScene(double factor) {
		for(GraphObject g : scene) {
			if (g instanceof Scaleable) {
				Scaleable s = (Scaleable)g;
				s.scale(factor);
			}
		}
	} 
	
	public abstract void draw();
	//public abstract void scale(double factor); 
	//{
		//System.out.printf("GraphObject. %s\n", this.color);
		
	//}
	
	

}
