package java_45;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String layTenHangSanXuat(){
        return this.hangSanXuat.getName();
    }

    public void batDau(){
        System.out.println("Bắt Đầu....");
    }
    public void tangToc(){
        System.out.println("Tăng Tốc...");
    }
    public void dungLai(){
        System.out.println("Dừng lại...");
    }
    public abstract double layVanToc();
}
