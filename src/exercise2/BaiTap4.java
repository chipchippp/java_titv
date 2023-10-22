package exercise2;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        a = sc.nextFloat();
        System.out.println("Nhap b");
        b = sc.nextFloat();
        System.out.println("Nhap c");
        c = sc.nextFloat();

        if (a*a + b*b == c*c||
                Math.pow(b,2)+Math.pow(c,2) == Math.pow(a,2) ||
                Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) ){
            System.out.println(Math.pow(a,2) + " + " + Math.pow(b,2) + " + " + " = " + Math.pow(c,2));
            System.out.println("abc la canh goc vuong cua tam giac");
        } else {
            System.out.println(Math.pow(a,2) + " + " + Math.pow(b,2) + " + " + " = " + Math.pow(c,2));
//            System.out.println("abc khong phai la canh goc vuong cua tam giac");
        }
    }
}
