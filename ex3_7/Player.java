package ex3_7;

public class Player {
	private int number;
	private float x;
	private float y;
	private float z;
	public Player(int number, float x, float y) {
		super();
		this.number = number;
		this.x = x;
		this.y = y;
		this.z = 0.0f;
	}
	
	public void move(float xDisp, float yDisp) {
		this.x += xDisp;
		this.y += yDisp;
	}
	public void jump(float zDisp) {
		this.z += zDisp;
	}
	public boolean near(Ball ball) {
		double distance = Math.sqrt( Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
		if(distance < 8) {
			return true;
		}
		return false;
	}
	public void kick(Ball ball) {
		
	}
	
}
