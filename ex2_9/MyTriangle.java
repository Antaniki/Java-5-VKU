package ex2_9;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public double getPerimeter() {
		return this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1);
	}
	
	public String getType() {
		double e1 = this.v1.distance(v2);
		double e2 = this.v2.distance(v3);
		double e3 = this.v3.distance(v1);
		if((e1==e2) && (e1==e3) && (e2==e3)) {
			return "Equilateral (Đều)";
		}else if((e1==e2) || (e1==e3) || (e2==e3)) {
			return "Isosceles (Cân)";
		}else {
			return "Scalene (Thường)";
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle[v1="+this.v1.toString()+", v2="+this.v2.toString()+", v3="+this.v3.toString()+"]";
	}
	
}
