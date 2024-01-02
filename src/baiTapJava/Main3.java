package baiTapJava;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bất kì: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a+b>c && b+c>a && a+c>b){
            System.out.println("tam giac co 3 canh");
        } else {
            System.out.println("tam giac sai");
        }

    }
}
