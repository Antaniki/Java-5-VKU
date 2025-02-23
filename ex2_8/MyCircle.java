package ex2_8;

public class MyCircle {
	private MyPoint center = new MyPoint();
	private int radius;
	
	public MyCircle() {
		this.center.setXY(0, 0);;
		this.radius = 1;
	}
	public MyCircle(int x, int y, int radius) {
		this.center.setX(x);
		this.center.setY(y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getCenterX() {
		 return this.center.getX();
	 }
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	public int getCenterY() {
		 return this.center.getY();
	 }
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	public int[] getCenterXY() {
		int[] xy = {this.getCenterX(), this.getCenterY()};
		return xy;
	}
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	public double getCircumference() {
		return Math.PI * 2 * this.radius;
	}
	public double distance(MyCircle circle) {
		return this.center.distance(circle.center);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle[radius="+this.radius+", center="+this.center.toString()+"]";
	}
}
