package ex5_2;

public class Test {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(3);
		System.out.println(c);
		System.out.println(c.getVolume());
		Circle c1 = new Circle(5);
		Cylinder cy2 = new Cylinder(c1.getRadius(), 3);
		System.out.println(cy2);
		System.out.println(cy2.getVolume());
	}
}
