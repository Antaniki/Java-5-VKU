package ex6_5;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(5);
		System.out.println(rc);
		rc.resize(50);
		System.out.println(rc);
		rc.resize(300);
		System.out.println(rc);
	}
}
