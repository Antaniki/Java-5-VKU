package ex2;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	int getCustomerId() {
		return customer.getId();
	}
	String getCustomerName() {
		return customer.getName();
	}
	double getCustomerDiscount() {
		return customer.getDiscount();
	}
	double getAmountAfterDiscount() {
		this.amount = amount*(1-getCustomerDiscount()/100);
//		this.amount = amount - (amount*getCustomerDiscount()/100);
		return amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Invoice[id="+id+", customer="+customer.toString()+", amount="+amount+"]";
	}
}
