package baiTapJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bất kì: ");
        n = sc.nextInt();

        if (n > 0){
            System.out.println("Đây là số nguyên dương");
        } else {
            System.out.println("Đây là số nguyên âm");

        }

    }
}
