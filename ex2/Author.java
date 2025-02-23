package ex2;

public class Author {
	private String name;
	private String email;
	public Author(String name, String email) {	
		this.name = name;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Author[Name="+name+", email="+email+"]";
	}
	
}
