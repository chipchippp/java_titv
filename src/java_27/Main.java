package java_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("nhap vao so nguyen n: ");
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("nhap du lieu khong dung");
        } finally {
            System.out.println("finally");

        }

        
        System.out.println("giá trị nhập là: " +n);
        System.out.println("ket thuc chuong trình");
    }
}
