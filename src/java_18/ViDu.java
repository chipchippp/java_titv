package java_18;

import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {

        try{
            double a, b, c, x1,x2, delta;
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập a = ");
            a = sc.nextDouble();
            System.out.println("nhập b = ");
            b = sc.nextDouble();
            System.out.println("nhập c = ");
            c = sc.nextDouble();

            delta = Math.pow(b, 2) - 4 * a * c;
            if (a == 0) {
                System.out.println("Nhập dữ liệu sai!");
            } else{
                if (delta < 0){
                    System.out.println("pt vô số nghiêm");
                } else if (delta == 0) {
                    x1 = -b/ (2 * a);
                    System.out.println("pt có nghiệm là" +x1 );
                } else {
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("pt có nghiệm x1 là " +x1);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("pt có nghiệm x1 là " +x2);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
