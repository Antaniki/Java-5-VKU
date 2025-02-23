package ex4_4;

public class MovablePoint extends Point{
	
	private float xSpeed;
	private float ySpeed;
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint() {
		super();
		this.xSpeed = 0;
		this.ySpeed = 0;
	}
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed() {
		float[] speed = {this.xSpeed, this.ySpeed};
		return speed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", speed=("+xSpeed+", "+ySpeed+")";
	}
	public MovablePoint move() {
		setX(getX()+xSpeed);
		setY(getY()+ySpeed);
		return this;
	}
	
}
