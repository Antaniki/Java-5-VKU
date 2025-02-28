package ex2;

public class DaiLyBanVe implements Runnable{
	
	public static int tongve = 20;
	
	private String name;
	public DaiLyBanVe(String name) {
		this.name = name;
	}
	
	
	public static int getTongve() {
		return tongve;
	}


	public String getName() {
		return name;
	}


	public synchronized void banVe() {
		if(tongve > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tongve -= 1;
			System.out.println(this.getName() +" đã bán được 1 vé!");
		}else {
			
			System.out.println("Gửi "+this.getName()+", số vé đã hết!");
		}
	}
	@Override
	public void run() {
		while(tongve > 0) {
			banVe();
		}
	}
}
