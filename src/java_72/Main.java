package java_72;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\APTECH2210A\\SEM2\\JAVA-SEM2\\java_titv\\java_titv\\src\\java_72\\file.txt");
        // c1
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while (true){
//                line = br.readLine();
//                if (line==null){
//                    break;
//                } else {
//                    System.out.println(line);
//                }
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }


        // c2
        try{
            List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
            for (String line : allText
                 ) {
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
