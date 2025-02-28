package ex1;

public class OddNumberThread implements Runnable{
	private int maxNumber;
	
	public OddNumberThread(int maxNumber) {
		super();
		this.maxNumber = maxNumber;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= maxNumber; i += 2) {
			System.out.println("Odd thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
