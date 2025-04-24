package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex7_FileReader implements Runnable{

	File file;
	int partIndex; //số thứ tự
	long startPosition;
	int readSize;
	public static byte[][] result;
	
	public Ex7_FileReader(File file, int partIndex, long startPosition, int readSize) {
		this.file = file;
		this.partIndex = partIndex;
		this.startPosition = startPosition;
		this.readSize = readSize;
	}

	@Override
	public void run() {
		try {
			RandomAccessFile raf = new RandomAccessFile(this.file, "r");
			raf.seek(startPosition);
			byte[] buffer = new byte[readSize];
			raf.readFully(buffer);
			result[partIndex] = buffer;
			raf.close();
			
			System.out.println("Reader số " + this.partIndex + " đọc thành công");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
