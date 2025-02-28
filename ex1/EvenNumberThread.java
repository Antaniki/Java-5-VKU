package ex1;

public class EvenNumberThread implements Runnable{
	private int maxNumber;
	
	public EvenNumberThread(int maxNumber) {
		super();
		this.maxNumber = maxNumber;
	}

	@Override
	public void run() {
		for(int i = 0; i <= maxNumber; i += 2) {
			System.out.println("Even thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
