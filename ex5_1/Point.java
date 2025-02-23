package ex5_1;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
	      return "Point: (" + x + "," + y + ")";
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
}
