package java_45;

public class XeDap extends PhuongTienDiChuyen{

    public XeDap(HangSanXuat hangSanXuat) {
        super("xe dap", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
