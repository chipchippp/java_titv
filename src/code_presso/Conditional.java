package code_presso;

public class Conditional {
    public static void main(String[] args) {
        int age = 18;
        int price = 1000;
        if (age < 19){
            price = price - 2000;
        }
        System.out.println("age : " +age);
        System.out.println("price : " +price);


        String pass = "1234";
        String login = "failed";
        if (pass.equals("1234")){
            login = "success";
        }
        System.out.println(" login - " + login);


        boolean isSystemReady = true;
        if (isSystemReady){
            System.out.println("System is ready for use");
        }
    }
}
