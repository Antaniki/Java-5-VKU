package ex5_2;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	
	//Getter 7 setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

