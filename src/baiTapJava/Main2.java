package baiTapJava;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bất kì: ");
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
            default:
                System.out.println("nhap sai!!");
        }
    }
}
