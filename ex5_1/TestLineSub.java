package ex5_1;

public class TestLineSub {
	public static void main(String[] args) {
		Point p1 = new Point(2, 2);
		Point p2 = new Point(5, 5);
		LineSub ls1 = new LineSub(p1, p2);
		System.out.println(ls1);
		ls1.setBegin(p2);
		ls1.setEnd(p1);
		System.out.println(ls1);
	}
}
