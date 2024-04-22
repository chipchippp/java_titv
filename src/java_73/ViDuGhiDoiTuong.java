package java_73;

import java.io.*;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_73\\file.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            Student st = new Student("01", "nvl", 2004, 8.9);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
