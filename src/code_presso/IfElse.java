package code_presso;

public class IfElse {
    public static void main(String[] args) {
        String membership = "VIP";
        double discountRate = 0.0;
        double price = 10000.0;

        if (membership.equals("VIP")){
            discountRate = 0.2;
        } else {
            discountRate = 0.1;
        }

        price = price - (price * discountRate);
        System.out.println(price);
    }
}
