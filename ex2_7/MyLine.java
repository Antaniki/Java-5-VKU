package ex2_7;

public class MyLine {
	private MyPoint begin = new MyPoint();
	private MyPoint end = new MyPoint();
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}
	public MyLine(int x1, int y1, int x2, int y2) {
//		this.begin = new MyPoint(x1, y1);
//		this.end = new MyPoint(x2, y2);
		this.begin.setXY(x1, y1);
		this.end.setXY(x2, y2);
	}
	public MyPoint getBegin() {
		return begin;
	}
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	public MyPoint getEnd() {
		return end;
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	public int getBeginY() {
		return this.begin.getY();
	}
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	public int getEndY() {
		return this.end.getY();
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	public int[] getBeginXY() {
		int[] xy = {this.getBeginX(), this.getBeginY()};
		return xy;
	}
	public void setBeginXY(int x, int y) {
		this.setBeginX(x);
		this.setBeginY(y);
	}
	
	public int[] getEndXY() {
		int[] xy = {this.getEndX(), this.getEndY()};
		return xy;
	}
	public void setEndXY(int x, int y) {
		this.setEndX(x);
		this.setEndY(y);
	}
	
	public double getLength() {
		return this.begin.distance(this.end);
	}
	
	public double getGradient() {
		return Math.atan2(this.getBeginY()-this.getEndY(), this.getBeginX()-this.getEndX());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyLine[begin=("+this.begin.toString()+", end=("+this.end.toString()+")]";
	}
}
