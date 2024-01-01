package java_49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("------");

        // Hàm length() => lấy độ dài chuỗi
        System.out.println(s.length());
        int doDai = s.length();

        // Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
        for (int i = 0; i<doDai; i++){
            System.out.println("Vi tri: " +i+" la: "+s.charAt(i));
        }

        // Get chars (vitri bat dau vitri ket thuc)
        //mảng data , vitri bắt đầu lưu cuẩ mảng
        char[] arrayChar = new char[7];
        s.getChars(0, 4, arrayChar, 0);
        for (int i = 0; i < arrayChar.length; i++){
            System.out.println("giá trị của mảng tại "+i+" là "+arrayChar[i]);
        }
        // getbytes => có 3 cách, lấy ra giá trị của các ký tự
        byte[] arrByte = s.getBytes();
        for (byte b : arrByte){
            System.out.println(b);
        }
    }
}
