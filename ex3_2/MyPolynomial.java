package ex3_2;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {		
		this.coeffs = coeffs;
	}
	
	public int getDegree() {
		return this.coeffs.length-1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		for(int i = this.coeffs.length-1; i >= 1; i--) {
			str += this.coeffs[i]+".x^"+(i)+" + ";
		}
		str += this.coeffs[0];
		return str;
	}
	
	public double evaluate(double x) {
		double result = 0;
		for(int i = this.coeffs.length-1; i >= 0; i--) {
			result += this.coeffs[i] * Math.pow(x, i);			
		}
		return result;
	}
	
	public MyPolynomial add(MyPolynomial another) {
		int count = Math.min(this.getDegree(), another.getDegree());
//		if(count = this.getDegree()) {
//			MyPolynomial temp = this;
//			this = another;
//			another = temp;
//		}
		for(int i=0; i <= count; i++) {
			this.coeffs[i] += another.coeffs[i];
		}
		return this;
	}
	
}
