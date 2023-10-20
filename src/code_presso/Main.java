package code_presso;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a++);
        System.out.println(b--);
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(--b);

        double pi = 3.14592;
        int n;

        n = (int) pi;
        System.out.println(n);

        String name1 = "a";
        String name2 =  new String("a");
        System.out.println(name1.equals(name2));
    }
}
