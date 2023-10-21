package code_presso;

public class SwitchCase {
    public static void main(String[] args) {
       String membership = "Gold";
       double discountRate = 0.0;
       int coupons = 0;

       switch (membership){
           case "VIP":
               discountRate = 0.2;
               coupons = 5;
               break;
           case "VIPP":
               discountRate = 0.1;
               coupons = 4;
               break;
           case "Gold":
               discountRate = 0.0;
               coupons = 3;
               break;
           default:
               discountRate = 0.0;
               coupons = 0;
       }
        System.out.println(discountRate);
        System.out.println(coupons);

        String s1 = "hello ";
        String s2 = "world";
        String s3;

        s3 = s1 +s2;
        System.out.println(s3);
    }
}
