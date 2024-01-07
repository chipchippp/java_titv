package java_65;

import java.util.*;

public class TuDien {
    private Map<String, String> data = new TreeMap<>();
    public String themTu(String tuKhoa, String yNghia){
        return this.data.put(tuKhoa, yNghia);
    }
    public String xoaTu(String tuKhoa){
        return this.data.remove(tuKhoa);
    }
    public String traTu(String tuKhoa){
        String yNghia = this.data.get(tuKhoa);
        return yNghia;
    }
    public void inDanhSachTuKhoa(){
        Set<String> tapHopTuKHoa = this.data.keySet();
        System.out.println(Arrays.toString(tapHopTuKHoa.toArray()));
    }
    public int laySoLuong(){
        return  this.data.size();
    }
    public void xoaAll(){
        this.data.clear();
    }
    public static void main(String[] args) {
        TuDien td = new TuDien();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("---------------");
            System.out.println("MENU ");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon==1){
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhập vào từ ý nghĩa: ");
                String yNghia = sc.nextLine();
                td.themTu(tuKhoa, yNghia);

            } else if (luaChon==2 || luaChon==3){
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                if (luaChon==2){
                    td.xoaTu(tuKhoa);
                    System.out.println("Bạn đã xóa từ thành công!!!");
                } else {
                    System.out.println("Ý nghĩa là: "+ td.traTu(tuKhoa));
                }


            }  else if (luaChon==4){
                System.out.println("Danh sách từ khóa: ");
                td.inDanhSachTuKhoa();
            } else if (luaChon==5){
                System.out.println("Số lượng từ là: "+td.laySoLuong());
            } else if (luaChon==6){
                td.xoaAll();
                System.out.println("Bạn đã xóa tất cả các từ khóa !!!");
            }
        }while (luaChon!=0);
    }
}
