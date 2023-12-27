package java_45;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay( HangSanXuat hangSanXuat,String loaiNhienLieu) {
        super("Máy bay", hangSanXuat);
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
        return 700;
    }

    public void catCanh(){
        System.out.println("Cất cánh máy bay...");
    }
    public void haCanh(){
        System.out.println("Hạ cánh...");
    }
}
