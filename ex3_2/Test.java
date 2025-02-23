package ex3_2;

public class Test {
	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(3, 2, 4);
		MyPolynomial p3 = new MyPolynomial(4, 7, 12, 2);
		System.out.println(p1);
		System.out.println(p1.evaluate(2));
		System.out.println(p1.getDegree());
		
		System.out.println(p3);
		System.out.println(p3.getDegree());
		
		System.out.println(p3.add(p1));
		
//		double coeffs = {1.0, 4.3, 3.0};
//		MyPolynomial p2 = new MyPolynomial(coeffs);
//		System.out.println(p2);
	}
}
