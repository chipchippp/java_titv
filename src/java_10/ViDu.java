package java_10;

public class ViDu {

    private Integer million = 10000;
    private Integer millionWithUnderscore = 10_000;

    public static void main(String[] args) {




        int a = 100;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Ép liểu Ngầm định
        float c = a;
        float d = b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //Ép kiểu tường minh
        float e = 3.5F;
        float f = 9.5F;

        System.out.println("e = " + e);
        System.out.println("f = " + f);


        int g = (int) e;
        int h = (int) f;

        System.out.println("g = " + g);
        System.out.println("h = " + h);


        // Ép kiểu giữa biến nguyên thủy và đối tượng
        int x = new Integer(32);
        System.out.println("x = " + x);

    }
}
