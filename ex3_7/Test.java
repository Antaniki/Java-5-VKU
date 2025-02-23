package ex3_7;

public class Test {
	public static void main(String[] args) {
		Ball ball = new Ball(-10, -10, 0);
		Player p1 = new Player(1, 3, 4);
		System.out.println(ball);
		if(p1.near(ball)) {
			System.out.println("The ball is near player number 1");
		}
	}
	
}
