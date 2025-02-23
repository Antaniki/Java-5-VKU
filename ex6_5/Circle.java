package ex6_5;

public class Circle implements GeometricObject{
	protected double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle[ radius="+radius+"]";
	}
	
	@Override
	public double getArea() {
		return radius*radius*3.14;
	}
	@Override
	public double getPerimeter() {
		return 2*radius*3.14;
	}
	
	
}
