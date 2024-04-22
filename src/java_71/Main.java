package java_71;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
       try {
           PrintWriter pw = new PrintWriter("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_71\\file.txt", "UTF-8");
           pw.println("hello, i'm nvl");
           pw.print("Data: ");
           pw.print(3.14);
           pw.println(" la so pi");

           Student st = new Student(10, "nvl");
           pw.println(st);

           pw.flush();
           pw.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
