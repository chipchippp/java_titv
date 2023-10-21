package code_presso;

public class Loop2 {
    public static void main(String[] args) {
        String[] orderList  = {"order_1", "order_2", "order_3"};
        String[] processList = {"checking", "cooking", "packing", "delivering"};

        for (String order : orderList){
            for (String process : processList){
                System.out.println(order + " is in " + process + " stage.");
            }
            System.out.println();
        }
    }
}
