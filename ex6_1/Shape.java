package ex6_1;

public abstract class Shape {
	protected String color;
	protected boolean filled;
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public Shape() {
		super();
		this.color = "red";
		this.filled = true;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape[color="+color+", filled="+filled+"]";
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
