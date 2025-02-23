package ex7_1;

public class Customer {
	private String name;
	private boolean member;
	private String type;
	public Customer(String name) {
		super();
		this.name = name;
		this.member = false;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public boolean isMember() {
		return member;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(isMember()) {
			return "Member[name: "+name+", member: "+isMember()+", Type: "+type+"]";
		}else return "Member[name: "+name+", member: "+isMember()+"]";
	}
}
