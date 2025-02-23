package ex6_8;

public class Rectangle implements Movable{
	private MovablePoint topLeft;
	private MovablePoint bottomRight;
	public Rectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "Rectangle[top left: "+this.topLeft.toString()+", bottom right: "+this.bottomRight.toString()+"]";
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		topLeft.moveUp();
		bottomRight.moveUp();
	}
	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}
	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}
	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}
	
	
}
