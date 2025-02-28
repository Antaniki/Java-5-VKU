package ex3;

public class Customer implements Runnable{

	MyQueue queue;
	
	public Customer(MyQueue queue) {
		super();
		this.queue = queue;
	}
	public synchronized void consume() throws InterruptedException {
		
		queue.take();
	}
	@Override
	public void run() {
		while(true) {
			try {
				this.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
