package code_presso;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i<=10; i++){
            System.out.println(i + ". hehe");
        }

        int sum = 0;

        for (int i = 1; i<=4; i++){
            System.out.println(sum + " + " + i + " = " + (sum + i));
            sum += i;
        }



        for (int i = 1; i <= 10; i+=2){
            System.out.println(i);
        }

        String text = "CODEPRESSO";

        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
        System.out.println(text.charAt(3));


        for (int i = text.length() - 1; i >= 0; i--){
            System.out.println(text.charAt(i));
        }
    }
}
