package ex4_6;

public class Cat extends Mammal{

	public Cat(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Meow meow");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cat["+super.toString()+"]";
	}
}
