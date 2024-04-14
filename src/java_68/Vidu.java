package java_68;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("Nhap ten File: ");
        String tenFile = sc.nextLine();
        ViduFile vdf = new ViduFile(tenFile);
        do {
            System.out.println("MENU ---------- ");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát chương trình.");
            luaChon = sc.nextInt();
            switch (luaChon){
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(vdf.kiemTraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                   break;
                case 5:
                    vdf.inTen();
                    break;
                case 6:
                  vdf.KiemTraLaThucMucHoacTapTin();
                  break;
                case 7:
                    vdf.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                    break;
                default:
                    break;
            }
            sc.nextLine();
        }while (luaChon!=0);
    }
}
