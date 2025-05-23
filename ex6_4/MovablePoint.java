package ex6_4;

public class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+", "+y+"), speed=("+xSpeed+", "+ySpeed+")";
	}
	@Override
	public void moveUp() {
		this.y += ySpeed;
		
	}
	@Override
	public void moveDown() {
		this.y -= ySpeed;
		
	}
	@Override
	public void moveLeft() {
		this.x -= xSpeed;
		
	}
	@Override
	public void moveRight() {
		this.x += xSpeed;
		
	}
}
