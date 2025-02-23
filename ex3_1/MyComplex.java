package ex3_1;

public class MyComplex {
	private double real;
	private double imag;
	public MyComplex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	public MyComplex() {
		this.real = 0.0;
		this.imag = 0.0;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.setReal(real);
		this.setImag(imag);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.real+"+"+this.imag+"i";
	}
	
	public boolean isReal() {
		if(this.imag == 0) {
			return true;
		}else return false;
	}
	
	public boolean isImaginary() {
		if(this.real == 0) {
			return true;
		}else return false;
	}
	public boolean equals(double real, double imag) {
		if((this.real == real) && (this.imag == imag)) {
			return true;
		}else return false;
	}
	public boolean equals(MyComplex another) {
		if((this.real == another.real) && (this.imag == another.imag)) {
			return true;
		}else return false;
	}
	public double magnitude() {
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
	}
	
	public MyComplex add(MyComplex another) {
		this.real = this.real + another.real;
		this.imag = this.imag + another.imag;
		return this;
	}
	public MyComplex addNew(MyComplex another) {
		MyComplex c = new MyComplex();
		c.setReal(this.real + another.real);
		c.setImag(this.imag + another.imag);
		return c;
	}
	public double argument() {
		return Math.atan2(this.real, this.imag);
	}
	public MyComplex subtract(MyComplex another) {
		this.real = this.real - another.real;
		this.imag = this.imag - another.imag;
		return this;
	}
	public MyComplex subtractNew(MyComplex another) {
		MyComplex c = new MyComplex();
		c.setReal(this.real - another.real);
		c.setImag(this.imag - another.imag);
		return c;
	}
	public MyComplex multiply(MyComplex right) {
		double a = this.real;
		double b = this.imag;
		double c = right.real;
		double d = right.imag;
		this.setValue(a*c - b*d, a*d + b*c);
		return this;
	}
	public MyComplex conjugate() {
		this.setImag(-imag);
		return this;
	}
	public MyComplex divide(MyComplex right) {
		double c = right.real;
		double d = right.imag;
		MyComplex t = this.multiply(right.conjugate());
		MyComplex m = new MyComplex(c*c+d*d, 0);
				
		return this;
	}
}
