package ex2_10;

public class MyRectangle {
	private MyPoint tlpoint;
	private MyPoint brpoint;
	
	public MyRectangle(MyPoint tlpoint, MyPoint brpoint) {
		this.tlpoint = tlpoint;
		this.brpoint = brpoint;
	}
	public MyRectangle(int xtl, int ytl, int xbr, int ybr) {
		this.tlpoint = new MyPoint(xtl, ytl);
		this.brpoint = new MyPoint(xbr, ybr);
	}
	
	public double getPerimeter() {
		double e1 = tlpoint.distance(this.tlpoint.getX(), this.brpoint.getY());
		double e2 = brpoint.distance(this.tlpoint.getX(), this.brpoint.getY());
		return (e1 + e2)*2;
	}
	
	public double getArea() {
		double e1 = tlpoint.distance(this.tlpoint.getX(), this.brpoint.getY());
		double e2 = brpoint.distance(this.tlpoint.getX(), this.brpoint.getY());
		return e1 * e2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle[top left: "+this.tlpoint.toString()+", bottom right: "+this.brpoint.toString()
		+"Area= "+this.getArea()+", Perimeter="+this.getPerimeter()+"]";
	}
	
	
}
