package exercise;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m, n");
        m = sc.nextInt();  // chieu cao
        n = sc.nextInt();  // chieu rong

        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
