package ex1;

public class InvoiceItem {
	private String id;
	private String desc;
	private  int qty;
	private double unitPrice;
	
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}


	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return unitPrice * qty;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "InvoiceItem[id="+id+", desc="+desc+", qty="+qty+", unitPrice="+unitPrice+"]";
	}
	
}
