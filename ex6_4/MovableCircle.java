package ex6_4;

public class MovableCircle implements Movable{

	private int radius;
	private MovablePoint center;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return center.toString() +", radius=" + radius;
	}
	@Override
	public void moveUp() {
		this.center.y += center.ySpeed;
		
	}
	@Override
	public void moveDown() {
		this.center.y -= center.ySpeed;
		
	}
	@Override
	public void moveLeft() {
		this.center.x -= center.xSpeed;
		
	}
	@Override
	public void moveRight() {
		this.center.x += center.xSpeed;
		
	}
	
}
