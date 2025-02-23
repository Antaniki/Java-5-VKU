package ex2_10;
import java.lang.Math;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public int[] getXY() {
		int[] xy = {this.x, this.y};
//		System.out.println(x);
		return xy;
	}
	
	public double distance(int x, int y) {
		double result = Math.sqrt( Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
//		result = Math.floor(result);
		return result;
	}
	
	public double distance(MyPoint point) {
		double result = Math.sqrt( Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
//		result = Math.floor(result);
		return result;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+", "+y+")";
	}
	
}
