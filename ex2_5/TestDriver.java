package ex2_5;

public class TestDriver {
	public static void main(String[] args) {
		Customer c1 = new Customer(1, "An", 'm');
		Customer c2 = new Customer(2, "Binh", 'f');
		System.out.println(c1);
		System.out.println(c2);
		Account a1 = new Account(11, c1, 1001.0011);
		Account a2 = new Account(12, c2, 100.0);
		System.out.println(a1);
		System.out.println(a2);
		a1.deposit(9999.0);
		a2.withdraw(10000.0);
		System.out.println(a1);
		System.out.println(a2);
	}
}
