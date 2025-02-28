package ex1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber;
		System.out.println("Chon so toi da: ");
		Scanner sc = new Scanner(System.in);
		maxNumber = sc.nextInt();
		EvenNumberThread eT = new EvenNumberThread(maxNumber);
		Thread t1 = new Thread(eT);
		
		OddNumberThread oT = new OddNumberThread(maxNumber);
		Thread t2 = new Thread(oT);
		
		
		t1.start();
		t2.start();
	}

}
