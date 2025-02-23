package ex7_1;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Customer c1 = new Customer("An");
		c1.setMember(true);
		c1.setType("Premium");
		Visit v1 = new Visit(c1, null);
		v1.setProductExpense(1000.0);
		v1.setServiceExpense(2000.0);
		System.out.println(v1.getTotalExpense());
		System.out.println(c1.isMember());
		
//		Visit v2 = new Visit(c1, null);
//		v2.setProductExpense(1000.0);
//		v2.setServiceExpense(2000.0);
//		System.out.println(v2.getTotalExpense());
	}
}
