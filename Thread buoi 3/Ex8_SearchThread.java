package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8_SearchThread implements Runnable{

	File file;
	String keyword;
	int pos;
	
	static int[] result;
	
	public Ex8_SearchThread(File file, String keyword, int pos) {
		this.file = file;
		this.keyword = keyword;
		this.pos = pos;
	}

	//yêu cầu: mỗi thread search keyword trong 1 file
	//két quả trả về: số lượng keyword trong file đó

	@Override
	public void run() {
		String line = "";
		if(file.exists()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				
				while((line = reader.readLine()) != null) {
					result[pos] += line.split(keyword).length-1;
				}
				System.out.println("Đã đọc xong file " + this.file.getName());
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
