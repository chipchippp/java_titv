package java_59;

public class Main {
    public static void main(String[] args) {
        ThoiKhoaBieu tk = new ThoiKhoaBieu(Day.Monday,"Toan, ly, hoa");
        ThoiKhoaBieu tk2 = new ThoiKhoaBieu(Day.Tueday,"Su, Van, Dia");
        ThoiKhoaBieu tk3 = new ThoiKhoaBieu(Day.Wednesday,"GD, Sinh, Ly");
        ThoiKhoaBieu tk4 = new ThoiKhoaBieu(Day.Tueday,"Tin hoc, TD, Dia");

        System.out.println(tk4);

        int x = Thang.Tháng_hai.soNgay();
        System.out.println(x);
    }
}
