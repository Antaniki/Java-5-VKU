package ex6_3;

public class Test {
	public static void main(String[] args) {
		Movable p1 = new MovablePoint(2, 2, 1, 1);
		System.out.println(p1);
		p1.moveDown();
		p1.moveDown();
		System.out.println(p1);
		p1.moveRight();
		System.out.println(p1);	
	}
}
