package ex2_9;

public class Test {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3, 0);
		MyPoint p3 = new MyPoint(0, 3);
		MyTriangle tri1 = new MyTriangle(p1, p2, p3);
		System.out.println(tri1);
		System.out.println(tri1.getPerimeter());
		System.out.println(tri1.getType());
	}
}
