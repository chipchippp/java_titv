package java_68;

import java.io.File;

public class ViduFile {
    File file;

    public ViduFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi() {
        // Kiểm tra file có thể thực thi
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        // Kiểm tra file có thể đọc
        return this.file.canRead();
    }

    public boolean kiemTraGhi() {
        // Kiểm tra file có thể ghi
        return this.file.canWrite();
    }
    public  void  inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public  void  inTen(){
        System.out.println(this.file.getName());
    }
    public  void KiemTraLaThucMucHoacTapTin(){
        if (this.file.isDirectory()){
            System.out.println("Day la thu muc");
        } else if (this.file.isFile()){
            System.out.println(" day la tap tin");
        }
    }
    public  void inDanhSachCacFileCon(){
        if (this.file.isDirectory()){
            System.out.println("Day la thu muc");
            File[] mangCon = this.file.listFiles();
            for (File file: mangCon){
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()){
            System.out.println(" day la tap tin, k co du lieu ben trong");
        }
    }
    public void inCayThuMuc() {
        this.inChiTietCayThucMuc(this.file, 1);
    }
    public void inChiTietCayThucMuc(File f, int bac) {
//		System.out.print("|");
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThucMuc(fx, bac + 1);
            }
        }
    }
}
