package ex4_2;

public class Person {
	private String name;
	private String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[name= "+name+", address= "+address+"]";
	}
}
