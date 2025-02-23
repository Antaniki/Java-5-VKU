package ex1;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Getter 7 setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea () {
		return radius*radius*3.14;
	}
	
	public double getCircumference () {
		return 2*radius*3.14;
	}
	
	public String toString() {
		return "Circle[radius: "+radius+"]";
	}
}

