package java_45;

public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hãng 1", "VN");
        HangSanXuat h2 = new HangSanXuat("Hãng 2", "US");
        HangSanXuat h3 = new HangSanXuat("Hãng 3", "Japan");

        MayBay p1 = new MayBay(h1, "Xăng");
        PhuongTienDiChuyen p2 = new Car(h2, "Xăng");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lấy tên hãng sản xuất :");
        System.out.println("p1 : "+ p1.layTenHangSanXuat());
        System.out.println("p2 : "+ p2.layTenHangSanXuat());
        System.out.println("p3 : "+ p3.layTenHangSanXuat());

//        System.out.println("Bắt Đầu");
        p2.batDau();

        System.out.println("Lấy vận tốc");
        System.out.println("p1 : "+ p1.layVanToc());
        System.out.println("p2 : "+ p2.layVanToc());
        System.out.println("p3 : "+ p3.layVanToc());

//        System.out.println("Tăng Tốc: ");
        p1.tangToc();

//        System.out.println("Cất cánh: ");
        p1.catCanh();

//        System.out.println("Hạ cánh: ");
        p1.haCanh();

//        System.out.println("Dừng lại: ");
        p1.dungLai();
    }
}
