package ex2_7;

public class Test {
	public static void main(String[] args) {
		MyLine l1 =  new MyLine(1, 1, 5, 5);
		MyPoint b1 = new MyPoint(3, 4);
		MyPoint e1 = new MyPoint(-2, 4);
		MyLine l2 = new MyLine(b1, e1);
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("x dau tien cua l1: "+ l1.getBeginX());
		System.out.println("x thu hai cua l1: "+ l1.getEndX());
		System.out.println("y dau tien cua l1: "+ l1.getBeginY());
		System.out.println("y thu hai cua l1: "+ l1.getEndY());
		System.out.println("Chieu dai: "+ l1.getLength());
	}
}
