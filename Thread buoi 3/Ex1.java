package exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//Viết chtrinh dùng FileInputStream và FileOutputStream để đọc nd từ 1 file và viết nó sang 1 file khác
public class Ex1 {
	public static void main(String[] args) throws IOException {
		
		InputStream istream = new FileInputStream("first_file.txt");
		int size = istream.available();
		byte[] buffer = new byte[size];
		istream.read(buffer, 0, size);
		
		try {
			FileOutputStream ostream = new FileOutputStream("target_file.txt");
			ostream.write(buffer, 0, size);
//			ostream.flush();
			System.out.println("File has been written");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error creating file");
			
		}
		
		
	}
}
