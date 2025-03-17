package exercises;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex4 {
	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers = List.of(2, 4, 7, 87, 9, 81, 20, 30);
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("target_file.txt"))){
			
			dos.writeInt(numbers.size());
			for(int number: numbers) {
				dos.writeInt(number);
			}
			System.out.println("Write successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("target_file.txt"));
			List<Integer> num2 = new ArrayList<Integer>();
			
			int size = dis.readInt();
			for(int i = 0; i < size; i++) {
				num2.add(dis.read());
			}
			System.out.println(num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
