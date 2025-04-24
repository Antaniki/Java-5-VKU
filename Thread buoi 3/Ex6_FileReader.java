package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex6_FileReader implements Runnable{
	
	File file;
	String content;
	int orderNumber;
	BufferedReader reader;
	
	public Ex6_FileReader(File file, int orderNumber) throws FileNotFoundException {
		this.file = file;
		this.content ="";
		this.orderNumber = orderNumber;
		reader = new BufferedReader(new FileReader(file)); 
	}

	@Override
	public void run() {
		try {	
			String line;
			line = reader.readLine();
			while(line != null) {
				this.content += line;
				line = reader.readLine();
				this.content += "\n";
				System.out.println("Doc xing 1 dong");
			}
			Thread.sleep(500);
			this.reader.close();
			System.out.println(this.file.getName() + " đã đọc xong!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
}
