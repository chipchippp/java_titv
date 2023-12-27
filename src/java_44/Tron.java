package java_44;

public class Tron extends Hinh{
    private double r;

    public Tron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*r*r;
    }
}
