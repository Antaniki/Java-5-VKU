package ex6_6;

public class BigDog extends Dog{

	public BigDog(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Woow woow");
	}
	
	@Override
	public void greets(Dog another) {
		System.out.println("Wooooow (big greets normal)");
	}
	
	public void greets(BigDog another) {
		System.out.println("Woooooooow (big greets big)");
	}
}
