package ex6_4;

public class Test {
	public static void main(String[] args) {
		Movable p1 = new MovableCircle(3, 3, 2, 2, 5);
		System.out.println(p1);
		p1.moveDown();
		p1.moveDown();
		System.out.println(p1);
		p1.moveRight();
		System.out.println(p1);	
	}
}
