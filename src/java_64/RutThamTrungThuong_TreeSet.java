package java_64;

import java.util.*;

public class RutThamTrungThuong_TreeSet {
    // sap xep theo tang dan
    Set<String> thungPhieuDuThuong = new TreeSet<>();

    public RutThamTrungThuong_TreeSet() {
    }
    public boolean addPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }
    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }
    public void xoaAllPhieu(){
        this.thungPhieuDuThuong.clear();
    }
    public int laySoLuong(){
        return this.thungPhieuDuThuong.size();
    }

    public String rutMotPhieu(){
        String result = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size()-1);
        result = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return result;
    }
    public void inTatCa() {
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }
    public static void main(String[] args) {
        try {
            RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
            Scanner sc = new Scanner(System.in);
            int luaChon = 0;
            do {
                System.out.println("--------------------------------------");
                System.out.println("MENU: ");
                System.out.println("1. Thêm mã số dự thưởng.");
                System.out.println("2. Xóa mã số dự thưởng.");
                System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
                System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
                System.out.println("5. Số lượng phiếu dự thưởng.");
                System.out.println("6. Rút thăm trúng thưởng.");
                System.out.println("7. In ra tất cả các phiếu.");
                System.out.println("0. Thoát khỏi chương trình");
                luaChon = sc.nextInt();
                sc.nextLine();

                if(luaChon==1 || luaChon==2||luaChon==3) {
                    System.out.println("Nhập vào mã phiếu dự thưởng: ");
                    String giaTri = sc.nextLine();
                    if (luaChon==1){
                        rt.addPhieu(giaTri);
                    } else if (luaChon ==2) {
                        rt.xoaPhieu(giaTri);
                    } else {
                        System.out.println("Kết quả kiểm tra: "+rt.kiemTraPhieuTonTai(giaTri));
                    }
                } else if (luaChon == 4) {
                    rt.xoaAllPhieu();
                }else if (luaChon == 5) {
                    System.out.println("So luong phieu la: " + rt.laySoLuong());
                } else if (luaChon == 6) {
                    System.out.println("Mã số trúng thưởng là: " + rt.rutMotPhieu());
                } else if (luaChon == 7) {
                    System.out.println("Các mã phiếu dự thưởng là: ");
                    rt.inTatCa();
                }
            }while (luaChon != 0);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
