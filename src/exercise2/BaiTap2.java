package exercise2;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 con so");
        n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;

            case 3:
                System.out.println("Ba");
                break;

            case 4:
                System.out.println("Bon");
                break;

            case 5:
                System.out.println("Nam");
                break;

            case 6:
                System.out.println("Sau");
                break;

            case 7:
                System.out.println("Bay");
                break;

            default:
                System.out.println("hay nhap 1-7");
        }
    }
}
