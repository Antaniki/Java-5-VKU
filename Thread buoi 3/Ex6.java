package exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {
	public static void main(String[] args) throws InterruptedException, IOException {
		Ex6_FileReader reader1 = new Ex6_FileReader(new File("Ex6_input1"), 1);
		Ex6_FileReader reader2 = new Ex6_FileReader(new File("Ex6_input2"), 2);
		Ex6_FileReader reader3 = new Ex6_FileReader(new File("Ex6_input3"), 3);
		Thread t1 = new Thread(reader1);
		Thread t2 = new Thread(reader2);
		Thread t3 = new Thread(reader3);
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("Ex6_output"));
		writer.write(reader1.content);
		writer.newLine();
		writer.write(reader2.content);
		writer.newLine();
		writer.write(reader3.content);
		writer.flush();
		writer.close();
		System.out.println("Đã viết xong vào file output");
	}
}
