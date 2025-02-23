package ex5_1;


public class LineSub extends Point{
	//1 line thì có 2 point đầu cuối, class này kế thừa point đầu
	//nên chỉ khai báo thêm 1 point cuối
	private Point end ;
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	public LineSub(int x1, int y1, int x2, int y2) {
		super(x1, y1);
		this.end = new Point(x2, y2);
	}
//	public Point getBegin() {
//		
//		return super;
//	}
	
	public void setBegin(Point begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}
	public Point getEnd() {
		return this.end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return super.getX();
	}
	public void setBeginX(int x) {
		super.setX(x);
	}
	public int getBeginY() {
		return super.getY();
	}
	public void setBeginY(int y) {
		super.setY(y);
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
		return "LineSub" + "[begin=("+super.toString()+", end=("+this.end.toString()+")]";
	}
}

