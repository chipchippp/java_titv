package java_70;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static  void copyAll (File f1, File f2){
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
        if (f1.isDirectory()){
            File[] mangCon = f1.listFiles();
            for (File file : mangCon){
                File file_new = new File(f2.getAbsoluteFile()+ "/" +file.getName());
                copyAll(file, file_new);
            }
        }
    }
    public static void main(String[] args) {
        File f0 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_70\\File_0.txt");
        File f1 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_70\\File_1.txt");
        File f2 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_70\\File_2.txt");

        //1. Thay doi ten tap tin hoac thu muc
        // Su dung File de thay doi ten
//        f0.renameTo(f1);

        // Su dung Files de thay doi ten
//        try {
//            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        // 2. Di chuyen file
//        File f_2new = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_70\\F0\\File_1.txt");
//        try {
//            Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        // 3. copy file
        File f_0 = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_70\\F0");
        File f_0copy = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_70\\F0_Copy");
//        try {
//            Files.copy(f_0.toPath(), f_0copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        Main.copyAll(f_0, f_0copy);


    }
}
