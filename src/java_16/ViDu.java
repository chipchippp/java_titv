package java_16;

import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap vao so a: ");
        b = sc.nextDouble();

        // ham tri tuyet doi
        System.out.println("|a| = " + Math.abs(a));

        // tim min
        System.out.println("min (a, b) = " + Math.min(a, b));

        // tim max
        System.out.println("max (a, b) = " + Math.max(a, b));

        // ham tim ceil
        System.out.println("ceil (a, b) = " + Math.ceil(a));

        // ham floor
        System.out.println("floor(a) = " +Math.floor(a));

        // can bac 2 sqrt
        System.out.println("sqrt(a) = " +Math.sqrt(a));

        // ham tinh a^b
        System.out.println("a^b = " + Math.pow(a, b));
    }
}
