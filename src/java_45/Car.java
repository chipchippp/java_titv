package java_45;

public class Car extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public Car(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Car", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 200;
    }
}
