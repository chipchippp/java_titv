package java_66;

public class Main2 {
    public static void main(String[] args) {
        Box2 box =new Box2<Integer>(15);
        System.out.println("gia tri: "+box.getValue());

        Box2 box2 =new Box2<String>("hello nvl");
        System.out.println("gia tri: "+box2.getValue());

        Box2 box3 =new Box2<Double>(15.5);
        System.out.println("gia tri: "+box3.getValue());

    }
}
