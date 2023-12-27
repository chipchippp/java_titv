package java_43;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.timMin(4,6));
        System.out.println(myMath.timMin(4.4, 3.6));

        System.out.println(myMath.tinhTong(5, 6));
        double[] arr = new double[]{1,2,3,4,5};
        System.out.println(myMath.tinhTong(arr));
    }
}
