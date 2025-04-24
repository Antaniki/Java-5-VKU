package exercises;

import java.io.File;

public class Ex5 {
	public static void main(String[] args) {
		File folder = new File(".");
		File[] files = folder.listFiles();
		
		if(files != null) {
			System.out.println("List file:");
			for (File file : files) {
				if(file.isFile()) {
					System.out.println(file.getName());
				}
			}
		}else {
			System.out.println("Empty folder!");
		}
	}
}
