package java_44;

public class HinhCN extends Hinh{
    private double chieuRong, chieuCao;

    public HinhCN(ToaDo toaDo,double chieuRong, double chieuCao) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return chieuRong*chieuCao;
    }
}
