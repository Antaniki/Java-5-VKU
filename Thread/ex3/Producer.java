package ex3;

public class Producer implements Runnable{

	private MyQueue queue;
	
	public Producer(MyQueue queue) {
		super();
		this.queue = queue;
	}

	public void produce() throws InterruptedException{
		queue.add();
	}
	@Override
	public void run() {
		while(true) {
			try {
				this.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
