package ex2_8;

public class Test {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(2, 3);
		MyCircle c1 = new MyCircle();
		MyCircle c2 = new MyCircle(p1, 8);
		MyCircle c3 = new MyCircle(-3, -3, 2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c1.setCenterXY(-7, -7);
		System.out.println(c1);
		System.out.println(c1.distance(c2));
	}
}
