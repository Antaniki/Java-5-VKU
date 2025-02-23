package ex7_1;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	public Visit(Customer customer, Date date) {
		this.customer = customer;
	}
	public Visit(String name, Date date) {
		customer = new Customer(name);
		this.date = date;
	}
	public double getServiceExpense() {
		if(customer.isMember()) {
			return serviceExpense * (1-DiscountRate.getServiceDiscountRate(customer.getType()));
		}else return serviceExpense;
	}
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public double getProductExpense() {
		if(customer.isMember()) {
			return productExpense * (1-DiscountRate.getProductDiscountRate(customer.getType()));
		}else return productExpense;
	}
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	public String getName() {
		return customer.getName();
	}
	public double getTotalExpense() {
		return getProductExpense()+getServiceExpense();
	}
	
}
