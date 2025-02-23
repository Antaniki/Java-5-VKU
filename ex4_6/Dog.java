package ex4_6;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog another) {
		System.out.println("Woof woof");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dog["+super.toString()+"]";
	}
}
