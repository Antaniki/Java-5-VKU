package ex6_1;

public class Circle extends Shape {
	protected double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
		this.radius = 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea () {
		return radius*radius*3.14;
	}
	
	@Override
	public double getPerimeter () {
		return 2*radius*3.14;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle["+super.toString()+", radius="+radius+"]";
	}
	
	
}
