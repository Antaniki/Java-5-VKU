package ex3_3;

import java.math.BigInteger;

public class TestBigInteger {
	public static void main(String[] args) {
		BigInteger n1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
		BigInteger n2 = new BigInteger("22222222222222222222222222222222222222222222222222");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1.add(n2));
	}
}
