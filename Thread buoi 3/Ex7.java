package exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) throws InterruptedException {
		File file = new File("Ex7_animal_facts_3MB.txt");
		
		long fileSize = file.length();
		int partSize = 1024 * 1024; // 1MB
				
		int partCount = (int) Math.ceil((double) fileSize / partSize);
		
		//Tạo danh sách kết quả và danh sách thread rỗng, nếu không tạo rỗng thì sau đó nõ sẽ bị lỗi j j đó
		Ex7_FileReader.result = new byte[partCount][];
		Thread[] threads = new Thread[partCount];
		
		for(int i =0; i < partCount; i++) {
			long start = i * partSize;
			int size = (int)Math.min(partSize, fileSize - start);
			
			//có vị trí thứ tự -> có vị trí bắt đầu + có size -> bắt đầu đọc thôi
			Thread t = new Thread(new Ex7_FileReader(file, i, start, size));
			t.start();
			threads[i] = t;		
		}
		
		for(Thread t : threads) {
			t.join();
		}
		
		try(FileOutputStream fos = new FileOutputStream("Ex7_output")){
			for(int i = 0; i < partCount; i++) {
				fos.write(Ex7_FileReader.result[i]);
			}
			System.out.println("Đã viết xong vào output");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File size: " + fileSize);
		System.out.println("Part count: " + partCount);

	}
}
