package java_56;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Xin chào các bạn, tui là Peter!";
        String []a = s.split(" ");
        System.out.println("a = " + Arrays.toString(a));

        String []b = s.split(",");
        System.out.println("b = " + Arrays.toString(b));

        String s2 = "Xin chào, mình là Peter. Mình là lập trình viên!";
        String[] c = s2.split("\\.|\\,");
        System.out.println("C = "+Arrays.toString(c));

        String s3 = "nguyen van a";
        String[] d = s3.split(" ");
        System.out.println("ten: "+d[d.length-1]);
    }
}
