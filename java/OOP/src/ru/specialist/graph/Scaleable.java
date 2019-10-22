package ru.specialist.graph;

public interface Scaleable {
	public static final double DEFAULT_FACTOR = 2;
	
	// public abstract 
	void scale(double factor);
	
	// since 9
	private void scaleImpl() {
		this.scale(DEFAULT_FACTOR);
	}
	
	// since 8
	default void scale() {
		scaleImpl();
	}
	
	

}

interface SuperScaleable {
	default void scale() {
		
	}
	
}

interface Scaleable3D extends Scaleable {
	void scale3D(double factorX, double factorY, double factorZ);
}
