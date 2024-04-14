package java_69;

import java.io.File;

public class ViDuXoaFile {
    public static void xoaFile(File fx){
        if (fx.isFile()){
            System.out.println("da xoa: "+ fx.getAbsolutePath());
            fx.delete();
        } else if (fx.isDirectory()) {
//            Lay cac file con
            File[] mangCon = fx.listFiles();
            for (File f : mangCon){
                // xoa cac file con
                System.out.println("da xoa: "+ fx.getAbsolutePath());
                xoaFile(f);
            }
//            xoa ban thanh thu muc sau khi da xoa cac file con
            fx.delete();
        }
    }
}
