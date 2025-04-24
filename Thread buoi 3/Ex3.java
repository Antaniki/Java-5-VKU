package exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Ex3 {
	public static void main(String[] args) throws IOException{
		int count = 0;
		try(
//			FileReader read = new FileReader("first_file.txt");
			BufferedReader read = new BufferedReader(new FileReader("first_file.txt"));
			) {
			String line;
			while((line = read.readLine()) != null) {
				count++;
			}
			read.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("So dong trong file la: " + count);
		}
	}
}
