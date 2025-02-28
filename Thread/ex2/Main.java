package ex2;

public class Main {
	public static void main(String[] args) {
		DaiLyBanVe dl1 = new DaiLyBanVe("Đông Xuân");
		DaiLyBanVe dl2 = new DaiLyBanVe("Hà Tây");
		
		Thread t1 = new Thread(dl1);
		Thread t2 = new Thread(dl2);
		t1.start();
		t2.start();
	}
}
