package ex2_10;

public class Test {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1, 5);
		MyPoint p2 = new MyPoint(4, 1);
		MyRectangle r1 = new MyRectangle(p1, p2);
		MyRectangle r2 = new MyRectangle(2, 2, -5, -5);
		 System.out.println(r1);
		 System.out.println(r2);
	}
}
