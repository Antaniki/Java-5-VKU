package ex3_7;

public class Ball {
	private float x;
	private float y;
	private float z;
	public Ball(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getZ() {
		return z;
	}
	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+", "+y+", "+z+")";
	}
}
