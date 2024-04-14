package java_67;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // lưu ý :
//        Ms Windows: \ => \\ C:\\thư mục 1 \\ thư mục 2...

        File folder = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_69");
        File folder2 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_67");

        System.out.println("Check if the folder exists or not:" + folder.exists());
        System.out.println("Check if the folder2 exists or not:" + folder2.exists());


        // create folder
        // phuonwg thuc mkdir() => tao 1 thu muc
        File d1 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_67\\Driectory_1");
        d1.mkdir();

        // phuonwg thuc mkdirs() => tao nhieu thu muc
        File d2 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_67\\Driectory_1\\Driectory_2");
        d2.mkdir();

        // tao tap tin (Co phan mow rong : exe, .txt, .doc...)
        File file1 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_67\\Driectory_1\\vidu.txt");
        File file2 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_67\\Driectory_1\\vidu.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            // Không có quyền tạo tập tin
            // Ổ cứng bị đầy
            // Đường dẫn sai
            e.printStackTrace();
        }

    }
}
