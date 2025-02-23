package ex2_5;

public class Account {
	private int id;
	private Customer customer;
	private double balance;
	public Account(int id, Customer customer, double balance) {
		
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	public Account deposit(double amount) {
		setBalance(getBalance() + amount);
		return this;
	}
	
	public Account withdraw(double amount) {
		if(amount > getBalance()) {
			System.out.println("Amount withdrawn exceeds the current balance!");
		}else {
			setBalance(getBalance() - amount);
		}
		return this;
	}
	@Override
	public String toString() {
		
		return customer.toString() + "	| balance= $" +getBalance();
	}
}
