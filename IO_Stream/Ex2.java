package exercises;

import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        try (
            // Đọc dữ liệu từ bàn phím
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            // Ghi dữ liệu vào file "output.txt"
            BufferedWriter writer = new BufferedWriter(new FileWriter("a2.txt"))
        ) {
            System.out.println("Nhập dữ liệu (gõ 'exit' để kết thúc):");

            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();  // Xuống dòng
            }

            System.out.println("Dữ liệu đã được ghi vào file output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
