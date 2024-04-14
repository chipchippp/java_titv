package java_69;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // Su dung class File xoa tap tin hoac thu muc
        File f0 = new File("/Users/mac/eclipse-workspace/Java_69/F0");
        File f0_1 = new File("/Users/mac/eclipse-workspace/Java_69/F0_1");
        File f_vidu = new File("/Users/mac/eclipse-workspace/Java_69/ViDu.txt");
        /*
		f0.deleteOnExit(); // Xoa khong duoc vi co chua thu muc va tap tin
		f0_1.deleteOnExit(); // Xoa duoc vi la thu muc rong
		f_vidu.deleteOnExit(); // Xoa duoc vi la tap tin
		System.out.println(f0_1.delete());

		ViDuXoaFile.xoaFile(f0);
		*/

        // su dung class file xoa tap tin va thu muc

        Path p_vidu = f_vidu.toPath();
        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();

        try {
            //Files.deleteIfExists(p0);
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
