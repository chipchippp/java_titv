package exercise2;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 con so nguyen");

        n = sc.nextInt();

        if (n >= 0){
            System.out.println(n +" la 1 so nguyen duong");
        } else {
            System.out.println(n +" la 1 so nguyen am");

        }
    }
}
