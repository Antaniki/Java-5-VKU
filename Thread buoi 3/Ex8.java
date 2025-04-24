package exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) throws InterruptedException {
		String keyword = "";
		ArrayList<Thread> threads = new ArrayList<Thread>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập từ khoá cần tìm: ");
		keyword = sc.nextLine();
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File("Ex8_input1"));
		files.add(new File("Ex8_input2"));
		files.add(new File("Ex8_input3"));
		files.add(new File("Ex8_input4"));
		
		Ex8_SearchThread.result = new int[files.size()];
		int pos= 0;
		for (File file : files) {
			Thread t = new Thread(new Ex8_SearchThread(file, keyword, pos));
			threads.add(t);
			t.start();
			pos++;
		}
		
		for(Thread thread: threads) {
			thread.join();
		}
		for(int i = 0; i < files.size(); i++) {
			System.out.println("Số từ khoá ở file số "+i+" là: "+Ex8_SearchThread.result[i]);
		}
	}
}
