package ex4_5;

public class Square extends Rectangle{

	public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(color, filled, side, side);
	}
	public double getSide() {
		return super.getWidth();
	}
	public void setSide(double side) {
		this.setLength(side);
	}
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square["+super.toString()+"]";
	}
}
