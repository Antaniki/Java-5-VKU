package ex5_1;

public class Line {
	private Point begin;
	private Point end ;
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	public Line(int x1, int y1, int x2, int y2) {
		this.begin = new Point(x1, y1);
		this.end = new Point(x2, y2);
		this.begin.setXY(x1, y1);
		this.end.setXY(x2, y2);
	}
	public Point getBegin() {
		return this.begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return this.end;
	}
	public void setEnd(Point end) {
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Line[begin=("+this.begin.toString()+", end=("+this.end.toString()+")]";
	}
	
	public int getLength() {
		int xDiff =  begin.getX() - end.getX();
		int yDiff = begin.getY() - end.getY();
		return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		
	}
	public double getGradient() {
		int xDiff =  begin.getX() - end.getX();
		int yDiff = begin.getY() - end.getY();
		return Math.atan2(xDiff, yDiff);
	}
}
