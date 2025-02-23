package ex3_6;

public class Container {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Container(int x, int y, int width, int heigth) {
		super();
		this.x1 = x;
		this.y1 = y;
		this.x2 = this.x1 + width;
		this.y2 = this.y1 - heigth;
	}
	public int getX() {
		return x1;
	}
	
	public int getY() {
		return y1;
	}

	public int getWidth() {
		return this.x2 - this.x1;
	}
	public int getHeigth() {
		return this.y1 - this.y2;
	}
	public boolean collidesWith(Ball ball) {
		if(((ball.getX()-ball.getRadius())<= this.x1) || 
			((ball.getX()+ball.getRadius()) >= x2)) {
			ball.reflectHorizontal();
			return true;
		}
		if(((ball.getY()+ball.getRadius()) >= y1) ||
			 ((ball.getY()-ball.getRadius()) <= y2)){
				 ball.reflectVertical();
				 return true;
			 }
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Container [("+x1+", "+y1+"), ("+x2+", "+y2+")]";
	}
	
}
