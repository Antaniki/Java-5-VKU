package ex4_6;

public class Test {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Yumi");
		Dog dog1 = new Dog("Inu");
		System.out.println(cat1);
		cat1.greets();
		System.out.println(dog1);
		dog1.greets();
	}
}
