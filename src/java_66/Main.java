package java_66;

public class Main {
    public static void main(String[] args) {
        Box b = new Box(15);

        System.out.println("gia tri: "+b.getValue());
        //		Box box = new Box(15.5); => Báo lỗi
//		Box box = new Box("Mười lăm")=> Báo lỗi
    }
}
