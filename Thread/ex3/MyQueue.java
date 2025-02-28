package ex3;

import java.util.Vector;

public class MyQueue {
	private int max;
	private Vector<String> queue;
	public MyQueue(int max) {	
		this.max = max;
		this.queue = new Vector<String>();
	}
	
	public synchronized void add() throws InterruptedException {
		
		while(this.queue.size() == this.max) {
			System.out.println("Hàng đợi đầy! Đang chờ customer...");
			wait();
		}
		this.queue.add("Item");
		Thread.sleep(1000);
		System.out.println("Đã sản xuất ra 1 item");
		notify();
	}
	
	public synchronized void take() throws InterruptedException {
		
		while(queue.size() == 0) {
			System.out.println("Sản phẩm hết! Đang chờ producer...");
			wait();
		}
		this.queue.remove(0);
		Thread.sleep(1000);
		System.out.println("Đã tiêu thụ 1 item");
		notify();
	}


}
