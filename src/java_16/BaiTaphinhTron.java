package java_16;

import java.util.Scanner;

public class BaiTaphinhTron {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        r = sc.nextDouble();

        // tinh chu vi
        chuVi = 2*Math.PI*r;
        System.out.println(" chu vi = " + chuVi);
        // làm tròn vd : 31.23213123 => 31
        System.out.println(" chu vi = " + Math.round(chuVi));
        //vd : 31.23213123 => 31.23
        System.out.println(" chu vi = " + Math.round(chuVi*100.0)/100.0);


        // tinh dien tich
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("dien tich = " + dienTich);
        System.out.println(" chu vi = " + Math.round(dienTich));
        System.out.println(" chu vi = " + Math.round(dienTich*100.0)/100.0);


    }
}
