package ex4_4;

public class Point {
	private float x;
	private float y;
	public Point() {
		super();
		this.x = 0.0f;
		this.y = 0.0f;
	}
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public float[] getXY(){
		float[] xy = {this.x, this.y};
		return xy;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+", "+y+")";
	}
	
	
}
