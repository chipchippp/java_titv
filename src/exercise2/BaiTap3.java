package exercise2;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();

        if (a+b>c && b+c>a && c+a>b){
            System.out.println("abc la 3 canh cua 1 tam giac");
        } else {
            System.out.println("abc khong phai la canh cua 1 tam giac");
        }
    }
}
