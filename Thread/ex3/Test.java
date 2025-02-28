package ex3;

public class Test {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(10);
		Producer p1 = new Producer(queue);
		Customer c1 = new Customer(queue);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(p1);
		t1.start();
		t2.start();
	}
}
