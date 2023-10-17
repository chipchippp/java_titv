package java_24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n >0");
         n = sc.nextInt();

         String nhiPhan = "";

         while (n>0){
             nhiPhan = (n % 2) + nhiPhan;
             n = n/2;
             System.out.println("so he nhi phan la: " +nhiPhan);
         }
        System.out.println("so he nhi phan la: " +nhiPhan);

        /*
        chia lien tuc cho 2 va lay phan du
        dao nguoc chuoi => kqua

        vd: 10:2 = 5 du 0
            5:2 = 2 du 1
            2:2 = 1 du 0
            1:2 = 0 du 1

            1010
         */

    }
}
