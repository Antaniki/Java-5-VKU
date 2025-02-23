package ex6_5;

public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Resizable Circle["+super.toString()+"]";
	}
	
	@Override
	public void resize(int percent) {
		radius *= (percent/100.0);
	}
}
